package br.com.arquivos.estrutura.leitura;

/**
 * Pojo simples para representar os dados do arquivo de retorno
 * 
 * @author marcos
 */
public class DicionarioRetorno {

	private String codigo;
	private String descricao;

	public DicionarioRetorno() {
	}

	public DicionarioRetorno(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof DicionarioRetorno)) {
			return false;
		}
		DicionarioRetorno other = (DicionarioRetorno) obj;
		if (codigo == null) {
			if (other.codigo != null) {
				return false;
			}
		} else if (!codigo.equals(other.codigo)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "DicionarioRetorno [codigo=" + codigo + ", descricao=" + descricao + "]";
	}
}
