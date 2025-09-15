
abstract class A{
    public abstract void code();
    public void manage(){
        System.out.println("Inside manage method under A class ");
    }
    public abstract void testing();

}

abstract class B extends A{
    public void code(){
        System.out.println("code method implemented");
    }
}
class C extends B{
    public void testing(){
        System.out.println("Testing method implemented");
    }
}
public class Hello{
    public static void main(String []args){
        A a  = new C();
        a.code();
        a.manage();
        a.testing();

    }
}