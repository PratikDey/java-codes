package com.pratik.randoms;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FactorOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 1; i < num; i++) {
            if(num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
