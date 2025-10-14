//All in one place :
import java.util.*;

class Hello{
    public static void main(String[]args){
        //Collection:
        Collection<Integer> c = new ArrayList<Integer>();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        System.out.println("Directly printing:");
        System.out.println(c);
        System.out.println("Printing without generics using loops:");
        for(Object o : c){
            System.out.println((int)o);
        }
        System.out.println("Printing via utilising generics:");
        for(int i : c){
            System.out.println(i);
        }
        //List :
        List<Integer> l = new ArrayList<Integer>();
        l.add(11);
        l.add(12);
        l.add(13);
        l.add(14);
        l.add(12);
        System.out.println("Directly printing :");
        System.out.println(l);
        System.out.println("printing using loop");
        for(int i : l){
            System.out.println(i);
        }




    }
}