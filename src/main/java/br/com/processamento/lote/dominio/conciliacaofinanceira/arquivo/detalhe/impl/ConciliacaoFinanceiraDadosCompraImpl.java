package br.com.processamento.lote.dominio.conciliacaofinanceira.arquivo.detalhe.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Optional;

import br.com.processamento.lote.dominio.conciliacaofinanceira.arquivo.detalhe.ConciliacaoFinanceiraDadosCompra;

/**
 * Implementação do detalhe 2 do arquivo PG - Conciliação financeira
 * @author marcos.buganeme
 */
public class ConciliacaoFinanceiraDadosCompraImpl implements ConciliacaoFinanceiraDadosCompra {

  private Integer tipoRegistro;
  private BigInteger cnpj;
  private BigInteger numeroCartao;
  private Integer filler8Posicoes;
  private BigInteger numeroTransacao;
  private Integer quantidadeTotalParcelas;
  private Integer numeroParcela;
  private BigDecimal valorCompra;
  private BigDecimal valorParcela;
  private String pagamentoAntecipado;
  private LocalDate vencimentoParcela;
  private Optional<String> filler11Posicoes;
  private String bordero;
  private BigDecimal valorLancamento;
  private Optional<String> filler42Posicoes;
  private Optional<BigDecimal> valorDesconto;
  private Optional<LocalDate> dataPagamento;
  private Integer confirmacaoPagamento;
  private Optional<String> filler1Posicao;
  private BigDecimal valorImpostos;
  private Optional<Integer> filler110Posicoes;

  public ConciliacaoFinanceiraDadosCompraImpl(Integer tipoRegistro, BigInteger cnpj,
      BigInteger numeroCartao, Integer filler8Posicoes, BigInteger numeroTransacao,
      Integer quantidadeTotalParcelas, Integer numeroParcela, BigDecimal valorCompra,
      BigDecimal valorParcela, String pagamentoAntecipado, LocalDate vencimentoParcela,
      Optional<String> filler11Posicoes, String bordero, BigDecimal valorLancamento,
      Optional<String> filler42Posicoes, Optional<BigDecimal> valorDesconto,
      Optional<LocalDate> dataPagamento, Integer confirmacaoPagamento,
      Optional<String> filler1Posicao, BigDecimal valorImpostos,
      Optional<Integer> filler110Posicoes) {
    super();
    this.tipoRegistro = tipoRegistro;
    this.cnpj = cnpj;
    this.numeroCartao = numeroCartao;
    this.filler8Posicoes = filler8Posicoes;
    this.numeroTransacao = numeroTransacao;
    this.quantidadeTotalParcelas = quantidadeTotalParcelas;
    this.numeroParcela = numeroParcela;
    this.valorCompra = valorCompra;
    this.valorParcela = valorParcela;
    this.pagamentoAntecipado = pagamentoAntecipado;
    this.vencimentoParcela = vencimentoParcela;
    this.filler11Posicoes = filler11Posicoes;
    this.bordero = bordero;
    this.valorLancamento = valorLancamento;
    this.filler42Posicoes = filler42Posicoes;
    this.valorDesconto = valorDesconto;
    this.dataPagamento = dataPagamento;
    this.confirmacaoPagamento = confirmacaoPagamento;
    this.filler1Posicao = filler1Posicao;
    this.valorImpostos = valorImpostos;
    this.filler110Posicoes = filler110Posicoes;
  }

  @Override
  public Integer getTipoRegistro() {
    return tipoRegistro;
  }

  @Override
  public BigInteger getCnpj() {
    return cnpj;
  }

  @Override
  public BigInteger getNumeroCartao() {
    return numeroCartao;
  }

  @Override
  public Integer getFiller8Posicoes() {
    return filler8Posicoes;
  }

  @Override
  public BigInteger getNumeroTransacao() {
  	return numeroTransacao;
  }
  
  @Override
  public Integer getQuantidadeTotalParcelas() {
    return quantidadeTotalParcelas;
  }

  @Override
  public Integer getNumeroParcela() {
    return numeroParcela;
  }

  @Override
  public BigDecimal getValorCompra() {
    return valorCompra;
  }

  @Override
  public BigDecimal getValorParcela() {
    return valorParcela;
  }

  @Override
  public String getPagamentoAntecipado() {
    return pagamentoAntecipado;
  }

  @Override
  public LocalDate getDataVencimentoParcela() {
    return vencimentoParcela;
  }

  @Override
  public Optional<String> getFiller11Posicoes() {
    return filler11Posicoes;
  }

  @Override
  public String getBordero() {
    return bordero;
  }

  @Override
  public BigDecimal getValorDoLancamento() {
    return valorLancamento;
  }

  @Override
  public Optional<String> getFiller42Posicoes() {
    return filler42Posicoes;
  }

  @Override
  public Optional<BigDecimal> getValorDoDesconto() {
    return valorDesconto;
  }

  @Override
  public Optional<LocalDate> getDataDoPagamento() {
    return dataPagamento;
  }

  @Override
  public Integer getConfirmacaoPagamento() {
    return confirmacaoPagamento;
  }

  @Override
  public Optional<String> getFiller1Posicao() {
    return filler1Posicao;
  }

  @Override
  public BigDecimal getValorDosImpostos() {
    return valorImpostos;
  }

  @Override
  public Optional<Integer> getFiller110Posicoes() {
    return filler110Posicoes;
  }


}
