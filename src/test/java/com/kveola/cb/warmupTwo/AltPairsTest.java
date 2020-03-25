package com.kveola.cb.warmupTwo;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.warmupTwo.AltPairs.altPairs;
import static org.junit.jupiter.api.Assertions.*;

class AltPairsTest {

    @Test
    void altPairsTestOne() {
        assertEquals("kien", altPairs("kitten"));
    }
    @Test
    void altPairsTestTwo() {
        assertEquals("Chole", altPairs("Chocolate"));
    }
    @Test
    void altPairsTestThree() {
        assertEquals("Congrr", altPairs("CodingHorror"));
    }
}