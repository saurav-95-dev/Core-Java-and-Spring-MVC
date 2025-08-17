//Default and parameterized Constructors in java:
class Student{
   int age;
   int marks;
   String name;
   String branch;

   //Default constructor:
    public Student(){
        System.out.println("Inside Default Constructor");
       this.age = 10;
       this.marks = 80;
       this.name = "NA";
       this.branch = "IT";
    }

    public Student(int age , String branch){
        System.out.println("Inside Parameterized constructor");
        this.age = age;
        this.branch = branch;
    }
}

public class Hello{
    public static void main(String[] args){
         Student s1 = new Student();
         Student s2 = new Student();
         Student s3 = new Student(22,"CS");
         System.out.println(s1.age + "\n" + s1.marks + "\n" + s1.name + "\n" + s1.branch);
         System.out.println(s3.age + "\n" + s3.marks + "\n" + s3.branch);
    }
}
