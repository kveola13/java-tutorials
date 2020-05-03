package com.kveola.cb.ap.one;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.kveola.cb.ap.one.WordsWithoutList.wordsWithoutList;
import static org.junit.jupiter.api.Assertions.*;

class WordsWithoutListTest {

    @Test
    void wordsWithoutListTestOne() {
        List<String> testList = Arrays.asList("bb", "ccc");
        assertEquals(testList, wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 1));
    }

    @Test
    void wordsWithoutListTestTwo() {
        List<String> testList = Arrays.asList("a", "bb", "b");
        assertEquals(testList, wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 3));
    }

    @Test
    void wordsWithoutListTestThree() {
        List<String> testList = Arrays.asList("a", "bb", "b", "ccc");
        assertEquals(testList, wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 4));
    }
}