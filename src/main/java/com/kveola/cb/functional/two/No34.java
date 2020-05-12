package com.kveola.cb.functional.two;

import java.util.List;
import java.util.stream.Collectors;

public class No34 {
    public static List<String> no34(List<String> strings) {
        return strings.stream().filter(s -> s.length() <= 2 || s.length() >= 5).collect(Collectors.toList());
    }
}
