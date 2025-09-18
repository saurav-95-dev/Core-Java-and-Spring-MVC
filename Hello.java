//Can we ovveride static method ?

class A{
    public void code(){
        System.out.println("code inside a");
    }
    public static void manage(){
        System.out.println("manage inside a");
    }
}

class B extends A{
    public void code(){
        System.out.println("code method changed via child");
    }

    public static void manage(){
        System.out.println("static manage method overriden");
    }
}

class Hello{
    public static void main(String [] args) {
            A a = new B();
            a.code();
            a.manage();//static method was not overriden , method call depends on reference type which is A here
        System.out.println();
        B b = new B();
        b.code();
        b.manage();
    }
}