package com.pratik;

import java.util.Scanner;

public class FibonacciProblem {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 2; i <= n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        System.out.println(b);
    }
}
