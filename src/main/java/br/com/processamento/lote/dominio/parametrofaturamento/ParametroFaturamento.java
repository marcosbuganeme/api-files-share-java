package br.com.processamento.lote.dominio.parametrofaturamento;

import java.util.ArrayList;
import java.util.List;

public class ParametroFaturamento {

	private Integer id;
	private String condicaoFinanciamento;
	private String dataFaturamento;
	private String dataVencimento;
	private String plano;
	private String coeficiente;
	private String taxa;
	private String diasPagamento;
	private String filial;
	private String tipoPessoa;
	private String tipoCliente;
	private String tipoOperacao;
	private String diasPrimeiroVencimento;
	private String taxaAntecipacao;
	private String codigoEmpresa;
	private String taxaCancelamento;
	private String taxaProrrogacao;
	private String tipoCondicao;
	private String quantidadeDiasProximoVencimento;
	private List<String> camposObrigatorios = new ArrayList<>();

	public ParametroFaturamento() {
		super();
	}

	public ParametroFaturamento(final List<String> campos) {
		super();
		this.camposObrigatorios = campos;
	}

	public ParametroFaturamento(String condicaoFinanciamento, String dataFaturamento, String dataVencimento,
			String plano, String coeficiente, String taxa, String diasPagamento, String filial, String tipoPessoa,
			String tipoCliente, String tipoOperacao, String diasPrimeiroVencimento, String taxaAntecipacao,
			String codigoEmpresa, String taxaCancelamento, String taxaProrrogacao, String tipoCondicao,
			String quantidadeDiasProximoVencimento) {

		super();
		this.condicaoFinanciamento = condicaoFinanciamento;
		this.dataFaturamento = dataFaturamento;
		this.dataVencimento = dataVencimento;
		this.plano = plano;
		this.coeficiente = coeficiente;
		this.taxa = taxa;
		this.diasPagamento = diasPagamento;
		this.filial = filial;
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

	public String getFilial() {
		return filial;
	}

	public void setFilial(String filial) {
		this.filial = filial;
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

	public List<String> getCamposObrigatorios() {
		return camposObrigatorios;
	}

	public void setCamposObrigatorios(List<String> camposObrigatorios) {
		this.camposObrigatorios = camposObrigatorios;
	}

	@Override
	public String toString() {
		return "ParametroFaturamento [id=" + id + ", condicaoFinanciamento=" + condicaoFinanciamento
				+ ", dataFaturamento=" + dataFaturamento + ", dataVencimento=" + dataVencimento + ", plano=" + plano
				+ ", coeficiente=" + coeficiente + ", taxa=" + taxa + ", " + "diasPagamento=" + diasPagamento
				+ ", filial=" + filial + ", " + "tipoPessoa=" + tipoPessoa + ", tipoCliente=" + tipoCliente
				+ ", tipoOperacao=" + tipoOperacao + ", diasPrimeiroVencimento=" + diasPrimeiroVencimento
				+ ", taxaAntecipacao=" + taxaAntecipacao + ", codigoEmpresa=" + codigoEmpresa + ", taxaCancelamento="
				+ taxaCancelamento + ", taxaProrrogacao=" + taxaProrrogacao + ", tipoCondicao=" + tipoCondicao
				+ ", quantidadeDiasProximoVencimento=" + quantidadeDiasProximoVencimento + "]";
	}
}
