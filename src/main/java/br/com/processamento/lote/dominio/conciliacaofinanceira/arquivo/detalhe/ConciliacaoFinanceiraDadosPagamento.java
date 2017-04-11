package br.com.processamento.lote.dominio.conciliacaofinanceira.arquivo.detalhe;

import java.time.LocalDate;
import java.util.Optional;

import br.com.processamento.lote.dominio.shared.Detalhe;

/**
 * Representa o detalhe 1 do arquivo PG - Conciliação Financeira
 * @author marcos.buganeme
 */
public interface ConciliacaoFinanceiraDadosPagamento extends Detalhe {

  /**
   * @return identifica o tipo do registro <br><b>valor esperado fixo é 1</b>
   */
  Integer getTipoRegistro();

  /**
   * @return código de identificação da empresa
   */
  String getCodigoEmpresa();

  /**
   * @return código de identificação da loja
   */
  String getCodigoLoja();

  /**
   * @return data de pagamento<br> padrão de formato ano/mes/dia -> aaaaMMdd
   */
  LocalDate getDataPagamento();

  /**
   * @return número do documento de borderô
   */
  String getBordero();

  /**
   * @return sinal que indica se o lançamento é débito(-) ou crédito (+)
   */
  String getSinal();

  /**
   * @return valor do pagamento
   */
  Integer getValorLancamento();

  /**
   * @return razão social do parceiro
   */
  String getNomeCredito();

  /**
   * @return número do banco para onde foi enviado o pagamento
   */
  Integer getNumeroBanco();

  /**
   * @return número da agência para onde foi enviado o pagamento
   */
  String getNumeroAgencia();

  /**
   * @return número da conta para onde foi enviado o pagamento
   */
  String getNumeroConta();

  /**
   * @return histórico informado referente ao lançamento
   */
  String getHistorico();

  String getEvento();

  /**
   * @return 88 posições com espaços em branco<br>
   *         Este campo não é obrigatório
   */
  Optional<String> getFiller();
}
