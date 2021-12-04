package com.pratik.randoms;

import java.util.Scanner;

public class OccurencesOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int occurence = sc.nextInt();
        while(n > 0) {
            int rem = n % 10;
            if(rem == occurence) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
