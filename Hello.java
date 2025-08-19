//Java Constructor: 19/08/2025
//Default and parameterized constructor
//Overloading in constructor with getters/setters involved

class Student{
    int marks;
    String name;
    int age;
    String branch;

    //Default constructor:
    public Student(){
        this.marks=0;
        this.name="NA";
        this.age=12;
        this.branch="Computer science";
    }

}

public class Hello{
    public static void main(String[] args){
        System.out.println("This is main function");
        Student student = new Student();
        System.out.println("Name:" + student.name);
        System.out.println("Age:" + student.age);
        System.out.println("Branch:" + student.branch);

    }
}

