package com.kveola.cb.strings.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.one.HelloName.helloName;
import static org.junit.jupiter.api.Assertions.*;

class HelloNameTest {

    @Test
    void helloNameTestOne() {
        assertEquals("Hello Bob!", helloName("Bob"));
    }
    @Test
    void helloNameTestTwo() {
        assertEquals("Hello Alice!", helloName("Alice"));
    }
    @Test
    void helloNameTestThree() {
        assertEquals("Hello X!", helloName("X"));
    }
}