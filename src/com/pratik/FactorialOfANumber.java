package com.pratik;

import java.util.Scanner;

public class FactorialOfANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int i = 1;
        int fact = 1;
        while(i <= num) {
            fact = fact * i;
            i++;
        }
        System.out.println(fact);
    }
}
