package br.com.soctest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import br.com.soctest.factory.ConnectionFactory;
import br.com.soctest.model.ExameModel;
import br.com.soctest.model.PacienteExameModel;
import br.com.soctest.model.PacienteModel;
import br.com.soctest.model.TipoExameModel;

public class ExameDAO {
	Connection conn;
	PreparedStatement pstm = null;
	ResultSet rset = null;

	public void insertExame(ExameModel exame_param) {
		String sql = "INSERT INTO EXAME(protocolo,nome_medico,dt_exame,id_tip_exame)VALUES(?,?,?,?)";
		try {
			conn = ConnectionFactory.createConnectionToSQL();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, exame_param.getProtocolo());
			pstm.setString(2, exame_param.getNomeMedico());
			pstm.setDate(3, new java.sql.Date(exame_param.getDataExame().getTime()));
			pstm.setInt(4, exame_param.getTipoExame());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void insertExamePaciente(PacienteExameModel exame_param) {

		String sql = "INSERT INTO PACIENTE_X_EXAME(ID_PACIENTE,ID_EXAME)" + "VALUES(?,?)";
		try {
			conn = ConnectionFactory.createConnectionToSQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, exame_param.getId_paciente());
			pstm.setInt(2, exame_param.getId_exame());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void removeById(int exame_param) {

		String sql = "DELETE FROM EXAME WHERE ID = ?";

		try {
			conn = ConnectionFactory.createConnectionToSQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, exame_param);
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public ExameModel findById(int exame_param) {

		ExameModel exame = new ExameModel();

		String sql = "SELECT * FROM EXAME WHERE ID = ?";

		try {
			conn = ConnectionFactory.createConnectionToSQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, exame_param);

			rset = pstm.executeQuery();
			while (rset.next()) {

				exame.setProtocolo(rset.getString("protocolo"));
				exame.setNomeMedico(rset.getString("nome_medico"));
				exame.setDataExame(rset.getDate("dt_exame"));
				exame.setTipoExame(rset.getInt("id_tip_exame"));
			}
		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			try {
				if (rset != null) {
					rset.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return exame;
	}

	public PacienteExameModel findPacienteExameById(int id_param) {

		PacienteExameModel pacienteExame = new PacienteExameModel();

		String sql = "select *from PACIENTE_X_EXAME as pce "
				+ "  inner join paciente as paci on paci.id = pce.ID_PACIENTE"
				+ "  inner join exame as ex on ex.ID = pce.ID_EXAME"
				+ "  inner join TIPO_EXAME tpe on tpe.ID = ex.ID_TIP_EXAME" + "  where paci.id = ?";

		try {
			conn = ConnectionFactory.createConnectionToSQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id_param);
			rset = pstm.executeQuery();

			while (rset.next()) {

				pacienteExame.setId(rset.getInt("id"));
				pacienteExame.setId_exame(rset.getInt("id_exame"));
				pacienteExame.setDescExame(rset.getString("desc_exame"));
				pacienteExame.setId_paciente(rset.getInt("id_paciente"));
				pacienteExame.setNomePaciente(rset.getString("nome"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (rset != null) {
					rset.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return pacienteExame;
	}

	public void update(ExameModel exame_param) {

		String sql = "UPDATE EXAME SET protocolo = ?,nome_medico =?, dt_exame = ?, id_tip_exame = ?" + " WHERE"
				+ " id = ?";
		try {
			conn = ConnectionFactory.createConnectionToSQL();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, exame_param.getProtocolo());
			pstm.setString(2, exame_param.getNomeMedico());
			pstm.setDate(3, new java.sql.Date(exame_param.getDataExame().getTime()));
			pstm.setInt(4, exame_param.getTipoExame());
			pstm.setInt(5, exame_param.getId());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public List<ExameModel> getAllExames() {

		String sql = "SELECT *FROM EXAME";

		List<ExameModel> listExame = new ArrayList<ExameModel>();

		try {
			conn = ConnectionFactory.createConnectionToSQL();
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();

			while (rset.next()) {

				ExameModel exame = new ExameModel();
				exame.setProtocolo(rset.getString("protocolo"));
				exame.setNomeMedico(rset.getString("nome_medico"));
				exame.setDataExame(rset.getDate("dt_exame"));
				exame.setTipoExame(rset.getInt("id_tip_exame"));

				listExame.add(exame);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (rset != null) {
					rset.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return listExame;
	}

	public List<TipoExameModel> getAllTipoExame() {

		String sql = "SELECT *FROM TIPO_EXAME";

		List<TipoExameModel> listTipoExame = new ArrayList<TipoExameModel>();

		try {
			conn = ConnectionFactory.createConnectionToSQL();
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();

			while (rset.next()) {

				TipoExameModel tipoExame = new TipoExameModel();
				tipoExame.setId(rset.getInt("id"));
				tipoExame.setTipoEexame(rset.getString("tip_exame"));
				tipoExame.setDescricaoExame(rset.getString("desc_exame"));

				listTipoExame.add(tipoExame);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (rset != null) {
					rset.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return listTipoExame;
	}

	public TipoExameModel buscaTipoExameById(int id_param) {

		String sql = "SELECT *FROM TIPO_EXAME AS TPE WHERE TPE.ID = ?";

		TipoExameModel tipoExameById = new TipoExameModel();

		try {
			conn = ConnectionFactory.createConnectionToSQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id_param);
			rset = pstm.executeQuery();

			while (rset.next()) {

				tipoExameById.setId(rset.getInt("id"));
				tipoExameById.setTipoEexame(rset.getString("tip_exame"));
				tipoExameById.setDescricaoExame(rset.getString("desc_exame"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (rset != null) {
					rset.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return tipoExameById;
	}

	public List<PacienteExameModel> getAllPacienteExame() {

		String sql = "select *from PACIENTE_X_EXAME as pce "
				+ "  inner join paciente as paci on paci.id = pce.ID_PACIENTE"
				+ "  inner join exame as ex on ex.ID = pce.ID_EXAME"
				+ "  inner join TIPO_EXAME tpe on tpe.ID = ex.ID_TIP_EXAME";

		List<PacienteExameModel> listPacienteExame = new ArrayList<PacienteExameModel>();
		try {
			conn = ConnectionFactory.createConnectionToSQL();
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();

			while (rset.next()) {

				PacienteExameModel pacienteExame = new PacienteExameModel();

				pacienteExame.setId(rset.getInt("id"));
				pacienteExame.setId_exame(rset.getInt("id_exame"));
				pacienteExame.setDescExame(rset.getString("desc_exame"));
				pacienteExame.setId_paciente(rset.getInt("id_paciente"));
				pacienteExame.setNomePaciente(rset.getString("nome"));

				listPacienteExame.add(pacienteExame);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (rset != null) {
					rset.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return listPacienteExame;
	}

}
