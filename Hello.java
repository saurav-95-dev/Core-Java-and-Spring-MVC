//Concept of static keyword:
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
    public static String show2(){
        System.out.println("This is static method");
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
        String str = Demo.show2();
        System.out.println(str);

    }
}

//Takeaways:
//There is no need to create instance of the static members/methods , we can call them directly from the name of class itself.
//A non-static method (instance method) can easily access/directly access static variable.
//Whenever an object is created , the class loads and then the object gets instantiated and the constructor gets called.
//Everytime the class get loads , the static block gets called first and then through the constructor, object gets instantiated.
//If we don't create an object , class won't get load and hence no static or constructor block will be called.
//It is posible to load a class without object creation via using Class class and forName method.
//This for Name method basically is meant for loading te class.