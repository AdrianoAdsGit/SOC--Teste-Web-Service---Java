package br.com.soctest.model;

public class PacienteExameModel {

	private int id;
	private int id_exame;
	private int id_paciente;
	private String nomePaciente;
	private String descExame;

	public PacienteExameModel() {
		
	}
	
	public PacienteExameModel(int id,int id_exame,String descExame , int id_paciente, String nomePaciente) {
		super();
		this.id = id;
		this.id_exame = id_exame;
		this.id_paciente = id_paciente;
		this.nomePaciente = nomePaciente;
		this.descExame = descExame;
	}


	public PacienteExameModel(int id, int id_exame, int id_paciente) {
		super();
		this.id = id;
		this.id_exame = id_exame;
		this.id_paciente = id_paciente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public String getDescExame() {
		return descExame;
	}

	public void setDescExame(String descExame) {
		this.descExame = descExame;
	}

	public int getId_exame() {
		return id_exame;
	}

	public void setId_exame(int id_exame) {
		this.id_exame = id_exame;
	}

	public int getId_paciente() {
		return id_paciente;
	}

	public void setId_paciente(int id_paciente) {
		this.id_paciente = id_paciente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PacienteExameModel other = (PacienteExameModel) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
