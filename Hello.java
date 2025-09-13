//Anonymous Inner class :
//->used when we want to change the implementation/behaviour of a method defined in some class

class A{

    public void aShow(){
        System.out.println("This is a method inside class A");
    }

}

class Hello{

    public static void main() {

        System.out.println("Inside main function");
        A a = new A()
        {
            //Designing anonymous inner class:
            public void aShow(){
                System.out.println("Changed the implementation do aShow method");
            }

        };
        a.aShow();


    }
}