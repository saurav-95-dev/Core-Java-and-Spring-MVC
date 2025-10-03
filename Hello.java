
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ListComparison {
    public static void main(String[] args) {
        // --- ArrayList vs. LinkedList performance ---
        int size = 100_000;
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Add elements to the end (similar performance)
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // Mid-list insertion (LinkedList is faster)
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(size / 2, i);
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList mid-insertion: " + (end - start) + "ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(size / 2, i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList mid-insertion: " + (end - start) + "ms");

        // Random access (ArrayList is faster)
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            arrayList.get(i);
        }
        end = System.currentTimeMillis();
        System.out.println("ArrayList random access: " + (end - start) + "ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            linkedList.get(i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList random access: " + (end - start) + "ms");
    }
}
