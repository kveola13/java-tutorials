package com.kveola.cb.logic.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.one.RedTicket.redTicket;
import static org.junit.jupiter.api.Assertions.*;

class RedTicketTest {

    @Test
    void redTicketTestOne() {
        assertEquals(10, redTicket(2, 2, 2));
    }

    @Test
    void redTicketTestTwo() {
        assertEquals(0, redTicket(2, 2, 1));
    }

    @Test
    void redTicketTestThree() {
        assertEquals(5, redTicket(0, 0, 0));
    }
}