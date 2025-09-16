//Can we override a static method :

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
        b.manage(); //Will call manage method under B subclass
        b.code(); //Will call code method under B subclass (although discouraged to call static method via object).

    }
}