package br.com.processamento.lote.dominio.parametrofaturamento;

import java.io.Serializable;

/**
 * @author marcos.buganeme
 */
public class ParametroFaturamentoArquivoTexto implements Serializable {

  private static final long serialVersionUID = 1L;

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
  private String fillerUm;
  private String fillerDois;

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

  @Override
  public String toString() {
    return "ParametroFaturamentoArquivoTexto [condicaoFinanciamento=" + condicaoFinanciamento
        + ", dataFaturamento=" + dataFaturamento + ", dataVencimento=" + dataVencimento + ", plano="
        + plano + ", coeficiente=" + coeficiente + ", taxa=" + taxa + ", diasPagamento="
        + diasPagamento + ", filial=" + filial + ", tipoPessoa=" + tipoPessoa + ", tipoCliente="
        + tipoCliente + ", tipoOperacao=" + tipoOperacao + ", diasPrimeiroVencimento="
        + diasPrimeiroVencimento + ", taxaAntecipacao=" + taxaAntecipacao + ", codigoEmpresa="
        + codigoEmpresa + ", taxaCancelamento=" + taxaCancelamento + ", taxaProrrogacao="
        + taxaProrrogacao + ", tipoCondicao=" + tipoCondicao + ", quantidadeDiasProximoVencimento="
        + quantidadeDiasProximoVencimento + ", fillerUm=" + fillerUm + ", fillerDois=" + fillerDois
        + "]";
  }
}
