package com.kveola.cb.strings;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.SeeColor.seeColor;
import static org.junit.jupiter.api.Assertions.*;

class SeeColorTest {

    @Test
    void seeColorTestOne() {
        assertEquals("red", seeColor("redxx"));
    }
    @Test
    void seeColorTestTwo() {
        assertEquals("", seeColor("xxred"));
    }
    @Test
    void seeColorTestThree() {
        assertEquals("blue", seeColor("blueTimes"));
    }
}