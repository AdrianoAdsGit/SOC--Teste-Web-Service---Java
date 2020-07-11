package br.com.soctest.endpoint;

import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import br.com.soctest.DeleteExameRequest;
import br.com.soctest.DeleteExameResponse;
import br.com.soctest.DeletePacienteRequest;
import br.com.soctest.DeletePacienteResponse;
import br.com.soctest.ExameDetail;
import br.com.soctest.GetAllExameRequest;
import br.com.soctest.GetAllExameResponse;
import br.com.soctest.GetAllPacienteExameRequest;
import br.com.soctest.GetAllPacienteExameResponse;
import br.com.soctest.GetAllPacienteRequest;
import br.com.soctest.GetAllPacienteResponse;
import br.com.soctest.GetAllTipoExameRequest;
import br.com.soctest.GetAllTipoExameResponse;
import br.com.soctest.GetExameByIdRequest;
import br.com.soctest.GetExameByIdResponse;
import br.com.soctest.GetPacienteByIdRequest;
import br.com.soctest.GetPacienteByIdResponse;
import br.com.soctest.GetPacienteExameByIdRequest;
import br.com.soctest.GetPacienteExameByIdResponse;
import br.com.soctest.GetTipoExameByIdRequest;
import br.com.soctest.GetTipoExameByIdResponse;
import br.com.soctest.InsertExameRequest;
import br.com.soctest.InsertExameResponse;
import br.com.soctest.InsertPacienteExameDetail;
import br.com.soctest.InsertPacienteExameRequest;
import br.com.soctest.InsertPacienteExameResponse;
import br.com.soctest.InsertPacienteRequest;
import br.com.soctest.InsertPacienteResponse;
import br.com.soctest.PacienteDetail;
import br.com.soctest.PacienteExameDetail;
import br.com.soctest.Status;
import br.com.soctest.TipoExameDetail;
import br.com.soctest.UpdateExameRequest;
import br.com.soctest.UpdateExameResponse;
import br.com.soctest.UpdatePacienteRequest;
import br.com.soctest.UpdatePacienteResponse;
import br.com.soctest.exception.PessoaExameNotFoundException;
import br.com.soctest.model.ExameModel;
import br.com.soctest.model.PacienteExameModel;
import br.com.soctest.model.PacienteModel;
import br.com.soctest.model.TipoExameModel;
import br.com.soctest.service.ExameService;
import br.com.soctest.service.PacienteService;

@Endpoint
public class PacienteExameEndPoint {

	@Autowired
	PacienteService servicePaciente;

	@Autowired
	ExameService serviceExame;

	@PayloadRoot(namespace = "http://soctest.com.br", localPart = "GetPacienteByIdRequest")
	@ResponsePayload
	public GetPacienteByIdResponse processDetailPacienteResponse(@RequestPayload GetPacienteByIdRequest req)
			throws Exception {
		PacienteModel pacienteLocalizado = servicePaciente.buscarPorId(req.getId());
		if (pacienteLocalizado == null) {
			throw new PessoaExameNotFoundException("Paciente não Encontrado. " + req.getId());
		}
		return convertToGetPacienteResponse(pacienteLocalizado);
	}

	@PayloadRoot(namespace = "http://soctest.com.br", localPart = "GetAllPacienteRequest")
	@ResponsePayload
	public GetAllPacienteResponse processAllPessoaRequest(@RequestPayload GetAllPacienteRequest req) {
		List<PacienteModel> listPaciente = servicePaciente.buscarTodos();
		return convertToGetAllPacienteResponse(listPaciente);
	}

	@PayloadRoot(namespace = "http://soctest.com.br", localPart = "GetAllPacienteExameRequest")
	@ResponsePayload
	public GetAllPacienteExameResponse processAllPessoaExameRequest(@RequestPayload GetAllPacienteExameRequest req) {
		List<PacienteExameModel> listPacienteExame = serviceExame.buscarTodosPacienteExame();
		return convertToGetAllPacienteExameResponse(listPacienteExame);
	}

