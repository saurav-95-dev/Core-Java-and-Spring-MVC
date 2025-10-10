//Java Collection-REV-01 :
//When we talk about collection-api we are talking about concept ,when we talk about Collections , it is about interface
//and when we talk about Collections , we are talking about class.
//Collection works with objects and not with primitive type.

import java.util.*;

class Hello{
    public static void main(String[]args){
        System.out.println("Working with collection:");
        ArrayList<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(3);
        System.out.println("Printing collection directly");
        System.out.println(c);
        System.out.println("printing via loop without generics:");
        for(Object o : c){
            int n = (int)o;
            System.out.println(n);
        }
        System.out.println("printing via loop using generics:");
        for(int i : c){
            System.out.println(i);
        }
        System.out.println("Trying get method:");
        System.out.println(c.get(0));;
        System.out.println();
        System.out.println("Working with list:");
        List<Integer> l = new ArrayList<Integer>();
        l.add(11);
        l.add(12);
        l.add(13);
        l.add(14);
        l.add(12);
        l.add(15);
        System.out.println("printing directly:");
        System.out.println(l);
        for(int i : l){
            System.out.println(i);
        }
        System.out.println("index of method:");
        System.out.println(l.indexOf(12));
        System.out.println("Working with set:");
        Set<Integer> s = new HashSet<>();
        s.add(22);
        s.add(23);
        s.add(24);
        s.add(25);
        s.add(23);
        s.add(22);
        s.add(1);
        s.add(2);
        System.out.println("printing directly:");
        System.out.println(s);
        System.out.println("printing via loop via generics:");
        for(int i : s){
            System.out.println(i);
        }
        System.out.println();
        System.out.println("printing using Iterable:");
        Iterator<Integer> val = s.iterator();
        while(val.hasNext()){
            System.out.println(val.next());
        }

    }
}

