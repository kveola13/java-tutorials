package com.kveola.cb.logic.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.one.TeaParty.teaParty;
import static org.junit.jupiter.api.Assertions.*;

class TeaPartyTest {

    @Test
    void teaPartyTestOne() {
        assertEquals(1, teaParty(6, 8));
    }

    @Test
    void teaPartyTestTwo() {
        assertEquals(0, teaParty(3, 8));
    }

    @Test
    void teaPartyTestThree() {
        assertEquals(2, teaParty(20, 6));
    }
}