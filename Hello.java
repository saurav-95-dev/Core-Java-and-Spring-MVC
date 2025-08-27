//Concept of Polymorphism in Java -- 27/08/2025.
//NOTE : Irrespective of the reference that we create , which method will get called during run time will depend on which object we are creating for runtime polymorphism.
//This is only possible through inheritance.
//This behaviour of run-time polymorphism is called "dynamic method dispatch" .

class Computer{
    public void func1() {
        System.out.println("Inside Computer class !");
    }
}

class Laptop extends Computer{
    public void func1(){
        System.out.println("Inside Laptop class !");
    }
}

class Lenovo extends Laptop{
    public void func1(){
        System.out.println("Inside Lenovo class !");
    }
}

public class Hello{
    public static void main(String [] args){
         Computer c = new Laptop();
         Laptop l = new Lenovo();
         c.func1();
         l.func1();
    }
}
