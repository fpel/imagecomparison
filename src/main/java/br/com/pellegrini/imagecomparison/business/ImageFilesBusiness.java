package br.com.pellegrini.imagecomparison.business;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import br.com.pellegrini.imagecomparison.dao.ArquivoDao;
import br.com.pellegrini.imagecomparison.properties.ApplicationProperties;

public class ImageFilesBusiness {

	static Logger logger = Logger.getLogger(ImageFilesBusiness.class);
	List<String> lstArquivos = new ArrayList<>();
	ArquivoDao arquivoDao = new ArquivoDao();
	
	public ImageFilesBusiness() {}
	
	/*
	 * 
	 */
	public void loadFilesInput() {
		
		lstArquivos = arquivoDao.getFilesInput();
		
		logger.debug("Quantidade de arquivos no diretorio: " + lstArquivos.size());
		for (String nomeArquivo : lstArquivos) {
			logger.debug(" = " + nomeArquivo);
//			Arquivo arquivo = arquivoDao.lerDadosDoArquivo(nomeArquivo);
//			arquivoDao.gerarArquivoPayware(arquivo, nomeArquivo.substring(0, nomeArquivo.indexOf(".")) + ".txt");
//			arquivoDao.moveArquivoBackup(nomeArquivo);
		}
	}
	
	
	
	public void teste() {
		String dir = ApplicationProperties.getValue("dir.input");
		for (String nomeArquivo : lstArquivos) {
			BufferedImage imagem = arquivoDao.loadImage(dir + "/" + nomeArquivo);
			System.out.println(imagem);
			arquivoDao.saveImage(imagem);
		}
		
		
	}
	
	
	
	
}
