package com.kveola.basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarLogging {
    private final Logger log = LoggerFactory.getLogger(CarLogging.class);

    public void process(String input) {
        log.debug("processing car: {}", input);
    }
}
