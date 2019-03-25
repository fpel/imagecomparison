package br.com.pellegrini.imagecomparison.main;

import java.io.IOException;

import org.apache.log4j.Logger;

import br.com.pellegrini.imagecomparison.business.ImageFilesBusiness;
import br.com.pellegrini.imagecomparison.properties.ApplicationProperties;
import br.com.pellegrini.imagecomparison.properties.Log4jProperties;



public class Application {

	public static void main(String[] args) {
		
		Logger logger = Logger.getLogger(Application.class);
		
		try {
			logger.info("Iniciando processo leitura dos arquivos.");

			Log4jProperties.load();
			ApplicationProperties.load();
			
			ImageFilesBusiness imageBS = new ImageFilesBusiness();
			imageBS.converterXlsToOut();
			
//			ConversorBusiness conversor = new ConversorBusiness();
//			conversor.converterXlsToOut();
			
			logger.info("Processo encerrado com sucesso.");
			
		} catch (IOException e1) {
			e1.printStackTrace();
			logger.error("Processo encerrado com ERRO.");
			System.exit(-1);
//		} catch (Throwable e) {
//			e.printStackTrace();
//			logger.error("Processo encerrado com ERRO as " + Calendar.getInstance());
//			System.exit(-1);
		}
		
	}
}
