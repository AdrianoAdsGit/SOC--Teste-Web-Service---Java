package br.com.soctest.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import br.com.soctest.factory.ConnectionFactory;
import br.com.soctest.model.PacienteModel;

public class PacienteDAO {

	Connection conn;
	PreparedStatement pstm = null;
	ResultSet rset = null;

	public void save(PacienteModel paciente_param) {

		String sql = "INSERT INTO PACIENTE(nome,dt_nascimento,cpf,endereco,"
				+ "dt_cadastro,dt_alteracao,email,convenio,solic_exame,observacao)"
				+ "VALUES(?,?,?,?,?,?,?,?,?,?)";
		try {
			conn = ConnectionFactory.createConnectionToSQL();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, paciente_param.getNome());
			pstm.setDate(2, new java.sql.Date(paciente_param.getDataNascimento().getTime()));
			pstm.setString(3, paciente_param.getCpf());
			pstm.setString(4, paciente_param.getEndereco());
			pstm.setDate(5, new java.sql.Date(paciente_param.getDataCadastro().getTime()));
			pstm.setDate(6, new java.sql.Date(paciente_param.getDataAlteracao().getTime()));
			pstm.setString(7, paciente_param.getEmail());
			pstm.setString(8, paciente_param.getConvenio());
			pstm.setString(9, paciente_param.getSolicitacaoexame());
			pstm.setString(10, paciente_param.getObservacao());

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

	public void removeById(int idPaciente_param) {

		String sql = "DELETE FROM PACIENTE WHERE ID = ?";

		try {
			conn = ConnectionFactory.createConnectionToSQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, idPaciente_param);
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

	public PacienteModel findById(int idPaciente_param) {
		
		PacienteModel paciente = new PacienteModel();
		
		String sql = "SELECT * FROM PACIENTE WHERE ID = ?";

		try {
			conn = ConnectionFactory.createConnectionToSQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, idPaciente_param);
			
			rset = pstm.executeQuery();
			while (rset.next()) {

				paciente.setId(rset.getInt("id"));
				paciente.setNome(rset.getString("nome"));
				paciente.setDataNascimento(rset.getDate("dt_nascimento"));
				paciente.setCpf(rset.getString("cpf"));
				paciente.setEndereco(rset.getString("endereco"));
				paciente.setDataCadastro(rset.getDate("dt_cadastro"));
				paciente.setDataAlteracao(rset.getDate("dt_alteracao"));
				paciente.setEmail((rset.getString("email")));
				paciente.setConvenio((rset.getString("convenio")));
				paciente.setSolicitacaoexame(rset.getString("solic_exame"));
				paciente.setObservacao(rset.getString("observacao"));
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
		return paciente;
	}

	public void update( PacienteModel paciente_param) {		
		      
		String sql = "UPDATE PACIENTE SET nome = ?, dt_nascimento = ?, cpf = ? "
				+ ",endereco = ?, dt_Cadastro = ?, dt_Alteracao = ?, email = ?"
				+ " ,convenio =?, solic_exame = ?,observacao =? " + " WHERE" + " id = ?";
		try {
			conn = ConnectionFactory.createConnectionToSQL();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, paciente_param.getNome());
			pstm.setDate(2, new java.sql.Date(paciente_param.getDataNascimento().getTime()));
			pstm.setString(3, paciente_param.getCpf());
			pstm.setString(4, paciente_param.getEndereco());
			pstm.setDate(5, new java.sql.Date(paciente_param.getDataCadastro().getTime()));
			pstm.setDate(6, new java.sql.Date(paciente_param.getDataAlteracao().getTime()));
			pstm.setString(7, paciente_param.getEmail());
			pstm.setString(8, paciente_param.getConvenio());
			pstm.setString(9, paciente_param.getSolicitacaoexame());
			pstm.setString(10, paciente_param.getObservacao());
			pstm.setInt(11, paciente_param.getId());
						
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

	public List<PacienteModel> getAllPacientes() {

		String sql = "SELECT *FROM PACIENTE";

		List<PacienteModel> pacientesList = new ArrayList<PacienteModel>();

		try {
			conn = ConnectionFactory.createConnectionToSQL();
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();

			while (rset.next()) {

				PacienteModel paciente = new PacienteModel();

				paciente.setId(rset.getInt("id"));
				paciente.setNome(rset.getString("nome"));
				paciente.setDataNascimento(rset.getDate("dt_nascimento"));
				paciente.setCpf(rset.getString("cpf"));
				paciente.setEndereco(rset.getString("endereco"));
				paciente.setDataCadastro(rset.getDate("dt_cadastro"));
				paciente.setDataAlteracao(rset.getDate("dt_alteracao"));
				paciente.setEmail((rset.getString("email")));
				paciente.setConvenio((rset.getString("convenio")));
				paciente.setSolicitacaoexame(rset.getString("solic_exame"));
				paciente.setObservacao(rset.getString("observacao"));

				pacientesList.add(paciente);
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
		return pacientesList;
	}

}
