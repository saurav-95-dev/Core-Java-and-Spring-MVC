//Sorting in collection and the concept of comparator and comparable:

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Hello{
    public static void main(String [] args){
        List<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(13);
        l.add(31);
        l.add(1);
        l.add(8);
        l.add(63);
        System.out.println("printing normally:");
        System.out.println(l);
        //to sort the values we have a special class called Collections:
        System.out.println("After sorting:");
        Collections.sort(l);
        System.out.println(l);
    }
}