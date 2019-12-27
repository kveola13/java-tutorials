package com.kveola.basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class CarLogging {
    private final Logger log = LoggerFactory.getLogger(CarLogging.class);

    public void process(String argument) {
        CarState carState = CarState.from(argument);
    }
}
