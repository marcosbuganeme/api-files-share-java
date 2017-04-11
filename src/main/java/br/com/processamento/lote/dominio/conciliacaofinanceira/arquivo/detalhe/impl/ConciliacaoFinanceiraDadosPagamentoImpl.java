package br.com.processamento.lote.dominio.conciliacaofinanceira.arquivo.detalhe.impl;

import java.time.LocalDate;
import java.util.Optional;

import br.com.processamento.lote.dominio.conciliacaofinanceira.arquivo.detalhe.ConciliacaoFinanceiraDadosPagamento;

/**
 * Implementação do detalhe 1 do arquivo PG - Conciliação financeira
 * @author marcos.buganeme
 */
public class ConciliacaoFinanceiraDadosPagamentoImpl implements ConciliacaoFinanceiraDadosPagamento {

  private Integer tipoRegistro;
  private String codigoEmpresa;
  private String codigoLoja;
  private LocalDate dataPagamento;
  private String bordero;
  private String sinal;
  private Integer valorLancamento;
  private String nomeCredito;
  private Integer numeroBanco;
  private String numeroAgencia;
  private String numeroConta;
  private String historico;
  private String evento;
  private Optional<String> filler;

  public ConciliacaoFinanceiraDadosPagamentoImpl(Integer tipoRegistro, String codigoEmpresa,
      String codigoLoja, LocalDate dataPagamento, String bordero, String sinal,
      Integer valorLancamento, String nomeCredito, Integer numeroBanco, String numeroAgencia,
      String numeroConta, String historico, String evento, Optional<String> filler) {
    super();
    this.tipoRegistro = tipoRegistro;
    this.codigoEmpresa = codigoEmpresa;
    this.codigoLoja = codigoLoja;
    this.dataPagamento = dataPagamento;
    this.bordero = bordero;
    this.sinal = sinal;
    this.valorLancamento = valorLancamento;
    this.nomeCredito = nomeCredito;
    this.numeroBanco = numeroBanco;
    this.numeroAgencia = numeroAgencia;
    this.numeroConta = numeroConta;
    this.historico = historico;
    this.evento = evento;
    this.filler = filler;
  }

  @Override
  public Integer getTipoRegistro() {
    return tipoRegistro;
  }

  @Override
  public String getCodigoEmpresa() {
    return codigoEmpresa;
  }

  @Override
  public String getCodigoLoja() {
    return codigoLoja;
  }

  @Override
  public LocalDate getDataPagamento() {
    return dataPagamento;
  }

  @Override
  public String getBordero() {
    return bordero;
  }

  @Override
  public String getSinal() {
    return sinal;
  }

  @Override
  public Integer getValorLancamento() {
    return valorLancamento;
  }

  @Override
  public String getNomeCredito() {
    return nomeCredito;
  }

  @Override
  public Integer getNumeroBanco() {
    return numeroBanco;
  }

  @Override
  public String getNumeroAgencia() {
    return numeroAgencia;
  }

  @Override
  public String getNumeroConta() {
    return numeroConta;
  }

  @Override
  public String getHistorico() {
    return historico;
  }

  @Override
  public String getEvento() {
    return evento;
  }

  @Override
  public Optional<String> getFiller() {
    return filler;
  }
}
