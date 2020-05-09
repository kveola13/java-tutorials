package com.kveola.cb.functional;

import java.util.List;
import java.util.stream.Collectors;

public class Copies3 {
    public static List<String> copies3(List<String> strings) {
        return strings.stream().map(s -> s.repeat(3)).collect(Collectors.toList());
    }
}
