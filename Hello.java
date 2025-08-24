// 24/08/2025 -- Parameterized Constructors in Java
class Student{
    //instance varible:
    int marks;
    String name;
    int age;
    String branch;

    //Constructor:
    public Student(){
        System.out.println("Inside default constructor");
        this.age = 22;
        this.branch ="IT";
    }
    public Student(int marks, String name){
        System.out.println("Inside parameterized constructor");
        this.marks = marks;
        this.name= name;
    }

    //setters:
    public void setMarks(int marks){
        this.marks = marks;
    }
    public  void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    //getters:
    public int getMarks(){
        return marks;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getBranch(){
        return branch;
    }

}

class Hello{
    public static void main(){

        Student student = new Student();
        Student student1 = new Student(29 , "Aviral");
        int marks1 = student1.getMarks();
        String name1 = student1.getName();
        System.out.println("Parameterized Marks:" + marks1);
        System.out.println("Parameterized Name:" + name1);
        System.out.println("Parameterized Age:" + student1.getAge());
        System.out.println("Parameterized Branch:" + student1.getBranch());
        student.setMarks(30);
        student.setName("SAURABH DEV");
        int marks = student.getMarks();;
        String name = student.getName();
        System.out.println("Marks:" + marks);
        System.out.println("Name:" + name);
        System.out.println("Age:" + student.getAge());
        System.out.println("Branch:" + student.getBranch());

    }
}