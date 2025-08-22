//Java Constructor: 19/08/2025
//Default and parameterized constructor
//Overloading in constructor with getters/setters involved

//Operations performing:
class Student{
    private int marks;
    private String name;
    private int age;
    private String branch;

    //Default constructor:
    public Student(){
        this.marks=0;
        this.name="NA";
        this.age=12;
        this.branch="Computer science";
    }

    public Student(int marks , String name , int age){
        this.marks=marks;
        this.name=name;
        this.age=age;
    }
    //getters for Marks, Age and Name:
     public int getMarks(){

     }
     public String getName(){

     }
     public int getAge(){

     }
     //Setters for Marks , Age and  Name:
    public void setMarks(int marks){
        this.marks=marks;

    }
    public void setName(String name){
        this.name=name;

    }
    public void setAge(int age){
        this.age=age;

    }

}

public class Hello{
    public static void main(String[] args){
        System.out.println("This is main function");
        //Calling default constructor:
        Student student1 = new Student();
        //Calling parameterized constructor:
        Student student2 = new Student(8 , "Vaibhav" ,24);
        student1.setMarks(23);
        student1.setAge(25);
        student1.setName("Saurabh");
        System.out.println();



    }
}

