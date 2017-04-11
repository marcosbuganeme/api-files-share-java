package br.com.processamento.lote.dominio.shared;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author marcos.buganeme
 */
public interface Header {

  /**
   * @return inteiro de uma posição que identifica o tipo do registro
   */
  Integer getTipoDoRegistro();

  /**
   * @return uma string que identifica o arquivo<br>
   *         Upload, Vencimento e Pagamento ao fornecedor
   */
  String getIdentificacao();

  /**
   * @return uma data com padrão ano/mes/dia -> AAAAMMDD
   */
  LocalDate getDataGeracao();

  /**
   * @return horário com padrão de hora/minuto/segundo -> hhMMss
   */
  LocalTime getHoraGeracao();
}
