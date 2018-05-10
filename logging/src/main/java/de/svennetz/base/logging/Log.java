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
		String logMessage = String.format("%s=%s %s=%s", "application", "tippspiel", "message", message);
		logger.info(logMessage);
	}
	
	public void warn(String message) {
		String logMessage = String.format("%s=%s %s=%s", "application", "tippspiel", "message", message);
		logger.warn(logMessage);
	}
	
	public void error(String message) {
		String logMessage = String.format("%s=%s %s=%s", "application", "tippspiel", "message", message);
		logger.error(logMessage);
	}
}
