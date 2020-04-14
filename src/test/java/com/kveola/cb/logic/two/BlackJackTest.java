package com.kveola.cb.logic.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.two.BlackJack.blackjack;
import static org.junit.jupiter.api.Assertions.*;

class BlackJackTest {

    @Test
    void blackjackTestOne() {
        assertEquals(21, blackjack(19, 21));
    }

    @Test
    void blackjackTestTwo() {
        assertEquals(21, blackjack(21, 19));
    }

    @Test
    void blackjackTestThree() {
        assertEquals(19, blackjack(19, 22));
    }
}