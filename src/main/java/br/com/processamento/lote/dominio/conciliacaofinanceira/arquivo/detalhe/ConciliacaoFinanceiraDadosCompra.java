package br.com.processamento.lote.dominio.conciliacaofinanceira.arquivo.detalhe;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Optional;

import br.com.processamento.lote.dominio.shared.Detalhe;

/**
 * Representa o detalhe 2 do arquivo PG - Conciliação Financeira
 * @author marcos.buganeme
 */
public interface ConciliacaoFinanceiraDadosCompra extends Detalhe {

  /**
   * @return identifica o tipo do registro <br>
   *         <b>valor esperado fixo é 2 e representa os dados do detalhe 2</b>
   */
  Integer getTipoRegistro();

  /**
   * @return número de cadastro nacional de pessoa jurídica
   */
  BigInteger getCnpj();

  /**
   * @return número do cartão
   */
  BigInteger getNumeroCartao();

  /**
   * @return 8 posições com números 0<br>
   *         Exemplo: 00000000
   */
  Integer getFiller8Posicoes();

  /**
   * @return número da nota fiscal
   */
  BigInteger getNumeroTransacao();

  /**
   * @return quantidade de parcelas do contrato
   */
  Integer getQuantidadeTotalParcelas();

  /**
   * @return número da parcela<br>
   *         Caso seja efetuado o pagamento de todo o contrato, o campo será preenchido com 0
   */
  Integer getNumeroParcela();

  /**
   * @return valor da compra
   */
  BigDecimal getValorCompra();

  /**
   * @return valor da parcela com juros
   */
  BigDecimal getValorParcela();

  /**
   * @return flag que indica se o pagamento foi antecipado<br>
   *         0 - Não, 1 - Sim
   */
  String getPagamentoAntecipado();

  /**
   * @return vencimento da parcela -> padrão de data ano/mes/dia aaaaMMdd
   */
  LocalDate getDataVencimentoParcela();

  /**
   * @return 11 posições de espaços em vazios em branco<br>
   *         Este campo não é obrigatório
   */
  Optional<String> getFiller11Posicoes();

  /**
   * @return número do documento de borderô
   */
  String getBordero();

  /**
   * @return valor do lançamento
   */
  BigDecimal getValorDoLancamento();

  /**
   * @return 42 posições de espaços vazios em branco<br>
   *         Este campo não é obrigatório
   */
  Optional<String> getFiller42Posicoes();

  /**
   * @return valor do desconto se existir<br>
   *         Este campo não é obrigatório
   */
  Optional<BigDecimal> getValorDoDesconto();

  /**
   * @return data do pagamento, é a mesma do detalhe 1 - Dados do pagamento<br>
   *         Este campo não é obrigatório
   */
  Optional<LocalDate> getDataDoPagamento();

  /**
   * @return flag que indica o status do lançamento do pagamento<br>
   *         0 - agendamento, 1 - pagamento
   */
  Integer getConfirmacaoPagamento();

  /**
   * @return 1 posição de espaço vazio em branco<br>
   *         Este campo não é obrigatório
   */
  Optional<String> getFiller1Posicao();

  /**
   * @return valor de PIS/COFINS<br>
   *         É aplicado em eventos RPASSP e RPASSC
   */
  BigDecimal getValorDosImpostos();

  /**
   * @return 110 posições vazios com espaços em branco
   */
  Optional<Integer> getFiller110Posicoes();
}
