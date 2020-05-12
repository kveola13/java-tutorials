package com.kveola.cb.functional.two;

import java.util.List;
import java.util.stream.Collectors;

public class NoYY {
    public static List<String> noYY(List<String> strings) {
        return strings.stream().filter(s -> !s.endsWith("y") && !s.contains("yy")).map(s -> s + "y").collect(Collectors.toList());
    }
}
