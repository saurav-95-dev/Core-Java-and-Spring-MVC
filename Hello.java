//Object classes in brief:
//Everytime if we try to print an object , it calls a toString() method .
//In java if we are trying to check for the equality of 2 objects , they should have same value as well as same hashcode.

class Computer{
    int marks;
    String name;

    public String toString(){
        return "Hii there";
    }

    public boolean equals(Computer that){
        return this.name.equals(that.name) && this.marks == that.marks;
    }

}

public class Hello{
    public static void main(String [] args){
         Computer c1 = new Computer();
         c1.name = "Saurabh Dev";
         c1.marks = 100;
         Computer c2 = new Computer();
         c2.name = "Saurabh Dev";
         c2.marks = 100;
         System.out.println(c1);
        System.out.println(c1.equals(c2));
    }
}