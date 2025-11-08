class MathUtils {
    int square(int x) {
        return x * x;
    }

    int sum(int... nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }
}

public class Hello {
    public static void main(String[] args) {
        MathUtils math = new MathUtils();

        System.out.println("=== 🧪 TESTING MATH FUNCTIONS ===");

        // Test 1 — square()
        int expected = 25;
        int actual = math.square(5);
        if (expected == actual)
            System.out.println("square(5) passed");
        else
            System.out.println("square(5) failed: expected " + expected + " got " + actual);

        // Test 2 — sum()
        expected = 15;
        actual = math.sum(3, 5, 7);
        if (expected == actual)
            System.out.println("sum(3,5,7) passed");
        else
            System.out.println("sum(3,5,7) failed: expected " + expected + " got " + actual);
    }
}