	@PayloadRoot(namespace = "http://soctest.com.br", localPart = "GetPacienteExameByIdRequest")
	@ResponsePayload
	public GetPacienteExameByIdResponse processPessoaExameByIdRequest(@RequestPayload GetPacienteExameByIdRequest req) {
		PacienteExameModel pacienteExameById = serviceExame.buscarPacienteExameById(req.getId());
		return convertToGetPacienteExameByIdResponse(pacienteExameById);
	}

	@PayloadRoot(namespace = "http://soctest.com.br", localPart = "GetTipoExameByIdRequest")
	@ResponsePayload
	public GetTipoExameByIdResponse processTipoExameByIdRequest(@RequestPayload GetTipoExameByIdRequest req) {
		TipoExameModel tipoExameById = serviceExame.buscarTipoExameById(req.getId());
		return convertToGetTipoExameByIdResponse(tipoExameById);
	}

	@PayloadRoot(namespace = "http://soctest.com.br", localPart = "GetAllTipoExameRequest")
	@ResponsePayload
	public GetAllTipoExameResponse processAllTipoExameRequest(@RequestPayload GetAllTipoExameRequest req) {
		List<TipoExameModel> listTipoExame = serviceExame.buscarTodosTiposExame();
		return convertToGetAllTipoExameResponse(listTipoExame);
	}

	@PayloadRoot(namespace = "http://soctest.com.br", localPart = "DeletePacienteRequest")
	@ResponsePayload
	public DeletePacienteResponse removePacienteRequest(@RequestPayload DeletePacienteRequest req) {
		DeletePacienteResponse resp = new DeletePacienteResponse();
		resp.setStatus(convertStatusSoap(servicePaciente.removerPorId(req.getId())));
		return resp;
	}

	@SuppressWarnings("unused")
	private br.com.soctest.Status convertStatusSoap(br.com.soctest.util.StatusOper statusService) {
		if (statusService == br.com.soctest.util.StatusOper.FALHA) {
			return br.com.soctest.Status.FALHA;
		}
		return br.com.soctest.Status.SUCESSO;
	}

	@PayloadRoot(namespace = "http://soctest.com.br", localPart = "InsertPacienteRequest")
	@ResponsePayload
	public InsertPacienteResponse insertPacienteRequest(@RequestPayload InsertPacienteRequest req) {
		InsertPacienteResponse responseInsert = new InsertPacienteResponse();
		responseInsert.setStatus(
				convertStatusSoap(servicePaciente.insertPaciente(convertToPacienteInsert(req.getPacienteDetail()))));
		return responseInsert;
	}

	@PayloadRoot(namespace = "http://soctest.com.br", localPart = "InsertPacienteExameRequest")
	@ResponsePayload
	public InsertPacienteExameResponse insertPacienteExameRequest(@RequestPayload InsertPacienteExameRequest req) {
		InsertPacienteExameResponse responseInsert = new InsertPacienteExameResponse();
		responseInsert.setStatus(convertStatusSoap(serviceExame.insertExamePaciente(convertPacienteExameInsert(req.getInsertPacienteExameDetail()))));
		return responseInsert;
	}

	@PayloadRoot(namespace = "http://soctest.com.br", localPart = "UpdatePacienteRequest")
	@ResponsePayload
	public UpdatePacienteResponse updatePessoaRequest(@RequestPayload UpdatePacienteRequest req) {
		UpdatePacienteResponse responseUpdate = new UpdatePacienteResponse();
		responseUpdate.setStatus(
				convertStatusSoap(servicePaciente.updatePaciente(convertToPacienteInsert(req.getPacienteDetail()))));
		return responseUpdate;
	}

