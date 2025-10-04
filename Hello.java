
import java.util.*;

class Hello{
    public static void main(String [] args){
        //Iterators:
        Collection<Integer> c = new ArrayList<Integer>();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        System.out.println("printing using iterator:");

        Iterator<Integer> val = c.iterator();

        while (val.hasNext()){
            System.out.println(val.next());
        }
    }
}