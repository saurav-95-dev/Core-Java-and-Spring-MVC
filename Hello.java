//Concept of static keyword:
//Indirect access of non-static variable inside static method.
class Demo{
    //instance variables:
    String name;
    int marks;
    String grade;
    static String branch;

    //Constructor:
    public Demo(){
        String name = "";
        int marks= 0;
        System.out.println("Inside constructor");
    }
    //static block:
    static {
        branch = "Computer science";
        System.out.println("Inside static block");
    }
    public void show1(){
        System.out.println("Name:" + name + " Marks:" + marks + " Grade:" + grade + " Branch:" + branch);
    }
    //Creating a static method:
    public static String show2(Demo demo){
        demo.name = "got it";
        demo.marks = 23;
        System.out.println("This is static method " + demo.name);
        branch = "Information Technology is inside static method";
        return branch;
    }
}

public class Hello{
    public static void main(String[] args){
        //First object
        Demo d1 = new Demo();
        d1.name = "Saurabh Dev";
        d1.marks = 100;
        d1.grade = "A";
        //d1.branch = "IT";
        //Second Object
        Demo d2 = new Demo();
        d2.name="Babu Raj Singh";
        d2.marks = 200;
        d2.grade = "B";
        //Demo.branch= "CS";
       // d1.branch = "IT";
        d2.show1();
        d1.show1();
        String str = Demo.show2(d1);
        System.out.println(str);

    }
}

