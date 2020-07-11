package br.com.soctest.model;

import java.util.Date;

public class ExameModel {

	private int id;
	private String protocolo;
	private String nomeMedico;
	private Date dataExame;	
	private int tipoExame;
	
	public ExameModel() {
		
	}
	
	public ExameModel(String protocolo, String nomeMedico, Date dataExame, int tipoExame) {
		super();
		this.id = id;
		this.protocolo = protocolo;
		this.nomeMedico = nomeMedico;
		this.dataExame = dataExame;
		this.tipoExame = tipoExame;
	}

	public int getTipoExame() {
		return tipoExame;
	}

	public void setTipoExame(int tipoExame) {
		this.tipoExame = tipoExame;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}

	public String getNomeMedico() {
		return nomeMedico;
	}

	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}

	public Date getDataExame() {
		return dataExame;
	}

	public void setDataExame(Date dataExame) {
		this.dataExame = dataExame;
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
		ExameModel other = (ExameModel) obj;
		if (id != other.id)
			return false;
		return true;
	}

}