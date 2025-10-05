//Sorting in collection and the concept of comparator and comparable:
//normal sorting -> Collections class ->sort method.
//Customized sorting --> we can use comparator which is an interface.
//To implement the comparator interface , we can use either anonymous class or a class which implements interface.
//Sorting based on the magnitude of last digit.
//NOTE : Comparator is a functional interface.
//Creating a class of student and then sorting according to the age.

import java.util.*;

class Student{

    int age;
    String name;

    //constructor:
    public Student(String name , int age){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
class Hello{
    public static void main(String [] args){

        //Implementing comparator :
        Comparator<Integer> c1 = new Comparator<Integer>()
        {
            public int compare(Integer i , Integer j){
                if (i%10 > j%10)
                    return 1;
                else
                    return -1;
            }

        };

        Comparator<String> c2 = new Comparator<String>(){
            public int compare(String s1 , String s2){
                if (s1.length() > s2.length())
                    return 1;
                else
                    return -1;
            }
        };

        Comparator<Student> c3 = new Comparator<Student>(){
            public int compare(Student i , Student j){
                if (i.age > j.age)
                    return 1;
                else
                    return -1;
            }
        };

        List<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(13);
        l.add(31);
        l.add(11);
        l.add(86);
        l.add(64);
        l.add(19);
        System.out.println("printing normally:");
        System.out.println(l);
        //to sort the values we have a special class called Collections:
        System.out.println("Normal sorting : ");
        Collections.sort(l);
        System.out.println(l);
        System.out.println("Sorting based on last digit:");
        Collections.sort(l , c1);
        System.out.println(l);
        System.out.println();
        //CREATING A LIST OF STRINGS AND THEN SORTING BASED ON LENGTH.
        List<String> s = new ArrayList<>();
        s.add("Saurabh dev");
        s.add("Shubham");
        s.add("Laukik");
        s.add("Shudhanshu");
        System.out.println("Printing strings normally");
        System.out.println(s);
        System.out.println("printing strings sorted according to length");
        Collections.sort(s , c2);
        System.out.println(s);
        System.out.println();
        //Creating the list of student :
        List<Student> students = new ArrayList<>();
        students.add(new Student("Saurabh dev" , 24));
        students.add(new Student("Rahul Kumar Gupta" , 77));
        students.add(new Student("Vikas" , 22));
        students.add(new Student("Laukik" , 25));
        students.add(new Student("Kiran" , 21));
        System.out.println("printing student directly without loop:");
        System.out.println(students);
        System.out.println();
        System.out.println("printing students using loop one by one:");
        for(Student i : students){
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Sorting the students according to their age :");
        Collections.sort(students , c3); // Here we need to pass c3 as we are not using Comparable
        for(Student i : students){
            System.out.println(i);
        }


    }
}