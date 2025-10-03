import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapComparison {
    public static void main(String[] args) {
        System.out.println("--- HashMap (No Order) ---");
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Zebra", 1);
        hashMap.put("Apple", 2);
        hashMap.put("Cat", 3);
        System.out.println(hashMap); // Order is not guaranteed

        System.out.println("\n--- LinkedHashMap (Insertion Order) ---");
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Zebra", 1);
        linkedHashMap.put("Apple", 2);
        linkedHashMap.put("Cat", 3);
        System.out.println(linkedHashMap); // Order is based on insertion

        System.out.println("\n--- TreeMap (Natural Sorted Order) ---");
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Zebra", 1);
        treeMap.put("Apple", 2);
        treeMap.put("Cat", 3);
        System.out.println(treeMap); // Sorted by key

        System.out.println("\n--- Null Keys and Values ---");
        // HashMap and LinkedHashMap allow one null key
        hashMap.put(null, 4);
        linkedHashMap.put(null, 4);
        // TreeMap does not allow null keys
        try {
            treeMap.put(null, 4);
        } catch (NullPointerException e) {
            System.out.println("TreeMap throws NullPointerException for null keys.");
        }
    }
}
