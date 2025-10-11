//Collection-REV-02:
//Collection is an interface , Collections is a class and Collection api is a concept.
//Iterable interface extends Collection interface .
//List , Queue and Set are 3 interfaces that are extended by Collection interface.
//List is implemented by class called ArrayList , and Set is implemented by class called HashSet().

import java.util.ArrayList;
import java.util.Collection;

class Hello{
    public static void main(String[]args){
        System.out.println("Working with collection:");
        Collection c = new ArrayList();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add("5");
        System.out.println("printing collection directly without generics");
        System.out.println(c);
        System.out.println("printing collection via loop without using generics");
        for(Object o : c){
            System.out.println((int)o);
        }

    }
}