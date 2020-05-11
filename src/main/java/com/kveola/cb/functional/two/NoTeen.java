package com.kveola.cb.functional.two;

import java.util.List;
import java.util.stream.Collectors;

public class NoTeen {
    public static List<Integer> noTeen(List<Integer> nums) {
        return nums.stream().filter(n -> n <= 12 || n >= 20).collect(Collectors.toList());
    }
}
