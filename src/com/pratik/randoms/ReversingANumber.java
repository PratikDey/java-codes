package com.pratik.randoms;

import java.util.Scanner;

public class ReversingANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;
        while(number > 0) {
            int rem = number % 10;
            number = number / 10;
            answer = answer * 10 + rem;
        }
        System.out.println(answer);
    }
}
