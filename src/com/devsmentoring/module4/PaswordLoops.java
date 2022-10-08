package com.devsmentoring.module4;

public class PaswordLoops {

    public static void main(String[] args) {

        char letter;
        char secondLetter;
        char thirdLetter;

        for (letter = 'a'; letter <= 'c'; letter++) {
            for (secondLetter = 'A'; secondLetter <= 'C'; secondLetter++) {
                System.out.println(letter + " | " + letter);
                System.out.println(secondLetter);



            }
        }
    }
}
