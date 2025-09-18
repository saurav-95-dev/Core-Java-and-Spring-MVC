//Abstraction :
//Introduction :

abstract class A{
    public abstract void code();
    public abstract void manage();
    public void testing(){
        System.out.println("testing inside class A");
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
}

class Hello{
    public static void main(String [] args){
        A a = new B();
        a.manage();
        a.code();
        a.testing();

    }
}