//Inner class :

class A{
    public void code(){
        System.out.println("Inside code method under A class");
    }

    class B{
        public void manage(){
            System.out.println("Inside manage method under inner B class");
        }
    }
    static class C{
        public void testing(){
            System.out.println("Inside testing method under inner C class");
        }
    }
}

public class Hello{
    public static void main(String []args){

        A a = new A();
        a.code();
        A.B b = a.new B();
        b.manage();
        A.C c = new A.C();
        c.testing();

    }
}