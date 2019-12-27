package com.kveola.basics;

import org.junit.Test;

public class CarLoggingTest {
    @Test
    public void shouldDemonstrateLogging() {
        CarLogging carLogging = new CarLogging();
        carLogging.process("BMW");
    }
}