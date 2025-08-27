//Concept of Final Keyword. --> Can be used with variable , method , class.
//For variable , final is used to make it constant.
//For class , final is used to prevent inheritance i.e , no-one can extend it .
//In case of method , final is used to prevent method overriding.

class Computer{
    final int num = 12;
    public final void func1(){
        System.out.println("Inside Computer class");
        System.out.println(num);
    }
}

class Laptop extends Computer{
    public void func1(){
        System.out.println("Inside Laptop class");
    }
}

public class Hello {
    public static void main(String[] args) {
       Computer c = new Computer();
       c.func1();
    }
}