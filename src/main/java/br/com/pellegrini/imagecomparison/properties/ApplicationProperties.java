package br.com.pellegrini.imagecomparison.properties;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class ApplicationProperties extends PropertiesResource {
	static Logger logger = Logger.getLogger(ApplicationProperties.class);
	private static final String FILE = "main.properties";
	private static Properties prop;

	public ApplicationProperties() {
		super();
	}

	public static void load() throws IOException {
		logger.debug("Carregando as configurações do Main.");
		prop = loadProperties(FILE);
		if (prop != null) {
			PropertyConfigurator.configure(prop);
		}
		logger.debug("Sucesso");
	}
	
	public static String getValue(String key) {
		return prop.getProperty(key);
	}

}
