package com.kveola.cb.functional.one;

import java.util.List;
import java.util.stream.Collectors;

public class NoX {
    public static List<String> noX(List<String> strings) {
        return strings.stream().map(s -> s.replaceAll("x", "")).collect(Collectors.toList());
    }
}
