//Arrray of object : 

class Student {
    int marks;
    int rollNo;
    String name;
}

class Hello {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.name = "Saurabh";
        s1.marks = 12;
        s1.rollNo = 2;

        s2.name = "Vaibhav";
        s2.marks = 112;
        s2.rollNo = 12;

        s3.name = "Vinayak";
        s3.marks = 23;
        s3.rollNo = 3;

        //Creating an array which has all these objects : 
        Student student[] = new Student[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;


        //Normal for loop:
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].marks + " :" + student[i].name + " :" + student[i].rollNo);
        }
        System.out.println();
        System.out.println();

        for(Student stud : student){
            System.out.println(stud.name + "-->" + stud.marks + " : " + stud.rollNo);
        }


    }
    
}