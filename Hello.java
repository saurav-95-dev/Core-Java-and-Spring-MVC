public class Hello {

    static void beforeAll() {
        System.out.println(" Setting up resources (runs once before all tests)");
    }

    static void afterAll() {
        System.out.println(" Cleaning up resources (runs once after all tests)");
    }

    static void beforeEach() {
        System.out.println(" Preparing before each test...");
    }

    static void afterEach() {
        System.out.println(" Cleaning after each test...");
    }

    public static void main(String[] args) {
        beforeAll();

        Calculator calc = new Calculator();

        // Test 1
        beforeEach();
        if (calc.add(2, 3) == 5)
            System.out.println("✅ add() test passed");
        else
            System.out.println(" add() test failed");
        afterEach();

        // Test 2
        beforeEach();
        if (calc.divide(8, 4) == 2)
            System.out.println("✅ divide() test passed");
        else
            System.out.println(" divide() test failed");
        afterEach();

        // Test 3
        beforeEach();
        try {
            calc.divide(5, 0);
            System.out.println(" divide by zero test failed");
        } catch (ArithmeticException e) {
            System.out.println("divide by zero test passed");
        }
        afterEach();

        afterAll();
    }
}
