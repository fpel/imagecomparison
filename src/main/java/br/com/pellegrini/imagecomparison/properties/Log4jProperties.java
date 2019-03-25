package br.com.pellegrini.imagecomparison.properties;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Log4jProperties extends PropertiesResource {
	static Logger logger = Logger.getLogger(Log4jProperties.class);
	private static final String FILE = "log4j.properties";
	private static Properties prop;

	public Log4jProperties() {
		super();
	}

	public static void load() throws IOException {
		prop = loadProperties(FILE);
		if (prop != null) {
			PropertyConfigurator.configure(prop);
		}
		logger.debug("Carregando as configurações do Log4J.");
	}
	
	public String getValue(String key) {
		return prop.getProperty(key);
	}

}
