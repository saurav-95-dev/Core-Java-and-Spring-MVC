//Java Collection revisit :
//NOTES :
//collection api is a concept , Collection is an interface , and Collections is a class.
//List support working with the index , whereas Collection and Set don't.
//List can have duplicate values but Set can't.
//Generics in collection helps to basically remove the bugs of your code.

import java.util.*;

class Hello{
    public static void main(String[] args){
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
        for(int i : l){
            System.out.println(i);
        }
        System.out.println("Working woth set:");
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
        System.out.println("Working with TreeSet:");
        Set<Integer> t = new TreeSet<>();
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

    }
}