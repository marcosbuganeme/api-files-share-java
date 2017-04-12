package br.com.processamento.lote.dominio.dicionarioretorno;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

/**
 * Responsável por transformar o objeto de domínio
 * 
 * @author marcos.buganeme
 *
 */
@Component
public class DicionarioRetornoItemProcessor implements ItemProcessor<DicionarioRetornoArquivoTexto, DicionarioRetorno> {

	private static final Logger log = LoggerFactory.getLogger(DicionarioRetornoItemProcessor.class);

	@Override
	public DicionarioRetorno process(final DicionarioRetornoArquivoTexto arquivoTexto) throws Exception {
		log.info("Convertendo (" + arquivoTexto + ")");
		return new DicionarioRetorno(arquivoTexto.getCodigo(), arquivoTexto.getDescricao());
	}
}
