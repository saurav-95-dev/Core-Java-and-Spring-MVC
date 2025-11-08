class StringUtils {
    String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(reverse(str));
    }
}

public class Hello {
    public static void main(String[] args) {
        StringUtils s = new StringUtils();

        System.out.println("\n===  TESTING STRING FUNCTIONS ===");

        // Test 1 — reverse
        String expected = "avaJ";
        String actual = s.reverse("Java");
        if (expected.equals(actual))
            System.out.println(" reverse() test passed");
        else
            System.out.println(" reverse() test failed: expected " + expected + " got " + actual);

        // Test 2 — palindrome
        boolean isPal = s.isPalindrome("Madam");
        if (isPal)
            System.out.println("isPalindrome('Madam') passed");
        else
            System.out.println(" isPalindrome('Madam') failed");
    }
}
