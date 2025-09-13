//Abstraction  + Anonymous inner class.
//->How can we create object of inner class which seems like creating the object of abstract class ?
//->If there's only one-time implementation of the abstract method or interface of the abstract class, we can do it inside anonymous inner class.

abstract class A{
    public abstract void aShow();
}

public class Hello{
    public static void main(String[] args) {
        System.out.println("Inside main function");
        A a = new A()
        {
            public void aShow(){
                System.out.println("aShow has been implemented");
            }
        };
        a.aShow();
    }
}