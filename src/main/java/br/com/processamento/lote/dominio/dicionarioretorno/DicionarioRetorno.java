package br.com.processamento.lote.dominio.dicionarioretorno;

public class DicionarioRetorno {

	private Integer id;
	private String codigo;
	private String descricao;

	public DicionarioRetorno() {
		super();
	}

	public DicionarioRetorno(String codigo, String descricao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
	public String toString() {
		return "DicionarioRetorno [codigo=" + codigo + ", descricao=" + descricao + "]";
	}
}
