import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type 3 custom words: ");
        String words = scanner.next();
        System.out.println(words);
    }
}
