package org.example;

import java.util.Scanner;

public class TripleMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        long result = a+b+c;

        System.out.println(result);
    }
}
