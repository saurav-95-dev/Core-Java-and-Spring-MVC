//📌 Golden Rule:
//👉 You can always upcast (child → parent reference).
//👉 You cannot directly downcast (parent → child reference) unless you explicitly cast and the object really is a child

//Rule: A child reference cannot point to a parent object.
//Reason: A parent object does not have the extra things the child adds.
//Example: A doesn’t know about bShow(). If you allowed B b = new A();, then calling b.bShow() would be impossible because the actual object is only A (no such method exists in memory).

class A{
    public  void aShow(){
        System.out.println("In aShow");
    }
}

class B extends A{
    public void bShow(){
        System.out.println("In bShow");
    }
}

public class Hello{
    public static void main(String []args){
        System.out.println("Inside main function");
        A a = new B();
        a.aShow();
        
    }
}