//Java Collection-REV-01 :
//When we talk about collection-api we are talking about concept ,when we talk about Collections , it is about interface
//and when we talk about Collections , we are talking about class.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

class Hello{
    public static void main(String[]args){
        System.out.println("Working with collection:");
        Collection c = new ArrayList();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add("3");
        System.out.println("Printing collection directly");
        System.out.println(c);
        System.out.println("printing via loop without generics:");
        for(Object o : c){
            int n = (int)o;
            System.out.println(n);
        }
    }
}

