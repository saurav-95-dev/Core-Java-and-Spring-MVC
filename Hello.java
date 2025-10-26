//Java Collection revisit :
//NOTES :
//collection api is a concept , Collection is an interface , and Collections is a class.
//List support working with the index , whereas Collection and Set don't.
//List can have duplicate values but Set can't.
//Generics in collection helps to basically remove the bugs of your code.
//Map is a Set-list implementation and it doesn't extend Collection interface.
//Comparator is an interface having a method called compare to implement customized sorting

import com.sun.security.jgss.GSSUtil;

import javax.swing.*;
import java.util.*;

class Student implements Comparable<Student>{

    int age;
    String name;
    Student(int age , String name){
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
    public int compareTo(Student that){
        if(this.name.length() > that.name.length())
            return 1;
        else
            return -1;
    }
}

class Worker extends Thread{
   Map<Integer , String> map;
   String name;

   //writing constructor :
    Worker(Map<Integer , String> map , String name){
        this.map = map;
        this.name = name;
    }
    //To execute the thread :
    public void run(){
        for(int i=1 ; i<=3 ; i++) {
            map.put(i, name + "-" + i);
            System.out.println(name + " added: " + i);

            //after each write , thread rest for 50 mills:
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Hello{
    public static void main(String[] args) throws InterruptedException{
        Comparator<Integer> c1 = new Comparator<Integer>() {
            public int compare(Integer i , Integer j){
                if(i%10 > j%10)
                    return 1;
                else
                    return -1;
            }
        };

        Comparator<String> c2 = new Comparator<String>(){
            public int compare(String str1 , String str2){
                if(str1.length() > str2.length())
                    return 1;
                else
                    return -1;
            }
        };
        Comparator<Student> c3 = new Comparator<Student>(){
            public int compare(Student s1 , Student s2){
                if(s1.age > s2.age)
                    return 1;
                else
                    return -1;
            }
        };

        System.out.println("Introduction to collection:");
          Collection<Integer> c = new ArrayList<Integer>();
          c.add(1);
          c.add(2);
          c.add(3);
          c.add(4);
          System.out.println(c);
          for(int i : c){
              System.out.println(i);
          }
        System.out.println("working with list:");
          List<Integer> l = new ArrayList<Integer>();
          l.add(11);
          l.add(12);
          l.add(13);
          l.add(14);
          l.add(11);
        System.out.println(l);
        System.out.println("Getting value at third index : " + l.get(2));
        System.out.println("Index of 13 : " + l.indexOf(13));
        for(int i : l){
            System.out.println(i);
        }
        System.out.println("Working with set:");
        Set<Integer> s = new HashSet<Integer>();
        s.add(22);
        s.add(33);
        s.add(44);
        s.add(55);
        s.add(66);
        s.add(22);
        System.out.println(s);
        for(int i : s){
            System.out.println(i);
        }
        //Using TreeSet for sorting :
        System.out.println();
        System.out.println("Working with TreeSet (will print data in sorted manner):");
        Set<Integer> t = new TreeSet<Integer>();
        t.add(22);
        t.add(33);
        t.add(44);
        t.add(55);
        t.add(66);
        t.add(22);
        System.out.println(t);
        for(int i : t){
            System.out.println(i);
        }
        System.out.println("Printing tree set items using iterator:");
        Iterator<Integer> values = t.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }
        System.out.println();

        //Introduction to map:  Set-List implementation
        System.out.println("Working with map:");
        Map<String  , Integer> m = new HashMap<>();
        m.put("Saurabh" , 77);
        m.put("Laukik" , 32);
        m.put("steven" , 41);
        System.out.println(m);
        System.out.println();
        for(String str : m.keySet()) {
            System.out.println(str + " -> " + m.get(str));
        }

        System.out.println();
        System.out.println("Difference between Hashmap and hashtable:");
        //NOTE : consider hashmap and hashtable like a notebook which will be shared by two thread simultaneouly in which at a certain point both thread want to write at same page and at the same time.
        //In such a case , data can be overwritten and we can loose data.
        //Working with hashmap(Not thread safe):
        //core : if both threads writes in the same notebook (map) , things can get messed up.
        System.out.println("Using Hashmap , not synchronized:");
        Map<Integer , String> hashmap = new HashMap();
        Thread t1 = new Worker(hashmap , "Thread-1"); //Worker is a person which has a notebook and a name thread-1
        Thread t2 = new Worker(hashmap , "Thread-2"); //Worker is a person which has a notebook and a name thread-2
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final hashmap content:");
        System.out.println(hashmap);
        for(Integer i : hashmap.keySet()){
            System.out.println(i + " -> " + hashmap.get(i));
        }

        System.out.println();
        System.out.println("Now using hashtable which is thread safe:");
        Map<Integer , String> hashtable = new Hashtable<>();
        Thread t3 = new Worker(hashtable , "Thread-A");
        Thread t4 = new Worker(hashtable , "Thread-B");
        t3.start();
        t4.start();
        t3.join();
        t4.join();
        System.out.println("Final hashtable content -- Thread safe :");
        System.out.println(hashtable);
        for(Integer  i : hashtable.keySet()){
            System.out.println(i + " -> " + hashtable.get(i));
        }
        System.out.println();
        System.out.println("Sorting in Collection:");
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(41);
        list.add(90);
        list.add(77);
        list.add(36);
        System.out.println("Normal sorting using Collections class:");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("Customized sorting based on last digit using comparator:");
        Collections.sort(list , c1);
        System.out.println(list);
        System.out.println("Customized sorting based on length of the string using comparator:");
        List<String> str = new ArrayList<>();
        str.add("Saurabh dev");
        str.add("london");
        str.add("Competitive programming");
        str.add("weekend");
        str.add("no");
        Collections.sort(str , c2);
        System.out.println(str);
        for(String s1 : str){
            System.out.println(s1);
        }
        System.out.println("Customized sorting using list of students as a class based on age");
        List<Student> students = new ArrayList<>();
        students.add(new Student(22 , "Saurabh dev"));
        students.add(new Student(21 , "Saurabh dev i am"));
        students.add(new Student(32 , "You have to switch company"));
        students.add(new Student(19 , "hii there"));
        Collections.sort(students , c3);
        for(Student stud : students){
            System.out.println(stud.age + " -> " + stud.name);
        }
        System.out.println("Customized sorting using list of students as a class based on name length:");
        Collections.sort(students);
        for(Student stud : students){
            System.out.println(stud.age + " -> " + stud.name);
        }

    }
}