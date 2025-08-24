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

class AdvCalculator extends Calculator{
    public int mul(int a , int b){
        return a*b;
    }
    public int div(int a , int b){
        return a/b;
    }

}

public class Hello{

    public static void main(String[] args){
        Calculator obj1 = new Calculator();
        System.out.println(obj1.add(1,2));
        AdvCalculator obj2 = new AdvCalculator();
        System.out.println(obj2.add(8,2));


    }

}



