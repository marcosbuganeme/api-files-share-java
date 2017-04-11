package br.com.processamento.lote.dominio.conciliacaofinanceira;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Optional;

/**
 * Classe de domínio
 * @author marcos.buganeme
 */
public class ConciliacaoFinanceira {

  private Integer id;

  /*
   * Dados do detalhe1 - Dados do pagamento
   */
  private Integer tipoRegistroDetalhe1;
  private String codigoEmpresa;
  private String codigoLoja;
  private LocalDate dataPagamentoDetalhe1;
  private String borderoDetalhe1;
  private String sinal;
  private Integer valorLancamentoDetalhe1;
  private String nomeCredito;
  private Integer numeroBanco;
  private String numeroAgencia;
  private String numeroConta;
  private String historico;
  private String evento;

  /*
   * Dados do detalhe2 - Dados da compra
   */
  private Integer tipoRegistroDetalhe2;
  private BigInteger cnpj;
  private BigInteger numeroCartao;
  private BigInteger numeroTransacao;
  private Integer quantidadeTotalParcelas;
  private Integer numeroParcela;
  private BigDecimal valorCompra;
  private BigDecimal valorParcela;
  private String pagamentoAntecipado;
  private LocalDate vencimentoParcela;
  private String borderoDetalhe2;
  private BigDecimal valorLancamentoDetalhe2;
  private Optional<BigDecimal> valorDesconto;
  private Optional<LocalDate> dataPagamentoDetalhe2;
  private Integer confirmacaoPagamento;
  private BigDecimal valorImpostos;

  public ConciliacaoFinanceira(Integer tipoRegistroDetalhe1, String codigoEmpresa,
      String codigoLoja, LocalDate dataPagamentoDetalhe1, String borderoDetalhe1, String sinal,
      Integer valorLancamentoDetalhe1, String nomeCredito, Integer numeroBanco,
      String numeroAgencia, String numeroConta, String historico, String evento,
      Integer tipoRegistroDetalhe2, BigInteger cnpj, BigInteger numeroCartao,
      BigInteger numeroTransacao, Integer quantidadeTotalParcelas, Integer numeroParcela,
      BigDecimal valorCompra, BigDecimal valorParcela, String pagamentoAntecipado,
      LocalDate vencimentoParcela, String borderoDetalhe2, BigDecimal valorLancamentoDetalhe2,
      Optional<BigDecimal> valorDesconto, Optional<LocalDate> dataPagamentoDetalhe2,
      Integer confirmacaoPagamento, BigDecimal valorImpostos) {
    super();
    this.tipoRegistroDetalhe1 = tipoRegistroDetalhe1;
    this.codigoEmpresa = codigoEmpresa;
    this.codigoLoja = codigoLoja;
    this.dataPagamentoDetalhe1 = dataPagamentoDetalhe1;
    this.borderoDetalhe1 = borderoDetalhe1;
    this.sinal = sinal;
    this.valorLancamentoDetalhe1 = valorLancamentoDetalhe1;
    this.nomeCredito = nomeCredito;
    this.numeroBanco = numeroBanco;
    this.numeroAgencia = numeroAgencia;
    this.numeroConta = numeroConta;
    this.historico = historico;
    this.evento = evento;
    this.tipoRegistroDetalhe2 = tipoRegistroDetalhe2;
    this.cnpj = cnpj;
    this.numeroCartao = numeroCartao;
    this.numeroTransacao = numeroTransacao;
    this.quantidadeTotalParcelas = quantidadeTotalParcelas;
    this.numeroParcela = numeroParcela;
    this.valorCompra = valorCompra;
    this.valorParcela = valorParcela;
    this.pagamentoAntecipado = pagamentoAntecipado;
    this.vencimentoParcela = vencimentoParcela;
    this.borderoDetalhe2 = borderoDetalhe2;
    this.valorLancamentoDetalhe2 = valorLancamentoDetalhe2;
    this.valorDesconto = valorDesconto;
    this.dataPagamentoDetalhe2 = dataPagamentoDetalhe2;
    this.confirmacaoPagamento = confirmacaoPagamento;
    this.valorImpostos = valorImpostos;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getTipoRegistroDetalhe1() {
    return tipoRegistroDetalhe1;
  }

  public String getCodigoEmpresa() {
    return codigoEmpresa;
  }

  public String getCodigoLoja() {
    return codigoLoja;
  }

  public LocalDate getDataPagamentoDetalhe1() {
    return dataPagamentoDetalhe1;
  }

  public String getBorderoDetalhe1() {
    return borderoDetalhe1;
  }

  public String getSinal() {
    return sinal;
  }

  public Integer getValorLancamentoDetalhe1() {
    return valorLancamentoDetalhe1;
  }

  public String getNomeCredito() {
    return nomeCredito;
  }

  public Integer getNumeroBanco() {
    return numeroBanco;
  }

  public String getNumeroAgencia() {
    return numeroAgencia;
  }

  public String getNumeroConta() {
    return numeroConta;
  }

  public String getHistorico() {
    return historico;
  }

  public String getEvento() {
    return evento;
  }

  public Integer getTipoRegistroDetalhe2() {
    return tipoRegistroDetalhe2;
  }

  public BigInteger getCnpj() {
    return cnpj;
  }

  public BigInteger getNumeroCartao() {
    return numeroCartao;
  }

  public BigInteger getNumeroTransacao() {
    return numeroTransacao;
  }

  public Integer getQuantidadeTotalParcelas() {
    return quantidadeTotalParcelas;
  }

  public Integer getNumeroParcela() {
    return numeroParcela;
  }

  public BigDecimal getValorCompra() {
    return valorCompra;
  }

  public BigDecimal getValorParcela() {
    return valorParcela;
  }

  public String getPagamentoAntecipado() {
    return pagamentoAntecipado;
  }

  public LocalDate getVencimentoParcela() {
    return vencimentoParcela;
  }

  public String getBorderoDetalhe2() {
    return borderoDetalhe2;
  }

  public BigDecimal getValorLancamentoDetalhe2() {
    return valorLancamentoDetalhe2;
  }

  public Optional<BigDecimal> getValorDesconto() {
    return valorDesconto;
  }

  public Optional<LocalDate> getDataPagamentoDetalhe2() {
    return dataPagamentoDetalhe2;
  }

  public Integer getConfirmacaoPagamento() {
    return confirmacaoPagamento;
  }

  public BigDecimal getValorImpostos() {
    return valorImpostos;
  }
}
