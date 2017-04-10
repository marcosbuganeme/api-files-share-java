package br.com.processamento.lote.dominio.atualizacaocliente;

import java.io.Serializable;

/**
 * @author marcos.buganeme
 */
public class AtualizacaoClienteArquivoTexto implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * Cabeçalho
   * */
  private String tipoRegistroCabecalho;
  private String dataGeracaoArquivo;
  private String identificacaoArquivo;
  private String nomeParceiro;
  private String horaGeracaoArquivo;
  private String fillerCabecalho;

  
  /**
   * Dados do detalhe 1 - Dados do pagamento
   * */
  private String tipoRegistroDetalheDadosPagamento;
  private String codigoEmpresa;
  private String codigoLoja;
  private String dataPagamentoDadosPagamento;
  private String borderoDadosPagamento;
  private String sinal;
  private String valorLancamentoDadosPagamento;
  private String nomeCredito;
  private String agencia;
  private String conta;
  private String historico;
  private String evento;
  private String fillerDadosCompra;

  
  /**
   * Dados do detalhe 2 - Dados do pagamento
   * */
  private String tipoRegistroDetalheDadosCompra;
  private String cnpj;
  private String numeroCartao;
  private String fillerUmDadosCompra;
  private String numeroTransacao;
  private String quantidadeTotalParcelas;
  private String numeroParcela;
  private String valorCompra;
  private String valorParcela;
  private String pagamentoAntecipado;
  private String dataVencimentoParcela;
  private String fillerDoisDadosCompra;
  private String borderoDadosCompra;
  private String valorLancamentoDadosCompra;
  private String fillerTresDadosCompra;
  private String valorDesconto;
  private String dataPagamentoDadosCompra;
  private String confirmacaoPagamento;
  private String fillerQuatroDadosCompra;
  private String valorImpostos;

  /**
   * Dados do trailler
   * */
  private String tipoRegistroTrailler;
  private String totalTipoUm;
  private String totalTipoDois;
  private String totalGeral;
  private String fillerUmTrailler;

  public AtualizacaoClienteArquivoTexto() {}

  public AtualizacaoClienteArquivoTexto(String tipoRegistroCabecalho, String dataGeracaoArquivo,
      String identificacaoArquivo, String nomeParceiro, String horaGeracaoArquivo,
      String fillerCabecalho, String tipoRegistroDetalheDadosPagamento, String codigoEmpresa,
      String codigoLoja, String dataPagamentoDadosPagamento, String borderoDadosPagamento,
      String sinal, String valorLancamentoDadosPagamento, String nomeCredito, String agencia,
      String conta, String historico, String evento, String fillerDadosCompra,
      String tipoRegistroDetalheDadosCompra, String cnpj, String numeroCartao,
      String fillerUmDadosCompra, String numeroTransacao, String quantidadeTotalParcelas,
      String numeroParcela, String valorCompra, String valorParcela, String pagamentoAntecipado,
      String dataVencimentoParcela, String fillerDoisDadosCompra, String borderoDadosCompra,
      String valorLancamentoDadosCompra, String fillerTresDadosCompra, String valorDesconto,
      String dataPagamentoDadosCompra, String confirmacaoPagamento, String fillerQuatroDadosCompra,
      String valorImpostos, String tipoRegistroTrailler, String totalTipoUm, String totalTipoDois,
      String totalGeral, String fillerUmTrailler) {
    this.tipoRegistroCabecalho = tipoRegistroCabecalho;
    this.dataGeracaoArquivo = dataGeracaoArquivo;
    this.identificacaoArquivo = identificacaoArquivo;
    this.nomeParceiro = nomeParceiro;
    this.horaGeracaoArquivo = horaGeracaoArquivo;
    this.fillerCabecalho = fillerCabecalho;
    this.tipoRegistroDetalheDadosPagamento = tipoRegistroDetalheDadosPagamento;
    this.codigoEmpresa = codigoEmpresa;
    this.codigoLoja = codigoLoja;
    this.dataPagamentoDadosPagamento = dataPagamentoDadosPagamento;
    this.borderoDadosPagamento = borderoDadosPagamento;
    this.sinal = sinal;
    this.valorLancamentoDadosPagamento = valorLancamentoDadosPagamento;
    this.nomeCredito = nomeCredito;
    this.agencia = agencia;
    this.conta = conta;
    this.historico = historico;
    this.evento = evento;
    this.fillerDadosCompra = fillerDadosCompra;
    this.tipoRegistroDetalheDadosCompra = tipoRegistroDetalheDadosCompra;
    this.cnpj = cnpj;
    this.numeroCartao = numeroCartao;
    this.fillerUmDadosCompra = fillerUmDadosCompra;
    this.numeroTransacao = numeroTransacao;
    this.quantidadeTotalParcelas = quantidadeTotalParcelas;
    this.numeroParcela = numeroParcela;
    this.valorCompra = valorCompra;
    this.valorParcela = valorParcela;
    this.pagamentoAntecipado = pagamentoAntecipado;
    this.dataVencimentoParcela = dataVencimentoParcela;
    this.fillerDoisDadosCompra = fillerDoisDadosCompra;
    this.borderoDadosCompra = borderoDadosCompra;
    this.valorLancamentoDadosCompra = valorLancamentoDadosCompra;
    this.fillerTresDadosCompra = fillerTresDadosCompra;
    this.valorDesconto = valorDesconto;
    this.dataPagamentoDadosCompra = dataPagamentoDadosCompra;
    this.confirmacaoPagamento = confirmacaoPagamento;
    this.fillerQuatroDadosCompra = fillerQuatroDadosCompra;
    this.valorImpostos = valorImpostos;
    this.tipoRegistroTrailler = tipoRegistroTrailler;
    this.totalTipoUm = totalTipoUm;
    this.totalTipoDois = totalTipoDois;
    this.totalGeral = totalGeral;
    this.fillerUmTrailler = fillerUmTrailler;
  }

  public String getTipoRegistroCabecalho() {
    return tipoRegistroCabecalho;
  }

  public void setTipoRegistroCabecalho(String tipoRegistroCabecalho) {
    this.tipoRegistroCabecalho = tipoRegistroCabecalho;
  }

  public String getDataGeracaoArquivo() {
    return dataGeracaoArquivo;
  }

  public void setDataGeracaoArquivo(String dataGeracaoArquivo) {
    this.dataGeracaoArquivo = dataGeracaoArquivo;
  }

  public String getIdentificacaoArquivo() {
    return identificacaoArquivo;
  }

  public void setIdentificacaoArquivo(String identificacaoArquivo) {
    this.identificacaoArquivo = identificacaoArquivo;
  }

  public String getNomeParceiro() {
    return nomeParceiro;
  }

  public void setNomeParceiro(String nomeParceiro) {
    this.nomeParceiro = nomeParceiro;
  }

  public String getHoraGeracaoArquivo() {
    return horaGeracaoArquivo;
  }

  public void setHoraGeracaoArquivo(String horaGeracaoArquivo) {
    this.horaGeracaoArquivo = horaGeracaoArquivo;
  }

  public String getFillerCabecalho() {
    return fillerCabecalho;
  }

  public void setFillerCabecalho(String fillerCabecalho) {
    this.fillerCabecalho = fillerCabecalho;
  }

  public String getTipoRegistroDetalheDadosPagamento() {
    return tipoRegistroDetalheDadosPagamento;
  }

  public void setTipoRegistroDetalheDadosPagamento(String tipoRegistroDetalheDadosPagamento) {
    this.tipoRegistroDetalheDadosPagamento = tipoRegistroDetalheDadosPagamento;
  }

  public String getCodigoEmpresa() {
    return codigoEmpresa;
  }

  public void setCodigoEmpresa(String codigoEmpresa) {
    this.codigoEmpresa = codigoEmpresa;
  }

  public String getCodigoLoja() {
    return codigoLoja;
  }

  public void setCodigoLoja(String codigoLoja) {
    this.codigoLoja = codigoLoja;
  }

  public String getDataPagamentoDadosPagamento() {
    return dataPagamentoDadosPagamento;
  }

  public void setDataPagamentoDadosPagamento(String dataPagamentoDadosPagamento) {
    this.dataPagamentoDadosPagamento = dataPagamentoDadosPagamento;
  }

  public String getBorderoDadosPagamento() {
    return borderoDadosPagamento;
  }

  public void setBorderoDadosPagamento(String borderoDadosPagamento) {
    this.borderoDadosPagamento = borderoDadosPagamento;
  }

  public String getSinal() {
    return sinal;
  }

  public void setSinal(String sinal) {
    this.sinal = sinal;
  }

  public String getValorLancamentoDadosPagamento() {
    return valorLancamentoDadosPagamento;
  }

  public void setValorLancamentoDadosPagamento(String valorLancamentoDadosPagamento) {
    this.valorLancamentoDadosPagamento = valorLancamentoDadosPagamento;
  }

  public String getNomeCredito() {
    return nomeCredito;
  }

  public void setNomeCredito(String nomeCredito) {
    this.nomeCredito = nomeCredito;
  }

  public String getAgencia() {
    return agencia;
  }

  public void setAgencia(String agencia) {
    this.agencia = agencia;
  }

  public String getConta() {
    return conta;
  }

  public void setConta(String conta) {
    this.conta = conta;
  }

  public String getHistorico() {
    return historico;
  }

  public void setHistorico(String historico) {
    this.historico = historico;
  }

  public String getEvento() {
    return evento;
  }

  public void setEvento(String evento) {
    this.evento = evento;
  }

  public String getFillerDadosCompra() {
    return fillerDadosCompra;
  }

  public void setFillerDadosCompra(String fillerDadosCompra) {
    this.fillerDadosCompra = fillerDadosCompra;
  }

  public String getTipoRegistroDetalheDadosCompra() {
    return tipoRegistroDetalheDadosCompra;
  }

  public void setTipoRegistroDetalheDadosCompra(String tipoRegistroDetalheDadosCompra) {
    this.tipoRegistroDetalheDadosCompra = tipoRegistroDetalheDadosCompra;
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public String getNumeroCartao() {
    return numeroCartao;
  }

  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  public String getFillerUmDadosCompra() {
    return fillerUmDadosCompra;
  }

  public void setFillerUmDadosCompra(String fillerUmDadosCompra) {
    this.fillerUmDadosCompra = fillerUmDadosCompra;
  }

  public String getNumeroTransacao() {
    return numeroTransacao;
  }

  public void setNumeroTransacao(String numeroTransacao) {
    this.numeroTransacao = numeroTransacao;
  }

  public String getQuantidadeTotalParcelas() {
    return quantidadeTotalParcelas;
  }

  public void setQuantidadeTotalParcelas(String quantidadeTotalParcelas) {
    this.quantidadeTotalParcelas = quantidadeTotalParcelas;
  }

  public String getNumeroParcela() {
    return numeroParcela;
  }

  public void setNumeroParcela(String numeroParcela) {
    this.numeroParcela = numeroParcela;
  }

  public String getValorCompra() {
    return valorCompra;
  }

  public void setValorCompra(String valorCompra) {
    this.valorCompra = valorCompra;
  }

  public String getValorParcela() {
    return valorParcela;
  }

  public void setValorParcela(String valorParcela) {
    this.valorParcela = valorParcela;
  }

  public String getPagamentoAntecipado() {
    return pagamentoAntecipado;
  }

  public void setPagamentoAntecipado(String pagamentoAntecipado) {
    this.pagamentoAntecipado = pagamentoAntecipado;
  }

  public String getDataVencimentoParcela() {
    return dataVencimentoParcela;
  }

  public void setDataVencimentoParcela(String dataVencimentoParcela) {
    this.dataVencimentoParcela = dataVencimentoParcela;
  }

  public String getFillerDoisDadosCompra() {
    return fillerDoisDadosCompra;
  }

  public void setFillerDoisDadosCompra(String fillerDoisDadosCompra) {
    this.fillerDoisDadosCompra = fillerDoisDadosCompra;
  }

  public String getBorderoDadosCompra() {
    return borderoDadosCompra;
  }

  public void setBorderoDadosCompra(String borderoDadosCompra) {
    this.borderoDadosCompra = borderoDadosCompra;
  }

  public String getValorLancamentoDadosCompra() {
    return valorLancamentoDadosCompra;
  }

  public void setValorLancamentoDadosCompra(String valorLancamentoDadosCompra) {
    this.valorLancamentoDadosCompra = valorLancamentoDadosCompra;
  }

  public String getFillerTresDadosCompra() {
    return fillerTresDadosCompra;
  }

  public void setFillerTresDadosCompra(String fillerTresDadosCompra) {
    this.fillerTresDadosCompra = fillerTresDadosCompra;
  }

  public String getValorDesconto() {
    return valorDesconto;
  }

  public void setValorDesconto(String valorDesconto) {
    this.valorDesconto = valorDesconto;
  }

  public String getDataPagamentoDadosCompra() {
    return dataPagamentoDadosCompra;
  }

  public void setDataPagamentoDadosCompra(String dataPagamentoDadosCompra) {
    this.dataPagamentoDadosCompra = dataPagamentoDadosCompra;
  }

  public String getConfirmacaoPagamento() {
    return confirmacaoPagamento;
  }

  public void setConfirmacaoPagamento(String confirmacaoPagamento) {
    this.confirmacaoPagamento = confirmacaoPagamento;
  }

  public String getFillerQuatroDadosCompra() {
    return fillerQuatroDadosCompra;
  }

  public void setFillerQuatroDadosCompra(String fillerQuatroDadosCompra) {
    this.fillerQuatroDadosCompra = fillerQuatroDadosCompra;
  }

  public String getValorImpostos() {
    return valorImpostos;
  }

  public void setValorImpostos(String valorImpostos) {
    this.valorImpostos = valorImpostos;
  }

  public String getTipoRegistroTrailler() {
    return tipoRegistroTrailler;
  }

  public void setTipoRegistroTrailler(String tipoRegistroTrailler) {
    this.tipoRegistroTrailler = tipoRegistroTrailler;
  }

  public String getTotalTipoUm() {
    return totalTipoUm;
  }

  public void setTotalTipoUm(String totalTipoUm) {
    this.totalTipoUm = totalTipoUm;
  }

  public String getTotalTipoDois() {
    return totalTipoDois;
  }

  public void setTotalTipoDois(String totalTipoDois) {
    this.totalTipoDois = totalTipoDois;
  }

  public String getTotalGeral() {
    return totalGeral;
  }

  public void setTotalGeral(String totalGeral) {
    this.totalGeral = totalGeral;
  }

  public String getFillerUmTrailler() {
    return fillerUmTrailler;
  }

  public void setFillerUmTrailler(String fillerUmTrailler) {
    this.fillerUmTrailler = fillerUmTrailler;
  }
}
