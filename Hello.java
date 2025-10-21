import java.util.*;

class Worker extends Thread {
    Map<Integer, String> map;
    String name;

    Worker(Map<Integer, String> map, String name) {
        this.map = map;
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            map.put(i, name + "-" + i);
            System.out.println(name + " added: " + i);
            try {
                Thread.sleep(50); // simulate time delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Hello {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("🔸 Using HashMap (Not synchronized)");
        Map<Integer, String> hashMap = new HashMap<>();

        Thread t1 = new Worker(hashMap, "Thread-1");
        Thread t2 = new Worker(hashMap, "Thread-2");

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("\nFinal HashMap content (may be inconsistent):");
        System.out.println(hashMap);

        System.out.println("\n🔹 Using Hashtable (Synchronized)");
        Map<Integer, String> hashTable = new Hashtable<>();

        Thread t3 = new Worker(hashTable, "Thread-A");
        Thread t4 = new Worker(hashTable, "Thread-B");

        t3.start();
        t4.start();
        t3.join();
        t4.join();

        System.out.println("\nFinal Hashtable content (thread-safe and consistent):");
        System.out.println(hashTable);
    }
}
