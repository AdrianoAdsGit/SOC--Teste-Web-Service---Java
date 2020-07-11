package br.com.soctest.model;

import java.util.Date;

import javax.xml.crypto.Data;

public class PacienteModel {

	private int id;
	private String nome;
	private Date dataNascimento;
	private String cpf;
	private String endereco;
	private Date dataCadastro;
	private Date dataAlteracao;
	private String email;
	private String convenio;
	private String tipoExame;
	private String solicitacaoexame;
	private String observacao;

	public PacienteModel() {

	}

	public PacienteModel(int id, String nome, Date dataNascimento, String cpf, String endereco, Date dataCadastro,
			Date dataAlteracao, String email, String convenio, String tipoExame, String solicitacaoexame,
			String observacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.endereco = endereco;
		this.dataCadastro = dataCadastro;
		this.dataAlteracao = dataAlteracao;
		this.email = email;
		this.convenio = convenio;
		this.tipoExame = tipoExame;
		this.solicitacaoexame = solicitacaoexame;
		this.observacao = observacao;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Date getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getConvenio() {
		return convenio;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

	public String getTipoExame() {
		return tipoExame;
	}

	public void setTipoExame(String tipoExame) {
		this.tipoExame = tipoExame;
	}

	public String getSolicitacaoexame() {
		return solicitacaoexame;
	}

	public void setSolicitacaoexame(String solicitacaoexame) {
		this.solicitacaoexame = solicitacaoexame;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
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
		PacienteModel other = (PacienteModel) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
