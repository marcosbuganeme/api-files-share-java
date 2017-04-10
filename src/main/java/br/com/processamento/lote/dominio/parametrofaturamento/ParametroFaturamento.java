package br.com.processamento.lote.dominio.parametrofaturamento;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "parametro_faturamento")
public class ParametroFaturamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "condicao_financiamento", nullable = false)
	private String condicaoFinanciamento;

	private String fillerUm;
	private String fillerDois;
	
	@Column(name = "data_faturamento", nullable = false)
	private String dataFaturamento;

	@Column(name = "data_vencimento", nullable = false)
	private String dataVencimento;

	@Column(nullable = false)
	private String plano;

	@Column(nullable = false)
	private String coeficiente;

	@Column(nullable = false)
	private String taxa;

	@Column(name = "dias_pagamento", nullable = false)
	private String diasPagamento;

	@Column(name = "tipo_pessoa", nullable = false)
	private String tipoPessoa;

	@Column(name = "tipo_cliente", nullable = false)
	private String tipoCliente;

	@Column(name = "tipo_operacao", nullable = false)
	private String tipoOperacao;

	@Column(name = "dias_primeiro_vencimento", nullable = false)
	private String diasPrimeiroVencimento;

	@Column(name = "taxa_antecipacao", nullable = false)
	private String taxaAntecipacao;

	@Column(name = "codigo_empresa", nullable = false)
	private String codigoEmpresa;

	@Column(name = "taxa_cancelamento", nullable = false)
	private String taxaCancelamento;

	@Column(name = "taxa_prorrogacao", nullable = false)
	private String taxaProrrogacao;

	@Column(name = "tipo_condicao", nullable = false)
	private String tipoCondicao;

	@Column(name = "quantidade_dias_proximo_vencimento", nullable = false)
	private String quantidadeDiasProximoVencimento;

	public ParametroFaturamento() {
	}

	public ParametroFaturamento(String condicaoFinanciamento, String dataFaturamento, String dataVencimento,
			String plano, String coeficiente, String taxa, String diasPagamento, String tipoPessoa, String tipoCliente,
			String tipoOperacao, String diasPrimeiroVencimento, String taxaAntecipacao, String codigoEmpresa,
			String taxaCancelamento, String taxaProrrogacao, String tipoCondicao,
			String quantidadeDiasProximoVencimento) {
		this.condicaoFinanciamento = condicaoFinanciamento;
		this.dataFaturamento = dataFaturamento;
		this.dataVencimento = dataVencimento;
		this.plano = plano;
		this.coeficiente = coeficiente;
		this.taxa = taxa;
		this.diasPagamento = diasPagamento;
		this.tipoPessoa = tipoPessoa;
		this.tipoCliente = tipoCliente;
		this.tipoOperacao = tipoOperacao;
		this.diasPrimeiroVencimento = diasPrimeiroVencimento;
		this.taxaAntecipacao = taxaAntecipacao;
		this.codigoEmpresa = codigoEmpresa;
		this.taxaCancelamento = taxaCancelamento;
		this.taxaProrrogacao = taxaProrrogacao;
		this.tipoCondicao = tipoCondicao;
		this.quantidadeDiasProximoVencimento = quantidadeDiasProximoVencimento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCondicaoFinanciamento() {
		return condicaoFinanciamento;
	}

	public void setCondicaoFinanciamento(String condicaoFinanciamento) {
		this.condicaoFinanciamento = condicaoFinanciamento;
	}

	public String getDataFaturamento() {
		return dataFaturamento;
	}

	public void setDataFaturamento(String dataFaturamento) {
		this.dataFaturamento = dataFaturamento;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public String getPlano() {
		return plano;
	}

	public void setPlano(String plano) {
		this.plano = plano;
	}

	public String getCoeficiente() {
		return coeficiente;
	}

	public void setCoeficiente(String coeficiente) {
		this.coeficiente = coeficiente;
	}

	public String getTaxa() {
		return taxa;
	}

	public void setTaxa(String taxa) {
		this.taxa = taxa;
	}

	public String getDiasPagamento() {
		return diasPagamento;
	}

	public void setDiasPagamento(String diasPagamento) {
		this.diasPagamento = diasPagamento;
	}

	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public String getTipoOperacao() {
		return tipoOperacao;
	}

	public void setTipoOperacao(String tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}

	public String getDiasPrimeiroVencimento() {
		return diasPrimeiroVencimento;
	}

	public void setDiasPrimeiroVencimento(String diasPrimeiroVencimento) {
		this.diasPrimeiroVencimento = diasPrimeiroVencimento;
	}

	public String getTaxaAntecipacao() {
		return taxaAntecipacao;
	}

	public void setTaxaAntecipacao(String taxaAntecipacao) {
		this.taxaAntecipacao = taxaAntecipacao;
	}

	public String getCodigoEmpresa() {
		return codigoEmpresa;
	}

	public void setCodigoEmpresa(String codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	public String getTaxaCancelamento() {
		return taxaCancelamento;
	}

	public void setTaxaCancelamento(String taxaCancelamento) {
		this.taxaCancelamento = taxaCancelamento;
	}

	public String getTaxaProrrogacao() {
		return taxaProrrogacao;
	}

	public void setTaxaProrrogacao(String taxaProrrogacao) {
		this.taxaProrrogacao = taxaProrrogacao;
	}

	public String getTipoCondicao() {
		return tipoCondicao;
	}

	public void setTipoCondicao(String tipoCondicao) {
		this.tipoCondicao = tipoCondicao;
	}

	public String getQuantidadeDiasProximoVencimento() {
		return quantidadeDiasProximoVencimento;
	}

	public void setQuantidadeDiasProximoVencimento(String quantidadeDiasProximoVencimento) {
		this.quantidadeDiasProximoVencimento = quantidadeDiasProximoVencimento;
	}

	public String getFillerUm() {
		return fillerUm;
	}

	public void setFillerUm(String fillerUm) {
		this.fillerUm = fillerUm;
	}

	public String getFillerDois() {
		return fillerDois;
	}

	public void setFillerDois(String fillerDois) {
		this.fillerDois = fillerDois;
	}
	
	
}
