package br.com.processamento.lote.dominio.dicionarioretorno;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

/**
 * Responsável por transformar o objeto de domínio
 * 
 * @author marcos.buganeme
 *
 */
public class DicionarioRetornoItemProcessor implements ItemProcessor<DicionarioRetorno, DicionarioRetorno> {

	private static final Logger log = LoggerFactory.getLogger(DicionarioRetornoItemProcessor.class);

	@Override
	public DicionarioRetorno process(final DicionarioRetorno dicionario) throws Exception {
		log.info("Convertendo (" + dicionario + ")");
		return new DicionarioRetorno(dicionario.getCodigo(), dicionario.getDescricao());
	}
}
