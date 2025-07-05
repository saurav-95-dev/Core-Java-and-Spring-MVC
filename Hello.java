//Arrays in java : 
class Students {

    String name;
    int marks;
    int rollNo;

}

public class Hello {
     
    //Creating arrays of object type and using enhanced for loop in the arrays of objects : 
    public static void main(String[] args) {

        Students s1 = new Students();
        Students s2 = new Students();
        Students s3 = new Students();

        s1.name = "Saurabh";
        s1.marks = 80;
        s1.rollNo = 2;

        s2.name = "Vaibhav";
        s2.marks = 30;
        s2.rollNo = 23;

        s3.name = "Vinayak";
        s3.marks = 2;
        s3.rollNo = 12;

        Students students[] = new Students[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        //  for (int i = 0; i < students.length; i++) {
        //     System.out.println(students[i].name + " : " + students[i].marks + " : " + students[i].rollNo);
        //  }
        
        for (Students s : students) {
             System.out.println(s.name + " : " + s.marks + " : " + s.rollNo);
        }
 
    }

}
