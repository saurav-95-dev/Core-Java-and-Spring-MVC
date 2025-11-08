import java.util.*;

class ArrayUtils {
    int[] sortArray(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
}

public class Hello {
    public static void main(String[] args) {
        ArrayUtils utils = new ArrayUtils();

        System.out.println("\nTESTING ARRAYS ===");

        int[] input = {3, 1, 2};
        int[] expected = {1, 2, 3};
        int[] actual = utils.sortArray(input);

        if (Arrays.equals(expected, actual))
            System.out.println("sortArray() test passed");
        else
            System.out.println("sortArray() test failed");
    }
}
