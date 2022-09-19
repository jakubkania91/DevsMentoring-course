public class ValueChecker {
    public static void main(String[] args) {
        int value = 99;
        String isEven = value % 2 == 0 ? "parzysta" : "nieparzysta";
        System.out.println(isEven);
    }
}
