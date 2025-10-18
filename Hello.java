import java.util.*;

class Test implements Runnable {
    private Map<Integer, String> map;

    public Test(Map<Integer, String> map) {
        this.map = map;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            map.put(i, Thread.currentThread().getName() + "-" + i);
            try {
                Thread.sleep(10); // simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Hello {
    public static void main(String[] args) throws InterruptedException {

        // ✅ Try with HashMap (NOT thread-safe)
        Map<Integer, String> hashMap = new HashMap<>();
        runTest(hashMap, "HashMap");

        System.out.println("\n---------------------------\n");

        // ✅ Try with Hashtable (thread-safe)
        Map<Integer, String> hashtable = new Hashtable<>();
        runTest(hashtable, "Hashtable");
    }

    private static void runTest(Map<Integer, String> map, String type) throws InterruptedException {
        Thread t1 = new Thread(new Test(map), "T1");
        Thread t2 = new Thread(new Test(map), "T2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(type + " final contents: " + map);
    }
}
