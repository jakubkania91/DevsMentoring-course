package com.devsmentoring.module4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise15 {
    public static void main(String[] args) {
        System.out.println("ile chcesz losowan wybierz minimum dwa");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.valueOf(scanner.nextInt());
        int minimum = -100;
        int maximum = 100;
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            int randomNumber = ThreadLocalRandom.current().nextInt(minimum, maximum + 1);
            lista.add(randomNumber);
        }
        System.out.println(lista);
    }

}





