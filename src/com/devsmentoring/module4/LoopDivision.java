package com.devsmentoring.module4;

import java.util.Scanner;

public class LoopDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita");
        int number = scanner.nextInt();
        int a = 50;
        while (a <= 100) {
            System.out.println("a = " + a % number );
            a++;
        }
    }
}
