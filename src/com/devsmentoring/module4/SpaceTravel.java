package com.devsmentoring.module4;

import java.util.Scanner;

//zadz.10
public class SpaceTravel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean correctFuelLevel = false;

        while (!correctFuelLevel) {
            System.out.println("Podaj poziom paliwa pomiedzy 5000, a 30000");
            int chooseUserFuel = scanner.nextInt();

            if (chooseUserFuel < 5000 || chooseUserFuel > 30000) {
                System.out.println("Poziom paliwa niepoprawny, wybierz pomiedzy 5000, a 30000");
            } else (chooseUserFuel = > 5000 || chooseUserFuel < 30000){
                System.out.println("Poziom paliwa wystarczający");
                correctFuelLevel = true;

            }
        }
    }
}