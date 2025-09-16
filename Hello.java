//Abstract classes can have constructors but interfaces cannot , why ?
//Abstract classes :

abstract class A{
    int salary;
    String company;

    public A(){
        System.out.println("A's constructor called..");
    }

   public abstract void code();
   public abstract void manage();
}

class B extends A{

    public B(){
        System.out.println("B's constructor called..");
    }
    public void code(){
        System.out.println("code is implemented");
    }
    public void manage(){
        System.out.println("manage is implemented");
    }
}

class Hello{
    public static void main(String [] args){

        A a = new B();
    }
}