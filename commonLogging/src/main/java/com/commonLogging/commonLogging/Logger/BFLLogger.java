package com.commonLogging.commonLogging.Logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class BFLLogger {

	// Logger logger = LoggerFactory.getLogger(BFLLogger.class);

	/*
	 * public Logger info(String msg) {
	 * 
	 * return Logger.getLogger(msg); }
	 */

	private static Logger getLoggerInstance(String targetClass) {

		System.out.println("inside instance creation");
		return LoggerFactory.getLogger(targetClass);
	}

	public void info(String msg, String targetClass) {

		BFLLogger.getLoggerInstance(targetClass).info("msg is  " + msg);
	}
}
