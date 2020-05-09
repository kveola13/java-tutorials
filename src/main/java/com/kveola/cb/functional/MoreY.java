package com.kveola.cb.functional;

import java.util.List;
import java.util.stream.Collectors;

public class MoreY {
    public static List<String> moreY(List<String> strings) {
        return strings.stream().map(s -> "y" + s + "y").collect(Collectors.toList());
    }
}
