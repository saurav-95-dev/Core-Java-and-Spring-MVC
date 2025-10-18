import java.util.*;

class Example {
    public static void main(String[] args) {
        // HashMap
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(null, "C++");
        System.out.println("HashMap: " + map);

        // Hashtable
        Hashtable<Integer, String> table = new Hashtable<>();
        table.put(1, "Java");
        table.put(2, "Python");
        // table.put(null, "C++"); //
        System.out.println("Hashtable: " + table);
    }
}
