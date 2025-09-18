//Abstraction with anonymous inner class :
// You have very very less time.
//You have no time to depress neither you have the time to take rest

abstract class A{
    public abstract void code();
    public abstract void manage();
    public void testing(){
        System.out.println("testing inside class A");
    }
    public void Test(){
        System.out.println("Test of parent class");
    }

    public void demo(){
        System.out.println("Demo inside class A");
    }

}

class B extends A{
    public void code(){
        System.out.println("Implemented code function");
    }
    public void manage(){
        System.out.println("Implemented manage function");
    }
    public void analyst(){
        System.out.println("Inside analyst under subclass class B");
    }
    public void Test(){
        System.out.println("Test of child class");
    }
}

class Hello{
    public static void main(String [] args){
        A a = new B()
        {

            public void demo() {
                System.out.println("Demo is changed");
            }
        };
        a.manage();
        a.code();
        a.testing();
        a.Test(); // Method overriding is on action
        System.out.println();
        System.out.println("Making reference of B now -------------------");
        B b = new B();
        b.manage();
        b.analyst();
        b.code();
        b.Test();
        a.demo();

        A a1 = new A()
        {
            public void code(){
                System.out.println("implementation of code changed");
            }
            public void manage(){
                System.out.println("implementation of manage changed");
            }

        };
        System.out.println();
        System.out.println("After changing the implementation of code and manage:");
        a1.code();
        a1.manage();






    }
}