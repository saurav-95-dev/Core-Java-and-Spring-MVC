//Collection re-visit :
//NOTES:
//Java collection works with objects .
//Collection and Set don't support working with index but List does.
//List support duplicate elements while Set don't.
//Set ---> no duplicates and unsorted
import java.util.*;

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
        l.add(11);
        System.out.println(l);
        for(int i : l){
            System.out.println(i);
        }
        System.out.println("index of 12 in list is : " + l.indexOf(12));
        System.out.println("getting value at index 2 : " + l.get(2));
        System.out.println("Working with Set:");
        Set<Integer> s = new HashSet<Integer>();
        s.add(22);
        s.add(33);
        s.add(44);
        s.add(55);
        s.add(22);
        System.out.println(s);
        System.out.println("Printing set values using Iterable:");

        Iterator<Integer> val = s.iterator();

        while (val.hasNext()){
            System.out.println(val.next());
        }
        System.out.println("working with tree-set:");
        TreeSet<Integer> t = new TreeSet<Integer>();
        t.add(22);
        t.add(33);
        t.add(44);
        t.add(55);
        t.add(22);
        t.add(2);
        t.add(1);
        t.add(77);

        System.out.println(t);
        for(int i : t){
            System.out.println(i);
        }



    }
}