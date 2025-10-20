//Collection re-visit :
//NOTES:
//Java collection works with objects .
//Collection and Set don't support working with index but List does.

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Hello{
    public static void main(String[] args){
        System.out.println("Working with collection :");
        System.out.println("printing collection with loop and with generics types:");
        Collection<Integer> c = new ArrayList<Integer>();
        c.add(1);
        c.add(2);
        c.add(3);
        System.out.println(c);
        System.out.println("printing with loop:");
        for(int i : c){
            System.out.println(i);
        }
        System.out.println("working with list:");
        List<Integer> l  = new ArrayList<Integer>();
        l.add(11);
        l.add(12);
        l.add(13);
        l.add(14);
        System.out.println(l);
        for(int i : l){
            System.out.println(i);
        }
        System.out.println("index of 12 in list is : " + l.indexOf(12));
        System.out.println("getting value at index 2 : " + l.get(2));
    }
}