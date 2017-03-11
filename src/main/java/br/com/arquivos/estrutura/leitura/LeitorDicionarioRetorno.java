package br.com.arquivos.estrutura.leitura;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Classe que contêm a lógica de leitura do arquivo de dicionário de retorno
 * 
 * @author marcos
 *
 */
public class LeitorDicionarioRetorno {

	private static final Log logger = LogFactory.getLog(LeitorDicionarioRetorno.class);

	private String caminhoArquivo;
	private Charset charset;
	List<DicionarioRetorno> dicionarios;

	public LeitorDicionarioRetorno(String caminhoArquivo) {
		this.caminhoArquivo = caminhoArquivo;
		this.charset = Charset.forName("ISO-8859-1");
		this.dicionarios = new ArrayList<>();
	}

	public LeitorDicionarioRetorno(String caminhoArquivo, Charset charset) {
		this.caminhoArquivo = caminhoArquivo;
		this.charset = charset;
		this.dicionarios = new ArrayList<>();
	}

	public void ler() {
		Path path = Paths.get(caminhoArquivo);
		List<String> linhas = new ArrayList<>();

		try (BufferedReader br = Files.newBufferedReader(path, charset)) {

			linhas = br.lines().collect(Collectors.toList());

			for (String linha : linhas) {
				dicionarios.add(new DicionarioRetorno(linha.substring(0, 3), linha.substring(3, 258)));
			}

		} catch (IOException exception) {

			StringBuilder builder = new StringBuilder();
			builder.append("A leitura do arquivo ").append(caminhoArquivo).append(" falhou !!");
			logger.error(builder.toString(), exception);
		}
	}

	public void imprime() {
		for (DicionarioRetorno dicionario : dicionarios) {
			System.out.println(dicionario.getCodigo());
			System.out.println(dicionario.getDescricao());
		}
	}
}