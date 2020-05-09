package com.kveola.cb.functional;

import java.util.List;
import java.util.stream.Collectors;

public class RightDigit {
    public static List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream().map(n -> n % 10).collect(Collectors.toList());
    }
}
