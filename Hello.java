// 24/08/2025 -- Constructors in Java
class Student{
    //instance varible:
    int marks;
    String name;
    int age;
    String branch;

    //Constructor:
    public Student(){
        this.age = 22;
        this.branch ="IT";
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
        student.setMarks(10);
        student.setName("SAURABH DEV");
        int marks = student.getMarks();;
        String name = student.getName();
        System.out.println("Marks:" + marks);
        System.out.println("Name:" + name);
        System.out.println("Age:" + student.getAge());
        System.out.println("Branch:" + student.getBranch());

    }
}