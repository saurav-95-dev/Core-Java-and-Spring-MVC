// 24/08/2025 -- Concept of this and super methods in Java

class A{
    public A(){
        super();
        System.out.println("Default constructor of A class");
    }
    public A(int m){
        super();
        System.out.println("Parameterized constructor of A class");
    }
}

class B extends A{

    public B(){
        super();
        System.out.println("Default constructor of B class");
    }
    public B(int n){
        this();
        System.out.println("Parameterized constructor of B class");
    }
}

class Hello{
    public static void main(String[] args) {
        B b = new B(3);
    }
}








//Takeaways:
//Every constructor in java has a method named super.
//Every class in java , extends super class.
//this() method executes the constructor of the same class.
//super method executes the constructor of the super class .


