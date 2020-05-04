package com.kveola.cb.ap.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.ap.one.WordsWithout.wordsWithout;
import static org.junit.jupiter.api.Assertions.*;

class WordsWithoutTest {

    @Test
    void wordsWithoutTestOne() {
        assertArrayEquals(new String[]{"b", "c"}, wordsWithout(new String[]{"a", "b", "c", "a"}, "a"));
    }

    @Test
    void wordsWithoutTestTwo() {
        assertArrayEquals(new String[]{"a", "c", "a"}, wordsWithout(new String[]{"a", "b", "c", "a"}, "b"));
    }

    @Test
    void wordsWithoutTestThree() {
        assertArrayEquals(new String[]{"a", "b", "a"}, wordsWithout(new String[]{"a", "b", "c", "a"}, "c"));
    }
}