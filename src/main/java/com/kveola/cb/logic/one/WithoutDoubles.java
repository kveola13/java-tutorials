package com.kveola.cb.logic.one;

public class WithoutDoubles {
    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles && die1 == die2) {
            if (die1 == 6) {
                return 1 + die2;
            }
            return 1 + die1 + die2;
        }
        return die1 + die2;
    }
}
