package br.com.processamento.lote.dominio.dicionarioretorno;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dicionario_retorno")
public class DicionarioRetorno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(length = 3, nullable = false)
	private String codigo;

	@Column(length = 255, nullable = false)
	private String descricao;

	public DicionarioRetorno() {
		super();
	}

	public DicionarioRetorno(String codigo, String descricao) {
		super();
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
	public String toString() {
		return "DicionarioRetorno [codigo=" + codigo + ", descricao=" + descricao + "]";
	}
}
