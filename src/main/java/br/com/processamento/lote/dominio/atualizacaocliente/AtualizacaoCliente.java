package br.com.processamento.lote.dominio.atualizacaocliente;

/**
 * @author marcos.buganeme
 */
public class AtualizacaoCliente {

  /**
   * Identificador no banco de dados - Será auto incrementado
   * */
  private Integer id;

  /**
   * Dados do pagamento - Detalhe 1
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

  /**
   * Dados da compra - Detalhe 2
   * */
  private String tipoRegistroDetalheDadosCompra;
  private String cnpj;
  private String numeroCartao;
  private String numeroTransacao;
  private String quantidadeTotalParcelas;
  private String numeroParcela;
  private String valorCompra;
  private String valorParcela;
  private String pagamentoAntecipado;
  private String dataVencimentoParcela;
  private String borderoDadosCompra;
  private String valorLancamentoDadosCompra;
  private String valorDesconto;
  private String dataPagamentoDadosCompra;
  private String confirmacaoPagamento;
  private String valorImpostos;

  public AtualizacaoCliente() {}

  public AtualizacaoCliente(String tipoRegistroDetalheDadosPagamento, String codigoEmpresa,
      String codigoLoja, String dataPagamentoDadosPagamento, String borderoDadosPagamento,
      String sinal, String valorLancamentoDadosPagamento, String nomeCredito, String agencia,
      String conta, String historico, String evento, String tipoRegistroDetalheDadosCompra,
      String cnpj, String numeroCartao, String numeroTransacao, String quantidadeTotalParcelas,
      String numeroParcela, String valorCompra, String valorParcela, String pagamentoAntecipado,
      String dataVencimentoParcela, String borderoDadosCompra, String valorLancamentoDadosCompra,
      String valorDesconto, String dataPagamentoDadosCompra, String confirmacaoPagamento,
      String valorImpostos) {

    super();

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
    this.tipoRegistroDetalheDadosCompra = tipoRegistroDetalheDadosCompra;
    this.cnpj = cnpj;
    this.numeroCartao = numeroCartao;
    this.numeroTransacao = numeroTransacao;
    this.quantidadeTotalParcelas = quantidadeTotalParcelas;
    this.numeroParcela = numeroParcela;
    this.valorCompra = valorCompra;
    this.valorParcela = valorParcela;
    this.pagamentoAntecipado = pagamentoAntecipado;
    this.dataVencimentoParcela = dataVencimentoParcela;
    this.borderoDadosCompra = borderoDadosCompra;
    this.valorLancamentoDadosCompra = valorLancamentoDadosCompra;
    this.valorDesconto = valorDesconto;
    this.dataPagamentoDadosCompra = dataPagamentoDadosCompra;
    this.confirmacaoPagamento = confirmacaoPagamento;
    this.valorImpostos = valorImpostos;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
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

  public String getValorImpostos() {
    return valorImpostos;
  }

  public void setValorImpostos(String valorImpostos) {
    this.valorImpostos = valorImpostos;
  }
}
