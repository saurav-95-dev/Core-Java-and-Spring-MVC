//12/09/2025 : Abstraction and abstract keyword in java:
//NOTES:
//Compile time rule - You can only call methods about which reference type is aware of.


abstract class Employee{

    public void coder(){
        System.out.println("This is a coder method inside Employee class");
    }
    public abstract void analyst();
    public abstract void manager();
}

class Helper extends Employee{  //Concrete class
    public void analyst(){
        System.out.println("This is the implementation of analyst method");
    }
    public void manager() {
        System.out.println("This is the implementation of manager");
    }
}

class Hello{
    public static void main(String [] arg){
        Employee e = new Helper();
        e.coder();
        e.analyst();
        e.manager();

    }
}