package org.example;

import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum = sum + a*b;

        }
        if(T == sum) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }






        }

    }

