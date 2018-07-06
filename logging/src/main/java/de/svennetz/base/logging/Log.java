package de.svennetz.base.logging;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log {
	
	private final Logger logger;
	
	public Log(Class<?> c){
		logger = LogManager.getLogger(c);
		BasicConfigurator.configure();
	}
	
	public void info(String message) {
		logger.info(message);
	}
	
	public void warn(String message) {
		logger.warn(message);
	}
	
	public void error(String message) {
		logger.error(message);
	}
}

