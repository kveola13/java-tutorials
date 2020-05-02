package com.kveola.cb.ap.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.ap.one.WordsCount.wordsCount;
import static org.junit.jupiter.api.Assertions.*;

class WordsCountTest {

    @Test
    void wordsCountTestOne() {
        assertEquals(2, wordsCount(new String[]{"a", "bb", "b", "ccc"}, 1));
    }

    @Test
    void wordsCountTestTwo() {
        assertEquals(1, wordsCount(new String[]{"a", "bb", "b", "ccc"}, 3));
    }

    @Test
    void wordsCountTestThree() {
        assertEquals(0, wordsCount(new String[]{"a", "bb", "b", "ccc"}, 4));
    }
}