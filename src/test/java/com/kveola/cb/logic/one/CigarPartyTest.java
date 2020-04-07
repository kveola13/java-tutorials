package com.kveola.cb.logic.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.one.CigarParty.cigarParty;
import static org.junit.jupiter.api.Assertions.*;

class CigarPartyTest {

    @Test
    void cigarPartyTestOne() {
        assertFalse(cigarParty(30, false));
    }

    @Test
    void cigarPartyTestTwo() {
        assertTrue(cigarParty(50, false));
    }

    @Test
    void cigarPartyTestThree() {
        assertTrue(cigarParty(70, true));
    }
}