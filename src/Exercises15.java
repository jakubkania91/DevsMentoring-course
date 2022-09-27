import java.util.Random;
import java.util.Scanner;

public class Exercises15 {
    public static void main(String[] args) {
        System.out.println("ile chcesz losowan wybierz minimum dwa");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println();



        Random random = new Random();
        int userNumber = random.nextInt(-100, 100) + 1;

        if (number != 0) {
            System.out.println(userNumber);

        }

    }
}


