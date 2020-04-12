package com.kveola.cb.logic.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.one.GreenTicket.greenTicket;
import static org.junit.jupiter.api.Assertions.*;

class GreenTicketTest {

    @Test
    void greenTicketTestOne() {
        assertEquals(0, greenTicket(1, 2, 3));
    }

    @Test
    void greenTicketTestTwo() {
        assertEquals(20, greenTicket(2, 2, 2));
    }

    @Test
    void greenTicketTestThree() {
        assertEquals(10, greenTicket(1, 1, 2));
    }
}