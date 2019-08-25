package com.kveola.hackerrank;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class intro {
    public static void main(String[] args) {
        welcomeToJava();
        in_n_out_1();
        if_else();
        in_n_out_2();
        output_formatting();
        java_loops_1();
        java_datatypes();
        end_of_file();
        init_block();
        int_to_string();
        findDay(12, 20, 1993);
        currency_formatter();
        java_strings();
        System.out.println(java_substrings("welcometojava", 3));
        reverse_string();
        System.out.println(isAnagram("Yes", "sey"));
        stringTokens();
    }

    private static void welcomeToJava() {
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }

    private static void in_n_out_1() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        scan.close();
    }

    private static void if_else() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String answer = "";
        if (N % 2 == 1) {
            answer = "Weird";
        } else {
            if (N >= 6 && N <= 20) {
                answer = "Weird";
            } else {
                answer = "Not Weird";
            }
        }
        System.out.println(answer);
        scanner.close();
    }


    private static void in_n_out_2() {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();


        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

    private static void output_formatting() {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d\n", s1, x);
        }
        System.out.println("================================");
    }

    private static void java_loops_1() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (!(N > 20) && !(N < 2)) {
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d\n", N, i, N * i);
            }
        }
        scanner.close();
    }

    private static void java_loops_2() {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        if (t > 0 && t < 500) {
            for (int i = 0; i < t; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                for (int j = 0; j < n; j++) {
                    a = a + (int) Math.pow(2, j) * b;
                    System.out.print(a + " ");
                }
                System.out.println();
            }
        }
        in.close();
    }

    private static void java_datatypes() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) System.out.println("* byte");
                if (x >= -Math.pow(2, 15) && x <= Math.pow(2, 15) - 1)
                    System.out.println("* short");
                if (x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1)
                    System.out.println("* int");
                if (x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1)
                    System.out.println("* long");
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }

    private static void end_of_file() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (scanner.hasNext()) {
            count++;
            System.out.print(count + " ");
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }

    private static void init_block() {
        Scanner scanner = new Scanner(System.in);
        int B = scanner.nextInt();
        int H = scanner.nextInt();

        if (B > 0 && H > 0) {
            System.out.println(B * H);
        } else {
            System.out.println("java.lang.Exception: Breath and height must be positive");
        }
    }

    private static void int_to_string() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = Integer.toString(n);
        if (n == Integer.parseInt(s)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer.");
        }
    }

    private static String findDay(int month, int day, int year) {
        return LocalDate.of(year, month, day).getDayOfWeek().name();
    }

    private static void currency_formatter() {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);


        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

    private static void java_strings() {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        String substr = A.substring(0, 1).toUpperCase() + A.substring(1);
        String second_substring = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(substr + " " + second_substring);
    }

    private static String java_substrings(String s, int k) {
        String smallest = "";
        String largest = "";
        int index = 0;
        while (index < s.length() - k + 1) {
            String currentString = s.substring(index, index + k);
            if (index == 0) {
                smallest = currentString;
            }
            if (smallest.compareTo(currentString) > 0) {
                smallest = currentString;
            }
            if (largest.compareTo(currentString) < 0) {
                largest = currentString;
            }
            index++;
        }
        return smallest + "\n" + largest;
    }

    private static void reverse_string() {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String reversed = new StringBuffer(A).reverse().toString();
        if (A.equals(reversed)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean isAnagram(String a, String b) {
        int first_length = a.length();
        int second_length = b.length();
        if (first_length != second_length) return false;

        a = a.toLowerCase();
        b = b.toLowerCase();

        int[] char_frequencies = new int[26];
        for (int i = 0; i < first_length; i++) {
            char current_char = a.charAt(i);
            //System.out.println("current char: " + current_char);
            int index = current_char - 'a';
            //System.out.println("index: " + index);
            char_frequencies[index]++;
            //System.out.println("charfreq: " + char_frequencies[index]);
        }
        for (int i = 0; i < second_length; i++) {
            char current_char = b.charAt(i);
            int index = current_char - 'a';
            char_frequencies[index]--;
        }
        for (int i = 0; i < 26; i++) {
            if (char_frequencies[i] != 0) return false;
        }
        return true;
    }

    private static void stringTokens() {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String remove = s.replaceAll("[^a-zA-Z]+", " ");
        String[] split = remove.split(" ");
        System.out.println(split.length);
        for (String t: split) {
            System.out.println(t);
        }
        scan.close();
    }
}
