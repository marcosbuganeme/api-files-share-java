package br.com.processamento.lote.dominio.shared;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author marcos.buganeme
 */
public interface Header {

  Integer getTipoDoRegistro();

  String getIdentificacao();

  LocalDate getDataGeracao();

  LocalTime getHoraGeracao();

  String getFiller();

  Integer getSequencial();
}
