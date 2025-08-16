//Concept of static keyword:

class Demo{
    //instance variables:
    String name;
    int marks;
    String grade;
    static String branch;

    public void show(){
        System.out.println("Name:" + name + " Marks:" + marks + " Grade:" + grade + " Branch:" + branch);
    }
}

public class Hello{
    public static void main(String[] args){
        Demo d1 = new Demo();
        d1.name = "Saurabh Dev";
        d1.marks = 100;
        d1.grade = "A";
        //d1.branch = "IT";
        Demo d2 = new Demo();
        d2.name="Babu Raj Singh";
        d2.marks = 200;
        d2.grade = "B";
        Demo.branch= "CS";
       // d1.branch = "IT";
        d2.show();
        d1.show();

    }
}

//Takeaways:
//There is no need to create instance of the static members/methods , we can call them directly from the name of class itself.
