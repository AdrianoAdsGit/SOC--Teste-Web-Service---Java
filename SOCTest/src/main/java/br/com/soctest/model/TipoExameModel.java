package br.com.soctest.model;

public class TipoExameModel {
	
	private int id;
	private String tipoEexame;
	private String descricaoExame;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipoEexame() {
		return tipoEexame;
	}
	public void setTipoEexame(String tipoEexame) {
		this.tipoEexame = tipoEexame;
	}
	public String getDescricaoExame() {
		return descricaoExame;
	}
	public void setDescricaoExame(String descricaoExame) {
		this.descricaoExame = descricaoExame;
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
		TipoExameModel other = (TipoExameModel) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
