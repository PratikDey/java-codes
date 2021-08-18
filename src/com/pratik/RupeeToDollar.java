package com.pratik;

import java.util.Scanner;

public class RupeeToDollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rupee = sc.nextDouble();
        double dollar = rupee * 0.013;
        System.out.println("Dollar is $" + dollar);
    }
}
