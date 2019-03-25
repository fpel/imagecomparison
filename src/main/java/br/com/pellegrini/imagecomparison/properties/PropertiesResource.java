package br.com.pellegrini.imagecomparison.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import br.com.pellegrini.imagecomparison.util.Mensagens;



public class PropertiesResource {

	private static final String APP_CONF_DIR = "app.conf.dir";

	protected static Properties loadProperties(String arquivo) throws IOException {
		Properties retorno = null;
		String appConfDir;
		appConfDir = System.getProperty(APP_CONF_DIR);
		if (appConfDir != null) {
			File file = new File(appConfDir + "/" + arquivo);
			retorno = new Properties();
			try {
				retorno.load(new FileInputStream(file));
			} catch (IOException e) {
				System.out.println(Mensagens.ARQUIVO_PROPRIEDADES_NAO_EXISTENTE + ": " + appConfDir + "/" + arquivo);
				e.printStackTrace();
				throw e;
			}
		} else {
			System.out.println(Mensagens.ARQUIVO_PROPRIEDADES_NAO_EXISTENTE + ": " + appConfDir + "/" + arquivo);
			throw new IOException();
		}
		return retorno;
	}
	
}
