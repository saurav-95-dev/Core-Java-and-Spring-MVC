//Upcasting and Downcasting .
//Upcasting is automatic , Downcasting is explicit .

class Computer{
    int marks;
    String name;
    public void func1(){
        System.out.println("Inside Computer class");
    }
}

class Laptop extends Computer{
    public void func2(){
        System.out.println("Inside Lenovo class");
    }
}

public class Hello{
    public static void main(String [] args){
//        Even though at runtime, c1 is pointing to a Laptop object, the compiler
//        doesn’t allow calling func2() with c1 because the declared reference type (Computer) doesn’t know about it.
          Computer c1 = new Laptop();
          Laptop l = (Laptop)c1; // DownCasting
//By down-casting we are telling java , "Hey, trust me, this Computer reference actually points to a Laptop object."
          l.func2();

    }
}