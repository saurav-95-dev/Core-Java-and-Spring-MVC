//Java Collection revisit :
//NOTES :
//collection api is a concept , Collection is an interface , and Collections is a class.
//List support working with the index , whereas Collection and Set don't.
//List can have duplicate values but Set can't.
//Generics in collection helps to basically remove the bugs of your code.
//Map is a Set-list implementation and it doesn't extend Collection interface.

import javax.swing.*;
import java.util.*;

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
        for(int i=1 ; i<=3 ; i++){
            map.put(i , name + "-" + i);
        }
        //after each write , thread rest for 50 mills:
        try{
            Thread.sleep(50);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }

}

class Hello{
    public static void main(String[] args) throws InterruptedException{
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


    }
}