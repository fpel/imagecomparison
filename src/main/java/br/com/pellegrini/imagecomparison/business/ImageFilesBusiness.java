package br.com.pellegrini.imagecomparison.business;

import java.util.List;

import org.apache.log4j.Logger;

import br.com.pellegrini.imagecomparison.dao.ArquivoDao;
import br.com.pellegrini.imagecomparison.main.Application;

public class ImageFilesBusiness {

	static Logger logger = Logger.getLogger(Application.class);
	
	public ImageFilesBusiness() {}
	
	/*
	 * 
	 */
	public void converterXlsToOut() {
		
		/*
		 * carregar a lista de arquivos do diretorio
		 * um-a-um
		 *     ler o arquivo - ok
		 *     carregar o conteudo do arquivo para o objeto (arquivo) - ok
		 *     converte o objeto em arquivo texto OUT
		 *     move o XLS para o backup
		 *     vai para o proximo arquivo
		 */
		
		
		ArquivoDao arquivoDao = new ArquivoDao();
		List<String> lstArquivos = arquivoDao.carregarListaArquivosInput();
		
		logger.debug("Quantidade de arquivos no diretorio: " + lstArquivos.size());
		for (String nomeArquivo : lstArquivos) {
			logger.debug(" = " + nomeArquivo);
//			Arquivo arquivo = arquivoDao.lerDadosDoArquivo(nomeArquivo);
//			arquivoDao.gerarArquivoPayware(arquivo, nomeArquivo.substring(0, nomeArquivo.indexOf(".")) + ".txt");
//			arquivoDao.moveArquivoBackup(nomeArquivo);
		}
	}
	
	
	
}
