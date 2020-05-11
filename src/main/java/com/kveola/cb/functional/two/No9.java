package com.kveola.cb.functional.two;

import java.util.List;
import java.util.stream.Collectors;

public class No9 {
    public static List<Integer> no9(List<Integer> nums) {
        return nums.stream().filter(n -> n % 10 != 9).collect(Collectors.toList());
    }
}
