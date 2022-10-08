package com.devsmentoring.module3;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int number = scaner.nextInt();

        if (number % 3 == 0 && number % 4 == 0) {
            System.out.println("com.devsmentoring.module3.FizzBuzz");
        } else if (number % 4 == 0) {
            System.out.println("Buzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println("N/A");
        }
    }
}

