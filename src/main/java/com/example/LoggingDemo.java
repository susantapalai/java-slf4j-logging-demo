package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingDemo {

    private static final Logger logger =
            LoggerFactory.getLogger(LoggingDemo.class);

    public static void main(String[] args) {

        logger.info("Application started");

        String username = "Rahul";
        logger.debug("Processing user: {}", username);

        logger.info("User {} logged in successfully", username);

        int balance = 500;

        if (balance < 1000) {
            logger.warn("Low account balance: {}", balance);
        }

        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            logger.error("Calculation failed", e);
        }

        logger.info("Application finished");
    }
}