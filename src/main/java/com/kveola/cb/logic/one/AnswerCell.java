package com.kveola.cb.logic.one;

public class AnswerCell {
    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        boolean normalAnswer = !isMom && !isMorning;
        return (isMom || normalAnswer) && !isAsleep;
    }
}
