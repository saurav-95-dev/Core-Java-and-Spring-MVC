//Map : Key-value pair ->resembles - List-Set pair behaviour in terms of repeated values.
//If you want to use synchronized version u can use hashtable otherwise use hashmap.
//If u  have multiple threads working it is better to use hashtable to get it synchronized.

import java.util.HashMap;
import java.util.Map;

class Hello{
    public static void main(String[]args){
        Map<String , Integer> students = new HashMap<>();
        students.put("saurabh" , 62);
        students.put("laukik" , 22);
        students.put("sudhanshu" , 33);
        students.put("rkg" , 45);
        System.out.println("printing the keys directly");
        System.out.println(students.keySet());
        System.out.println();
        System.out.println("printing keys using loop:");
        for(String s : students.keySet()){
            System.out.println(s);
        }
        System.out.println();
        System.out.println("printing key-val pair:");
        for(String s : students.keySet()){
            System.out.println(s + "->" + students.get(s));
        }

    }
}