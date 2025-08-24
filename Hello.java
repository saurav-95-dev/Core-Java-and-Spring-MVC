// 24/08/2025 -- Concept of inheritance in Java
//Note : Multiple Inheritance is not supported in java.

class Calculator{
    public int add(int a , int b){
        return a+b;
    }
    public int sub(int a , int b){
        return a-b;
    }
}

public class Hello{

    public static void main(String[] args){
          AdvCalculator calc = new AdvCalculator();
          int result1 = calc.add(1,2);
          int result2 = calc.mul(4,5);
          System.out.println("Addition :" + result1);
          System.out.println("Multiplication :" + result2);
    }

}



