package com.kveola.cb.logic.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.one.BlueTicket.blueTicket;
import static org.junit.jupiter.api.Assertions.*;

class blueTicketTest {

    @Test
    void blueTicketTestOne() {
        assertEquals(10, blueTicket(9, 1, 0));
    }

    @Test
    void blueTicketTestTwo() {
        assertEquals(0, blueTicket(9, 2, 0));
    }

    @Test
    void blueTicketTestThree() {
        assertEquals(10, blueTicket(6, 1, 4));
    }
}