//Default and parameterized Constructors in java:
class Student{
   int age;
   int marks;
   String name;
   String branch;

   //Default constructor:
    public Student(){
        System.out.println("Inside Constructor");
       this.age = 10;
       this.marks = 80;
       this.name = "NA";
       this.branch = "IT";
    }
}

public class Hello{
    public static void main(String[] args){
         Student s1 = new Student();
         Student s2 = new Student();
         System.out.println(s1.age + "\n" + s1.marks + "\n" + s1.name + "\n" + s1.branch);
    }
}
