package com.kveola.cb.functional;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.kveola.cb.functional.Copies3.copies3;
import static com.kveola.cb.functional.Copies3.copies3Alt;
import static org.junit.jupiter.api.Assertions.*;

class Copies3Test {

    @Test
    void Copies3TestOne() {
        List<String> init = List.of("a", "bb", "ccc");
        List<String> copied = List.of("aaa", "bbbbbb", "ccccccccc");
        assertEquals(copied, copies3(init));
    }

    @Test
    void Copies3TestTwo() {
        List<String> init = List.of("24", "a", "");
        List<String> copied = List.of("242424", "aaa", "");
        assertEquals(copied, copies3(init));
    }

    @Test
    void Copies3TestThree() {
        List<String> init = List.of("hello", "there");
        List<String> copied = List.of("hellohellohello", "theretherethere");
        assertEquals(copied, copies3(init));
    }

    @Test
    void Copies3AltTestOne() {
        List<String> init = List.of("a", "bb", "ccc");
        List<String> copied = List.of("aaa", "bbbbbb", "ccccccccc");
        assertEquals(copied, copies3Alt(init));
    }

    @Test
    void Copies3AltTestTwo() {
        List<String> init = List.of("24", "a", "");
        List<String> copied = List.of("242424", "aaa", "");
        assertEquals(copied, copies3Alt(init));
    }

    @Test
    void Copies3AltTestThree() {
        List<String> init = List.of("hello", "there");
        List<String> copied = List.of("hellohellohello", "theretherethere");
        assertEquals(copied, copies3Alt(init));
    }
}