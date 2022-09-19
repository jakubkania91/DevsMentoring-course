import java.util.Scanner;

public class PassValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj liczbe: ");
            int value = scanner.nextInt();
            if (value == 0) {
                break;
            }
            sum += value;
        }
        System.out.println("Suma podanych liczb to: " + sum);
    }
}
