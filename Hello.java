


class Hello{
    public static void main(String[] args) {

         Computer c = new Computer()
         {
             public void func1(){
                 System.out.println("Inside Modified Computer class..");
             }
         };
         c.func1();

    }
}

//IMPORTANT:

//👉 Here’s what’s happening:
//        new Computer() { ... };
//This does NOT mean we are directly creating an object of Computer.
//Instead, we are creating an anonymous class (a class without a name) that extends Computer and provides an implementation for its abstract method func1().
//Java immediately creates an object of that anonymous subclass and assigns it to the reference c.