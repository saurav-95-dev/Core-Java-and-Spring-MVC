//Inner class and abstraction :

abstract class A{
    public abstract void code();
    public void manage(){
        System.out.println("Inside manage method under A class");
    }
}

public class Hello{
    public static void main(String []args){
        System.out.println("Inside main function");
        A a = new A()
        {

            public void manage() {
                System.out.println("Manage method changed");
            }
            public void code() {
                System.out.println("Code is defined under anonymous inner class");
            }
        };
        a.code();
        a.manage();
    }
}