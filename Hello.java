//CONCEPT OF INNER CLASS : 


class A {
    int num;

    void show() {
        System.out.println("Inside Show");
    } //Accessible within the same class.

    class B {
        int num2;

        void config() {
            System.out.println("Inside config");
        }
    }
}

class Hello {
    public static void main(String[] args) {
        System.out.println("Inside Hello Method");
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        obj1.config();
    }
}