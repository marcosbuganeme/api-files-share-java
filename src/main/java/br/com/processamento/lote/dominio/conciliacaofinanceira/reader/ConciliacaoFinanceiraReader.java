package br.com.processamento.lote.dominio.conciliacaofinanceira.reader;

import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.FixedLengthTokenizer;
import org.springframework.batch.item.file.transform.Range;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import br.com.processamento.lote.dominio.conciliacaofinanceira.arquivo.layout.impl.ConciliacaoFinanceiraLayoutImpl;

/**
 * @author marcos.buganeme
 */
public class ConciliacaoFinanceiraReader extends FlatFileItemReader<ConciliacaoFinanceiraLayoutImpl> {

  private static final String[] CAMPOS = { "codigo", "descricao", "filler" };
  private static final Range[] POSICAO_DAS_COLUNAS = { new Range(1, 3), new Range(4, 258), new Range(259, 300) };

  @Override
  public void setResource(Resource resource) {
    setResource(new ClassPathResource("PG9920160829.txt"));
  }

  @Override
  public void setLineMapper(LineMapper<ConciliacaoFinanceiraLayoutImpl> lineMapper) {
    setLineMapper(new DefaultLineMapper<ConciliacaoFinanceiraLayoutImpl>() {
      {
        setLineTokenizer(new FixedLengthTokenizer() {
          {
            setNames(CAMPOS);
            setColumns(POSICAO_DAS_COLUNAS);
          }
        });
        setFieldSetMapper(new BeanWrapperFieldSetMapper<ConciliacaoFinanceiraLayoutImpl>() {
          {
            setTargetType(ConciliacaoFinanceiraLayoutImpl.class);
          }
        });
      }
    });
  }
}
