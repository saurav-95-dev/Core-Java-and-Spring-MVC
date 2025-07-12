class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

}

class AdvancedCalculator {

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}


public class Hello {
    public static void main(String[] args) {

        System.out.println("Introduction to inheritance");
        Calculator obj = new Calculator();
        AdvancedCalculator obj1 = new AdvancedCalculator();
        int r1 = obj.add(2, 3);
        int r2 = obj.sub(4, 5);
        System.out.println(r1);
        System.out.println(r2);

        int ans1 = obj1.mul(2, 4);
        int ans2 = obj1.div(6, 2);
        System.out.println("Mul is :" + ans1 + " Div is : " + ans2 );
    }
}
