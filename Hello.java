//Collection-REV-02:
//Collection is an interface , Collections is a class and Collection api is a concept.
//Iterable interface extends Collection interface .
//List , Queue and Set are 3 interfaces that are extended by Collection interface.
//List is implemented by class called ArrayList , and Set is implemented by class called HashSet().
//If you wanna work with index , go with the list because set doesn't support index value.
//Map : A combination of set and list where the keys can't be repeated but values can be.

import java.util.*;

class Hello{
    public static void main(String[]args){
        System.out.println("Working with collection:");
        Collection<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
       // c.add("5");
        System.out.println("printing collection directly generics");
        System.out.println(c);
        System.out.println("printing collection via loop using generics:");
        for(int i : c){
            System.out.println(i);
        }
        System.out.println("ArrayList");
        List<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(1);
        System.out.println("printing directly:");
        System.out.println(a);
        System.out.println("using loop");
        for(int i : a){
            System.out.println(i);
        }
        System.out.println("using get method of list:");
        System.out.println(a.get(2));
        System.out.println(a.indexOf(2));
        System.out.println();
        System.out.println("Working with Set:");
        Set<Integer> s = new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(2);
        System.out.println("printing directly:");
        System.out.println(s);
        System.out.println("using loop:");
        for(int i : s){
            System.out.println(i);
        }
        System.out.println("Working with Iterable interface:");
        System.out.println("Printing set values using Iterable:");
        Iterator<Integer> val = s.iterator();
        while(val.hasNext()){
            System.out.println(val.next());
        }
        System.out.println("Basics of Map:");
        Map<String , Integer> m = new HashMap<>();
        m.put("Saurabh" , 88);
        m.put("laukik" , 33);
        m.put("shudhanshu" , 44);
        m.put("non" , 23);
        m.put("kashish" , 33);
        m.put("rahul" , 88);
        //m.put("Saurabh" , 78);
        System.out.println("printing map directly:");
        System.out.println(m);
        System.out.println("Getting all the keys from map-val pair:");
        System.out.println(m.keySet());
        System.out.println("printing the via loop:");
        for(String str : m.keySet()){
            System.out.println(str + "->" + m.get(str));
        }

    }
}

