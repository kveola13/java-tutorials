package com.kveola.basics;

import org.junit.Test;

public class LoggingTest {
    @Test
    public void shouldDemonstrateLogging() {
        Logging logging = new Logging();
        logging.process("BMW");
    }
    @Test
    public void shouldDemonstrateInterfaces(){
        Logging logging = new Logging();
        logging.play();
    }
}