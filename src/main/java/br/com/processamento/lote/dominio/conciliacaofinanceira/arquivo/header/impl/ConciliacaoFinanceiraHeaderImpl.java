package br.com.processamento.lote.dominio.conciliacaofinanceira.arquivo.header.impl;

import java.time.LocalDate;
import java.time.LocalTime;

import br.com.processamento.lote.dominio.conciliacaofinanceira.arquivo.header.ConciliacaoFinanceiraHeader;

/**
 * @author marcos.buganeme
 */
public class ConciliacaoFinanceiraHeaderImpl implements ConciliacaoFinanceiraHeader {

  private Integer tipoDoRegistro;
  private String identificacao;
  private LocalDate dataGeracao;
  private LocalTime horaGeracao;
  private String filler;
  private String nomeDoParceiro;

  public ConciliacaoFinanceiraHeaderImpl(Integer tipoDoRegistro, String identificacao,
      LocalDate dataGeracao, LocalTime horaGeracao, String filler, String nomeDoParceiro) {
    super();
    this.tipoDoRegistro = tipoDoRegistro;
    this.identificacao = identificacao;
    this.dataGeracao = dataGeracao;
    this.horaGeracao = horaGeracao;
    this.filler = filler;
    this.nomeDoParceiro = nomeDoParceiro;
  }

  @Override
  public Integer getTipoDoRegistro() {
    return tipoDoRegistro;
  }

  @Override
  public String getIdentificacao() {
    return identificacao;
  }

  @Override
  public LocalDate getDataGeracao() {
    return dataGeracao;
  }

  @Override
  public LocalTime getHoraGeracao() {
    return horaGeracao;
  }

  @Override
  public String getFiller() {
    return filler;
  }

  @Override
  public String getNomeDoParceiro() {
    return nomeDoParceiro;
  }
}
