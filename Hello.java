//Can we override a static method :
//NOTES:
//We cannot override a static method because overriding is achieved by runtime polymorphism in which method calling depends on the object type .
//But static methods don't belong to object , rather they belong to class , hence the method call will be decided at compile time and will depend on the reference type.
class A{
    public static void code(){
        System.out.println("Code inside class A");
    }
    public void manage(){
        System.out.println("manage inside class A");
    }
}

class B extends A{
    public static void code(){
        System.out.println("Code inside B subclass");
    }
    public void manage(){
        System.out.println("manage inside subclass B");
    }
}

class Hello{
    public static void main(String[] args) {

        B b = new B();
        b.manage(); //Will call manage method under B subclass since its non-static .
        b.code(); //Will call code method under B subclass (although discouraged to call static method via object).
        System.out.println();
        A a = new B();
        a.manage(); //manage method was overriden because it was non-static method.
        a.code(); //code is not overriden as it was static and hence method call depends on reference type here .

    }
}