	@PayloadRoot(namespace = "http://soctest.com.br", localPart = "GetExameByIdRequest")
	@ResponsePayload
	public GetExameByIdResponse processDetailExameRespnse(@RequestPayload GetExameByIdRequest req) throws Exception {
		ExameModel exameLocalizado = serviceExame.buscarPorId(req.getId());
		if (exameLocalizado == null) {
			throw new PessoaExameNotFoundException("Exame não Encontrado. " + req.getId());
		}
		return convertToGetExameResponse(exameLocalizado);
	}

	private GetExameByIdResponse convertToGetExameResponse(ExameModel exame_param) {
		GetExameByIdResponse getExameResponse = new GetExameByIdResponse();
		getExameResponse.setExameDetail(convertToExame(exame_param));
		return getExameResponse;
	}

	@PayloadRoot(namespace = "http://soctest.com.br", localPart = "GetAllExameRequest")
	@ResponsePayload
	public GetAllExameResponse processAllExameRequest(@RequestPayload GetAllExameRequest req) {
		List<ExameModel> listExame = serviceExame.buscarTodos();
		return convertToGetAllExameResponse(listExame);
	}

	@PayloadRoot(namespace = "http://soctest.com.br", localPart = "DeleteExameRequest")
	@ResponsePayload
	public DeleteExameResponse removeExameRequest(@RequestPayload DeleteExameRequest req) {
		DeleteExameResponse resp = new DeleteExameResponse();
		resp.setStatus(convertStatusSoap(serviceExame.removerPorId(req.getId())));
		return resp;
	}

	@PayloadRoot(namespace = "http://soctest.com.br", localPart = "InsertExameRequest")
	@ResponsePayload
	public InsertExameResponse insertExamesRequest(@RequestPayload InsertExameRequest req) {
		InsertExameResponse responseInsert = new InsertExameResponse();
		responseInsert
				.setStatus(convertStatusSoap(serviceExame.insertExame(convertToExameInsert(req.getExameDetail()))));
		return responseInsert;
	}

	@PayloadRoot(namespace = "http://soctest.com.br", localPart = "UpdateExameRequest")
	@ResponsePayload
	public UpdateExameResponse updateExameRequest(@RequestPayload UpdateExameRequest req) {
		UpdateExameResponse responseUpdate = new UpdateExameResponse();
		responseUpdate
				.setStatus(convertStatusSoap(serviceExame.updateExame(convertToExameInsert(req.getExameDetail()))));
		return responseUpdate;
	}

	private GetAllTipoExameResponse convertToGetAllTipoExameResponse(List<TipoExameModel> tpexame_param) {
		GetAllTipoExameResponse resp = new GetAllTipoExameResponse();
		tpexame_param.stream().forEach(c -> resp.getTipoExameDetail().add(convertToTipoExame(c)));

		return resp;
	}

	private GetAllPacienteExameResponse convertToGetAllPacienteExameResponse(List<PacienteExameModel> paciente_param) {
		GetAllPacienteExameResponse resp = new GetAllPacienteExameResponse();
		paciente_param.stream().forEach(c -> resp.getPacienteExameDetail().add(convertToPacienteExame(c)));

		return resp;
	}

	private GetTipoExameByIdResponse convertToGetTipoExameByIdResponse(TipoExameModel paciente_param) {
		GetTipoExameByIdResponse resp = new GetTipoExameByIdResponse();
		resp.setTipoExameDetail(convertToTipoExame(paciente_param));
		return resp;
	}

	private GetPacienteExameByIdResponse convertToGetPacienteExameByIdResponse(PacienteExameModel paciente_param) {
		GetPacienteExameByIdResponse resp = new GetPacienteExameByIdResponse();
		resp.setPacienteExameDetail(convertToPacienteExame(paciente_param));
		return resp;
	}

	private PacienteExameModel convertPacienteExameInsert(InsertPacienteExameDetail paciente_param) {
		return new PacienteExameModel(paciente_param.getId(),paciente_param.getIdPaciente(), paciente_param.getIdExame());
	}
	

