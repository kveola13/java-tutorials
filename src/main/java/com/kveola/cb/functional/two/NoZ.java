package com.kveola.cb.functional.two;

import java.util.List;
import java.util.stream.Collectors;

public class NoZ {
    public static List<String> noZ(List<String> strings) {
        return strings.stream().filter(s -> !s.contains("z")).collect(Collectors.toList());
    }
}
