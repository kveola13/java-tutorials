package com.kveola.cb.strings.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.one.MakeTags.makeTags;
import static org.junit.jupiter.api.Assertions.*;

class MakeTagsTest {

    @Test
    void makeTagsTestOne() {
        assertEquals("<i>Yay</i>", makeTags("i", "Yay"));
    }
    @Test
    void makeTagsTestTwo() {
        assertEquals("<i>Hello</i>", makeTags("i", "Hello"));
    }
    @Test
    void makeTagsTestThree() {
        assertEquals("<cite>Yay</cite>", makeTags("cite", "Yay"));
    }
}