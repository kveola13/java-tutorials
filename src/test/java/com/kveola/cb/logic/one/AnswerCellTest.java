package com.kveola.cb.logic.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.one.AnswerCell.answerCell;
import static org.junit.jupiter.api.Assertions.*;

class AnswerCellTest {

    @Test
    void answerCellTestOne() {
        assertTrue(answerCell(false, false, false));
    }

    @Test
    void answerCellTestTwo() {
        assertFalse(answerCell(false, false, true));
    }

    @Test
    void answerCellTestThree() {
        assertFalse(answerCell(true, false, false));
    }
}