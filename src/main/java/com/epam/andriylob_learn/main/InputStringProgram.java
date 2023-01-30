package com.epam.andriylob_learn.main;

import java.util.Scanner;

public class InputStringProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        int inputInt = scan.nextInt();
        System.out.println("hello  "+ input+inputInt+"  !!!");
    }
}
