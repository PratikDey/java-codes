package com.pratik.randoms;

import java.util.Scanner;

public class AlphabetCaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z') {
            System.out.print("Lowercase");
        } else if(ch >= 'A' && ch <= 'Z') {
            System.out.print("Uppercase");
        } else {
            System.out.print("Input an alphabet please!!");
        }
    }
}
