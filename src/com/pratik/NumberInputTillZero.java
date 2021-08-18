package com.pratik;

import java.util.Scanner;

public class NumberInputTillZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(sc.hasNextInt()) {
            int input = sc.nextInt();
            if(input == 'x' || input == 'X') {
                break;
            }
            sum = sum + input;
        }
        System.out.println(sum);
    }
}
