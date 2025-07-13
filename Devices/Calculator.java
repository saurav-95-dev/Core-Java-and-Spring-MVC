package Devices;


public class Calculator {

    public int result1 = 0;

    public int add(int a, int b) {
        result1 = a + b;
        return result1;
    }

    public int sub(int a, int b) {
        AdvancedCalculator obj2 = new AdvancedCalculator(); // ✅ Now works
        System.out.println(obj2.getResult()); // if result is protected
        result1 = a - b;
        return result1;
    }
}
