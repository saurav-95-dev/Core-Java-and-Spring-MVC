//Implement method overiding in java :

class A {
    public void show() {
        System.out.println("Inside class A show ");
    }
}

class B extends A {
    public void show1() {
        System.out.println("Inside  class B show");
    }
}

class Hello {
    public static void main(String[] args) {

        System.out.println("Method overiding");
         B obj1 = new B();
         obj1.show();


    }

   
}