//Concept of interfaces in java:
//NOTES:
//Inside abstract class , we can or cannot create an abstract method. We can just create normal methods as well.
//When we have a class that has only abstract methods , u can create it as interface.
//Every method inside an interface is "public abstract".
//Every variable inside interface is by-default final and static.
//Remember compile-time rule -> "You can only call methods that the reference type knows about."
//interface will only give design-idea of method . It is the duty of class which is implementing it to actually define the methods inside it ,
// because , we create the object of class and not the interface.
//It becomes necessary to implement the methods that are declared inside interface in the  class which is  extending it otherwise that class will become abstract class by-default.
//In abstract class we can extend only 1 class , but we can have a class implementing multiple interfaces.

interface Machine{
    int marks = 12;   //Final and static by default
    String name = "Saurabh";   //Final and static by default
    void show();
    void config();
}

interface Human{
    void run();
}

interface Man extends Human{
    void hasMuscles();
}

class Laptop implements Machine , Man{
     public void show(){
         System.out.println("Inside show method");
     }
     public void config(){
         System.out.println("Inside config method");
     }
     public void run(){
         System.out.println("Running..");
     }
     public void hasMuscles(){
         System.out.println("Inside hasMuscles method");
     }
}


class Hello {

    public static void main(String[] args) {
       Machine machine = new Laptop();
       machine.config();
       machine.show();

        System.out.println(Machine.marks);
        System.out.println(machine.name);
    }

}
