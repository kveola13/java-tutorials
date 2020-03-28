package com.kveola.cb.strings;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.MakeAbba.makeAbba;
import static org.junit.jupiter.api.Assertions.*;

class MakeAbbaTest {

    @Test
    void makeAbbaTestOne() {
        assertEquals("HiByeByeHi", makeAbba("Hi", "Bye"));
    }
    @Test
    void makeAbbaTestTwo() {
        assertEquals("YoAliceAliceYo", makeAbba("Yo", "Alice"));
    }
    @Test
    void makeAbbaTestThree() {
        assertEquals("WhatUpUpWhat", makeAbba("What", "Up"));
    }
}