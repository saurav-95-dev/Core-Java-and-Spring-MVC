//Concept of interface:
//They don't have their own memory in the heap.
//All the methods inside the interface are by default public and abstract.
//All the variables declared inside the interface are final and static.
//Once we declare the methods inside the interface , its becomes compulsory to implement those methods inside the class which is implementing it.
//If we fail to implement the methods of an interface inside the class which is extending it , then by default , that class also becomes an abstract class.

interface A{
    void show();
    void config();
}

class B implements A{
    public void show(){
        System.out.println("Show method of B class which is implementing interface A");
    }
    public void config(){
        System.out.println("Config method of B class which is implementing interface A");
    }
}

class Hello{
    public static void main() {
        System.out.println("Inside main function");
        A obj = new B(); //Here we are creating the reference of A ,but object of B
        obj.config();
        obj.show();
    }
}