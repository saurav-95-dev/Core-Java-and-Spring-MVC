//Sorting in collection and the use of comparator
//Comparator is an functional interface and can extends comparable

import java.sql.SQLOutput;
import java.util.*;
class Student{
   int age;
   String name;

   //constructor
    public Student(int age , String name){
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

class Profession implements Comparable<Profession>{

    String role;
    int salary;

    //constructor:
    public Profession(int salary , String role){
        this.salary = salary;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Profession{" +
                "role='" + role + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int compareTo(Profession that) {
        if (this.role.length() > that.role.length())
            return 1;
        else
            return -1;
    }


}

class Tech implements Comparable<Tech>{

    int rating;
    String stack;

    //constructor:
    public Tech(int rating , String stack){
        this.rating = rating;
        this.stack  = stack;
    }
    //writing compareTo method:
    public int compareTo(Tech that){
        if(this.stack.length() > that.stack.length()){
            return 1;
        }
        else
            return -1;
    }

    @Override
    public String toString() {
        return "Tech{" +
                "rating=" + rating +
                ", stack='" + stack + '\'' +
                '}';
    }

}


class Hello{
    public static void main(String[]args){


        Comparator<Tech> t1 = (s1 , s2) ->{

            if(s1.rating > s2.rating)
                return 1;
            else
                return -1;
        };
        Comparator<Student> c4  = new Comparator<Student>(){
            public int compare(Student s1 , Student s2){
                if (s1.name.length() > s2.name.length())
                    return 1;
                else
                    return -1;
            }
        };
        Comparator<Student> c3 = new Comparator<Student>(){
            public int compare(Student s1 , Student s2){
                if (s1.age > s2.age)
                    return 1;
                else
                    return -1;
            }
        };

        Comparator<Integer> com = new Comparator<Integer>(){
            public int compare(Integer i , Integer j){
                if(i%10 > j%10){
                    return  1;
                }
                else
                    return -1;
            }
        };

        Comparator<String> c1 = new Comparator<String>(){
            public int compare(String s1 , String s2){
                if(s1.length() > s2.length())
                    return 1;
                else
                    return -1;
            }
        };
        List<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(13);
        l.add(55);
        l.add(71);
        l.add(90);
        l.add(88);
        System.out.println("b4 sorting:");
        System.out.println(l);
        System.out.println("After sorting without comparator:");
        System.out.println(l);
        System.out.println("After sorting with using comparator:");
        Collections.sort(l , com);
        System.out.println(l);
        //sorting the strings based on length:
        List<String> l1 = new ArrayList<>();
        l1.add("saurabh dev");
        l1.add("laukik");
        l1.add("kiran");
        l1.add("great khali");
        l1.add("the under taker");
        l1.add("Alister.. the demolition man...!");
        l1.add("bee");
        System.out.println("printing strings normally :");
        System.out.println(l1);
        System.out.println("sorting strings based on lenght:");
        Collections.sort(l1 , c1);
        System.out.println(l1);
        //Customized sorting via custom class:
        //creating the list of student:
        List<Student> v = new ArrayList<>();
        v.add(new Student(25 , "Saurabh dev "));
        v.add(new Student(21 , "Laukik"));
        v.add(new Student(15 , "Himanshu Gaurav AIR-2"));
        v.add(new Student(28 , "Aviral"));
        v.add(new Student(22 , "Ali"));

        System.out.println(v);
        System.out.println("printing students value one by one:");
        for(Student studs : v){
            System.out.println(studs);
        }
        Collections.sort(v , c3);
        System.out.println("after sorting student based on their age:");
        for(Student studs : v){
            System.out.println(studs);
        }
        System.out.println();
        System.out.println("sorting based on the length of the string using comparable :");
        Collections.sort(v ,c4);
        for(Student studs : v){
            System.out.println(studs);
        }
        System.out.println();
        System.out.println("sorting using comparable:");
        //creating a list of profession class:
        List<Profession> p = new ArrayList<>();
        p.add(new Profession(3000000 , "Software Engineer"));
        p.add(new Profession(102300 , "BA"));
        p.add(new Profession(102000 , "Tester"));
        p.add(new Profession(220080 , "Manager"));
        p.add(new Profession(10000 , "Service Desk"));

        Collections.sort(p);
        System.out.println("printing sorted value of profession based on length of the string:");
        for(Profession i : p){
            System.out.println(i);
        }
        //Creating a list of Tech:
        List<Tech> t = new ArrayList<Tech>();
        t.add(new Tech(4 , "Java"));
        t.add(new Tech(6 , "Springboot"));
        t.add((new Tech(3 , "C")));
        t.add(new Tech(2 , "COBOL"));
        System.out.println("printing directly via loop without sorting..");
        for(Tech i : t){
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Sorting Tech class based on rating using ccomparator..");
        Collections.sort(t , t1);
        for(Tech i : t){
            System.out.println(i);
        }
        System.out.println();
        System.out.println("now sorting tech based on the length of the string of their stack..");
        Collections.sort(t);
        for(Tech i : t){
            System.out.println(i);
        }
    }
}