	private ExameDetail convertToExame(ExameModel exame_param) {
		ExameDetail exame = new ExameDetail();

		exame.setProtocolo(exame_param.getProtocolo());
		exame.setNomeMedico(exame_param.getNomeMedico());
		exame.setDataExame((Date) exame_param.getDataExame());
		exame.setTipoExame(exame_param.getTipoExame());

		return exame;
	}

	private GetAllExameResponse convertToGetAllExameResponse(List<ExameModel> paciente_param) {
		GetAllExameResponse resp = new GetAllExameResponse();
		paciente_param.stream().forEach(c -> resp.getExameDetail().add(convertToExame(c)));

		return resp;
	}

	private ExameModel convertToExameInsert(ExameDetail exame_param) {
		return new ExameModel(exame_param.getProtocolo(), exame_param.getNomeMedico(), exame_param.getDataExame(),
				exame_param.getTipoExame());
	}

	private PacienteExameDetail convertToPacienteExame(PacienteExameModel paciente_param) {
		PacienteExameDetail paciente = new PacienteExameDetail();
		paciente.setId(paciente_param.getId());
		paciente.setIdExame(paciente_param.getId_exame());
		paciente.setIdPaciente(paciente_param.getId_paciente());
		paciente.setNomePaciente(paciente_param.getNomePaciente());
		paciente.setDescExame(paciente_param.getDescExame());
		return paciente;
	}

	private TipoExameDetail convertToTipoExame(TipoExameModel tpexame_param) {
		TipoExameDetail tpExame = new TipoExameDetail();

		tpExame.setId(tpexame_param.getId());
		tpExame.setTipoExame(tpexame_param.getTipoEexame());
		tpExame.setDescricaoExame(tpexame_param.getDescricaoExame());

		return tpExame;
	}

	private GetPacienteByIdResponse convertToGetPacienteResponse(PacienteModel paciente_param) {
		GetPacienteByIdResponse getPacienteResponse = new GetPacienteByIdResponse();
		getPacienteResponse.setPacienteDetail(convertToPaciente(paciente_param));
		return getPacienteResponse;
	}

	private PacienteDetail convertToPaciente(PacienteModel paciente_param) {
		PacienteDetail paciente = new PacienteDetail();

		paciente.setId(paciente_param.getId());
		paciente.setNome(paciente_param.getNome());
		paciente.setDataNascimento((Date) paciente_param.getDataNascimento());
		paciente.setCpf(paciente_param.getCpf());
		paciente.setEndereco(paciente_param.getEndereco());
		paciente.setDataCadastro((Date) paciente_param.getDataCadastro());
		paciente.setDataAlteracao((Date) paciente_param.getDataAlteracao());
		paciente.setEmail(paciente_param.getEmail());
		paciente.setConvenio(paciente_param.getConvenio());
		paciente.setTipoExame(paciente_param.getTipoExame());
		paciente.setAnexoPedido(paciente_param.getSolicitacaoexame());
		paciente.setComentarios(paciente_param.getObservacao());
		return paciente;
	}

	private PacienteModel convertToPacienteInsert(PacienteDetail paciente_param) {
		return new PacienteModel(paciente_param.getId(), paciente_param.getNome(), paciente_param.getDataNascimento(),
				paciente_param.getCpf(), paciente_param.getEndereco(), paciente_param.getDataCadastro(),
				paciente_param.getDataAlteracao(), paciente_param.getEmail(), paciente_param.getConvenio(),
				paciente_param.getTipoExame(), paciente_param.getAnexoPedido(), paciente_param.getComentarios());
	}

	private GetAllPacienteResponse convertToGetAllPacienteResponse(List<PacienteModel> paciente_param) {
		GetAllPacienteResponse resp = new GetAllPacienteResponse();
		paciente_param.stream().forEach(c -> resp.getPacienteDetail().add(convertToPaciente(c)));

		return resp;
	}

}
