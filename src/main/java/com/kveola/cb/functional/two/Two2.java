package com.kveola.cb.functional.two;

import java.util.List;
import java.util.stream.Collectors;

public class Two2 {
    public static List<Integer> two2(List<Integer> nums) {
        return nums.stream().map(n -> n * 2).filter(n -> n % 10 != 2).collect(Collectors.toList());
    }
}
