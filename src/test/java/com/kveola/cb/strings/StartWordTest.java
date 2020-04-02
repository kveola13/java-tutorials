package com.kveola.cb.strings;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.StartWord.startWord;
import static org.junit.jupiter.api.Assertions.*;

class StartWordTest {

    @Test
    void startWordTestOne() {
        assertEquals("hi", startWord("hippo", "hi"));
    }
    @Test
    void startWordTestTwo() {
        assertEquals("hip", startWord("hippo", "xip"));
    }
    @Test
    void startWordTestThree() {
        assertEquals("h", startWord("hippo", "i"));
    }
    @Test
    void startWordTestFour(){
        assertEquals("hi", startWord("hip", "zi"));
    }
}