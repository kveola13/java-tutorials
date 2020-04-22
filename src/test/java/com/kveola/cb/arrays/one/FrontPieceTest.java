package com.kveola.cb.arrays.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.one.FrontPiece.frontPiece;
import static org.junit.jupiter.api.Assertions.*;

class FrontPieceTest {

    @Test
    void frontPieceTestOne() {
        assertArrayEquals(new int[]{1, 2}, frontPiece(new int[]{1, 2, 3}));
    }

    @Test
    void frontPieceTestTwo() {
        assertArrayEquals(new int[]{1, 2}, frontPiece(new int[]{1, 2}));
    }

    @Test
    void frontPieceTestThree() {
        assertArrayEquals(new int[]{1}, frontPiece(new int[]{1}));
    }
}