package com.pratik;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        int principle = sc.nextInt();
        System.out.print("Enter Time: ");
        int time = sc.nextInt();
        System.out.print("Enter Rate of Interest: ");
        float rate = sc.nextFloat();

        float interest = ((principle * rate * time) / 100);
        System.out.println(interest);
    }
}
