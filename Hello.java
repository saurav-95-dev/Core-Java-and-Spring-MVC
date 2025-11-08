class Divider {
    int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a / b;
    }
}

public class Hello {
    public static void main(String[] args) {
        Divider d = new Divider();

        System.out.println("\n=== TESTING EXCEPTIONS ===");

        try {
            d.divide(10, 0);
            System.out.println("Test failed (exception not thrown)");
        } catch (ArithmeticException e) {
            System.out.println("Test passed (caught ArithmeticException)");
        }
    }
}
