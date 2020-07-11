package br.com.soctest.service;

import java.util.List;
import org.springframework.stereotype.Component;
import br.com.soctest.dao.ExameDAO;
import br.com.soctest.model.ExameModel;
import br.com.soctest.model.PacienteExameModel;
import br.com.soctest.model.TipoExameModel;
import br.com.soctest.util.StatusOper;

@Component
public class ExameService {
	ExameDAO exameDAO;

	public StatusOper insertExame(ExameModel exame_param) {
		exameDAO = new ExameDAO();
		exameDAO.insertExame(exame_param);
		return StatusOper.SUCESSO;

	}
	
	public StatusOper insertExamePaciente(PacienteExameModel exame_param) {
		exameDAO = new ExameDAO();
		exameDAO.insertExamePaciente(exame_param);
		return StatusOper.SUCESSO;

	}
	
	
	public ExameModel buscarPorId(int id_param) {
		exameDAO = new ExameDAO();
		ExameModel exameLocalizado = exameDAO.findById(id_param);
		if (exameLocalizado != null) {
			return exameLocalizado;
		}
		return null;
	}
	
	public PacienteExameModel buscarPacienteExameById(int id_param) {
		exameDAO = new ExameDAO();
		PacienteExameModel examePacienteLocalizado = exameDAO.findPacienteExameById(id_param);
		if (examePacienteLocalizado != null) {
			return examePacienteLocalizado;
		}
		return null;
	}
	
	public TipoExameModel buscarTipoExameById(int id_param) {
		exameDAO = new ExameDAO();
		TipoExameModel tipoExameLocalizado = exameDAO.buscaTipoExameById(id_param);
		if (tipoExameLocalizado != null) {
			return tipoExameLocalizado;
		}		return null;
	}

	public List<ExameModel> buscarTodos() {
		exameDAO = new ExameDAO();
		List<ExameModel> listaExames = exameDAO.getAllExames();
		return listaExames;
	}
	
	public List<TipoExameModel> buscarTodosTiposExame() {
		exameDAO = new ExameDAO();
		List<TipoExameModel> listaTipoExames = exameDAO.getAllTipoExame();
		return listaTipoExames;
	}
	
	public List<PacienteExameModel> buscarTodosPacienteExame() {
		exameDAO = new ExameDAO();
		List<PacienteExameModel> listaPacienteExames = exameDAO.getAllPacienteExame();
		return listaPacienteExames;
	}

	public StatusOper removerPorId(int id_param) {
		exameDAO = new ExameDAO();
		ExameModel exameLocalizado = buscarPorId(id_param);
		if (exameLocalizado != null) {
			exameDAO.removeById(id_param);
			return StatusOper.SUCESSO;
		}
		return StatusOper.FALHA;
	}

	public StatusOper updateExame(ExameModel exame_param) {
		exameDAO = new ExameDAO();
		exameDAO.update(exame_param);
		;
		return StatusOper.SUCESSO;

	}

}
