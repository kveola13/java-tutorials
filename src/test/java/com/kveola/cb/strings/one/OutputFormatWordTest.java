package com.kveola.cb.strings.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.one.OutputFormatWord.makeOutWord;
import static org.junit.jupiter.api.Assertions.*;

class OutputFormatWordTest {

    @Test
    void makeOutWordTestOne() {
        assertEquals("<<Yay>>", makeOutWord("<<>>", "Yay"));
    }
    @Test
    void makeOutWordTestTwo() {
        assertEquals("<<WooHoo>>", makeOutWord("<<>>", "WooHoo"));
    }
    @Test
    void makeOutWordTestThree() {
        assertEquals("[[word]]", makeOutWord("[[]]", "word"));
    }
}