//Anonymous inner class

class Computer{
    public void func1(){
        System.out.println("Inside Computer class..");
    }
}



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