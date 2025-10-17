
abstract class A {
    A() {
        System.out.println("A's constructor");
    }
}

class B extends A {
    B() {
        System.out.println("B's constructor");
    }
}

public class Hello {
    public static void main(String[] args) {
        B b = new B();
    }
}