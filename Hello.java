//Concept Method Overloading:

class Calculator{
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a , int b , int c){
        return a+b+c;
    }
    public double add(double a , int b){
        return a+b;
    }
}
public class Hello{
    public static void main(String[] args) {
         Calculator calculator = new Calculator();
         double result = calculator.add(2.5,3);
         System.out.println(result);
    }
}
//Takeaways:
//Instance variable gets space inside Heap-memory.
//Reference variable are inside the stack which points to the address of the corresponding object that is created in the Heap.
