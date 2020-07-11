package br.com.soctest.service;

import java.util.List;
import org.springframework.stereotype.Component;
import br.com.soctest.dao.PacienteDAO;
import br.com.soctest.model.PacienteModel;
import br.com.soctest.util.StatusOper;

@Component
public class PacienteService {

	PacienteDAO cadastroPacienteDAO;

	public StatusOper insertPaciente(PacienteModel paciente_param) {
		cadastroPacienteDAO = new PacienteDAO();
		cadastroPacienteDAO.save(paciente_param);
		return StatusOper.SUCESSO;

	}

	public PacienteModel buscarPorId(int id_param) {
		cadastroPacienteDAO = new PacienteDAO();
		PacienteModel pacienteLocalizado = cadastroPacienteDAO.findById(id_param);
		if (pacienteLocalizado != null) {
			return pacienteLocalizado;
		}
		return null;
	}

	public List<PacienteModel> buscarTodos() {
		cadastroPacienteDAO = new PacienteDAO();
		List<PacienteModel> listaPacientes = cadastroPacienteDAO.getAllPacientes();
		return listaPacientes;
	}

	public StatusOper removerPorId(int id_param) {
		cadastroPacienteDAO = new PacienteDAO();
		PacienteModel pacienteLocalizado = buscarPorId(id_param);
		if (pacienteLocalizado != null) {
			cadastroPacienteDAO.removeById(id_param);
			return StatusOper.SUCESSO;
		}
		return StatusOper.FALHA;
	}

	public StatusOper updatePaciente(PacienteModel paciente_param) {
		cadastroPacienteDAO = new PacienteDAO();
		cadastroPacienteDAO.update(paciente_param);
		;
		return StatusOper.SUCESSO;

	}

}
