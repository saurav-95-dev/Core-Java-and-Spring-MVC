// 24/08/2025 -- Concept of method overloading and overriding in Java
//Method-overloading -> same method name , same no. of arguments , diff parameters types.
//Method-overriding -> Inheritance involved , same method name , same no./type of parameter but different method behaviour inside child class.
//**Method-overriding happens when a function inside child class wants to override the same function defined in the parent class.

class Calculator{

    public int add(int a , int b){
        return a+b;
    }
    public int sub(int a , int b){
        return a-b;
    }
    public int mul(int a , int b){
        return (a*b);
    }

}

public class Hello {

    public static void main(String[] args){
         AdvCalculator calc = new AdvCalculator();
         int result = calc.mul(3,4);
         System.out.println(result);
    }

}
