
import java.util.*;

class Hello {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        System.out.println("Normal Stream:");
        nums.stream()
                .forEach(n -> {
                    System.out.println(Thread.currentThread().getName() + " processed " + n);
                });


        nums.parallelStream()
                .forEach(n -> {
                    System.out.println(Thread.currentThread().getName() + " processed " + n);
                });
    }
}