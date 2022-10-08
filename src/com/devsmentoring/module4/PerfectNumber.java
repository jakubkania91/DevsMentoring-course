package com.devsmentoring.module4;

import java.util.Scanner;

// task 16
public class PerfectNumber {
    public static void main(String[] args) {

        System.out.println("Podaj liczbe doskonala");

       Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();

        int number = value;

        for (int i = 1; i < value; i++) {
            System.out.println(i);
          if (number % i == 0) {
              System.out.println("Dzielnik");
          }
        }
    }
}
