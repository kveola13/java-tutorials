package com.kveola.basics;

import java.util.Arrays;

public class addList {
    public static void main(String[] args) {
        int[] vampireDiariesInts = new int[]{80, 77, 81, 84, 86, 83, 85,
                83, 85, 84, 83, 85, 87, 81, 88, 82, 84, 83, 85, 92, 89,
                86, 85, 84, 87, 87, 91, 89, 86, 85, 87, 85, 81, 81, 83,
                87, 84, 88, 89, 88, 90, 90};
        int[] witcherInts = new int[]{86, 81, 90, 88, 87, 86, 89, 92};
        int[] gameOfThronesInts = new int[]{90, 88, 87, 88, 91, 82, 82,
                90, 96, 95, 88, 85, 88, 88, 88, 91, 89, 88, 97, 94, 88,
                86, 89, 96, 90, 88, 87, 90, 99, 91, 91, 97, 89, 88, 87,
                97, 91, 97, 96, 97, 85, 85, 85, 87, 86, 80, 90, 99, 95,
                91, 85, 94, 87, 91, 97, 84, 86, 84, 99, 99, 86, 89, 92,
                98, 88, 91, 95, 76, 79, 75, 55, 60, 41};
        int[] rickAndMortyInts = new int[]{80, 88, 84, 87, 90, 91, 80, 88, 85,
                94, 85, 89, 89, 86, 96, 83, 93, 85, 77, 86, 94, 96, 82, 93, 82, 86, 90,
                98, 89, 80, 82, 91, 84, 86, 76, 90};
        System.out.printf("Rick and Morty average: %.2f\n", findAverageUsingStream(rickAndMortyInts));
        System.out.printf("Game of Thrones average: %.2f\n", findAverageUsingStream(gameOfThronesInts));
        System.out.printf("The Witcher average: %.2f\n", findAverageUsingStream(witcherInts));
        System.out.printf("Vampire Diaries average: %.2f\n", findAverageUsingStream(vampireDiariesInts));
    }

    public static double findAverageUsingStream(int[] array) {
        return Arrays.stream(array).average().orElse(Double.NaN);
    }
}
