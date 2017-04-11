package br.com.processamento.lote.dominio.shared;

/**
 * @author marcos.buganeme
 */
public interface Trailler {

  /**
   * @return inteiro de uma posição representando o tipo do registro
   */
  Integer getTipoDoRegistro();

  /**
   * @return quantidade total de registros, menos header e trailler
   */
  Integer getTotalDeRegistros();
}
