//Inner class:
//NOTES:
//We can't use static keyword for the outer class . It can be used with only inner class.

class Computer{
    public void func1(){
        System.out.println("Inside Computer class..");
    }
    class Laptop{
        public void func2(){
            System.out.println("Inside inner class Laptop..");
        }
    }
}



class Hello{
    public static void main(String[] args) {
         //For Creating an object of inner class , we need the object of outer class first.
         Computer c = new Computer();
         Computer.Laptop c1 = c.new Laptop();
         c1.func2();

    }
}