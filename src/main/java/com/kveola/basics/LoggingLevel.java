package com.kveola.basics;

public enum LoggingLevel {
    PENDING(1, ""), PROCESSING(2, ""), PROCESSED(3, ""), ERROR(4, "");
    private int i;
    String s;
    private LoggingLevel(int i, String s) {
        this.i = i;
        this.s = s;
    }

    public int code() {
        return i;
    }

    public boolean isPending() {
        return this == PENDING;
    }
}
