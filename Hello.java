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
//        Here, although we've created the reference of Computer class but after creating the Laptop object
//        it starts pointing to the new Laptop object location . Hence, method inside Laptop overrides method inside Computer class during run-time.
         Computer c = new Computer();
         c.func1();
         c = new Laptop();
         c.func1();
         Laptop l = new Lenovo();
         l.func1();
    }
}
