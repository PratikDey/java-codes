package com.pratik.randoms;

import java.util.Scanner;

public class CalculateValueFromOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter operator: ");
        char operator = sc.next().charAt(0);
        //char a = 0; this isnt right
        //char a = sc.next().charAt(0);
        if(operator == '+') {
            int sum = num1 + num2;
            System.out.println(sum);
        } else if(operator == '-') {
            int sub = num1 - num2;
            System.out.println(sub);
        } else if(operator == '*') {
            int mul = num1 * num2;
            System.out.println(mul);
        } else if (operator == '/') {
            int div = num1 / num2;
            System.out.println(div);
        } else {
            System.out.println("Cannot compute");
        }
    }
}
