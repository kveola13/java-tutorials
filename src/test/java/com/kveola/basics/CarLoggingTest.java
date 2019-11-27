package com.kveola.basics;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarLoggingTest {
    @Test
    public void shouldDemonstrateLogging() {
        CarLogging carLogging = new CarLogging();
        carLogging.process("BMW");
    }
}