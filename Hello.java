import java.util.*;

public class Hello {
    public static void main(String[] args) {

        // ---------- HashMap Example ----------
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Saurabh");
        map.put(2, "Laukik");
        map.put(3, null);        // allows null value
        map.put(null, "Ali");    // allows null key

        System.out.println("HashMap Elements:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // ---------- Hashtable Example ----------
        Hashtable<Integer, String> table = new Hashtable<>();
        table.put(1, "Saurabh");
        table.put(2, "Laukik");
        table.put(3, "Aviral");
        // table.put(null, "Ali");      // ❌ Throws NullPointerException
        // table.put(4, null);          // ❌ Throws NullPointerException

        System.out.println("\nHashtable Elements:");
        for (Map.Entry<Integer, String> entry : table.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // ---------- Key Difference in Behavior ----------
        System.out.println("\nHashMap allows nulls, Hashtable doesn't.");
        System.out.println("HashMap class: " + map.getClass().getName());
        System.out.println("Hashtable class: " + table.getClass().getName());
    }
}
