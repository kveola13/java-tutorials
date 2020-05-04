package com.kveola.cb.ap.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.ap.one.MatchUp.matchUp;
import static org.junit.jupiter.api.Assertions.*;

class MatchUpTest {

    @Test
    void matchUpTestOne() {
        assertEquals(1, matchUp(new String[]{"aa", "bb", "cc"}, new String[]{"aaa", "xx", "bb"}));
    }

    @Test
    void matchUpTestTwo() {
        assertEquals(2, matchUp(new String[]{"aa", "bb", "cc"}, new String[]{"aaa", "b", "bb"}));
    }

    @Test
    void matchUpTestThree() {
        assertEquals(1, matchUp(new String[]{"aa", "bb", "cc"}, new String[]{"", "", "ccc"}));
    }
}