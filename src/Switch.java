public class Switch {
    public static void main(String[] args) {
        String zodiacSign = "lion";
        switch (zodiacSign) {
            case "Aqurius":
                System.out.println("1");

            case "lion":
                System.out.println("2");
            case "pisces":
                System.out.println("3");

            default:
                System.out.println("brak dopasowania");
        }
    }
}
