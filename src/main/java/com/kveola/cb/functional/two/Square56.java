package com.kveola.cb.functional.two;

import java.util.List;
import java.util.stream.Collectors;

public class Square56 {
    public static List<Integer> square56(List<Integer> nums) {
        return nums.stream().map(n -> n * n + 10).filter(n -> n % 10 <= 4 || n % 10 >= 7).collect(Collectors.toList());
    }
}
