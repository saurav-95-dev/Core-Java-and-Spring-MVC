public class Hello {

    public static void main(String[] args) {

        // Create the object to test
        Calculator calc = new Calculator();

        // === TEST 1: add() ===
        int expectedSum = 8;
        int actualSum = calc.add(5, 3);
        if (expectedSum == actualSum) {
            System.out.println("✅ Test 1 Passed: add(5,3) returned " + actualSum);
        } else {
            System.out.println("❌ Test 1 Failed: expected " + expectedSum + " but got " + actualSum);
        }

        // === TEST 2: divide() ===
        int expectedDiv = 2;
        int actualDiv = calc.divide(6, 3);
        if (expectedDiv == actualDiv) {
            System.out.println("✅ Test 2 Passed: divide(6,3) returned " + actualDiv);
        } else {
            System.out.println("❌ Test 2 Failed: expected " + expectedDiv + " but got " + actualDiv);
        }

        // === TEST 3: divide by zero (should throw an exception) ===
        try {
            calc.divide(6, 0);
            System.out.println("Test 3 Failed: expected ArithmeticException");
        } catch (ArithmeticException e) {
            System.out.println("Test 3 Passed: caught ArithmeticException");
        }

        System.out.println("All manual tests executed successfully!");
    }
}
