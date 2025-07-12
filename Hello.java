
public class Hello {
    public static void main(String[] args) {

        System.out.println("Introduction to inheritance");
        Calculator obj1 = new Calculator();

        int result1 = obj1.add(5, 4);
        int result2 = obj1.sub(8, 5);

        System.out.println(result1);
        System.out.println(result2);
        
        AdvancedCalculator obj2 = new AdvancedCalculator();
        int ans1 = obj2.add(1, 2);
        int ans2 = obj2.sub(4, 3);
        int ans3 = obj2.mul(4, 3);
        int ans4 = obj2.div(4, 2);
        System.out.println(".................................");

        System.out.println(ans1 + "," + ans2+ "," + ans3+ "," + ans3 + "," + ans4);
      
    }
}
