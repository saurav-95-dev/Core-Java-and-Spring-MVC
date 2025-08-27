//Object classes in brief:
//Everytime if we try to print an object , it calls a toString() method .

class Computer{
    int marks;
    String name;
    public String toString(){
        return "Hii there";
    }
}

public class Hello{
    public static void main(String [] args){
         Computer c = new Computer();
         c.name = "Saurabh Dev";
         c.marks = 100;
         System.out.println(c.toString());
    }
}