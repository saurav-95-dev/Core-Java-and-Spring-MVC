//Starting Collections :
//->Starting with collection interface:
//Collection belongs to java.util package.
//Collections work with objects and not with the primitive values.

import java.util.*;

class Hello{
    public static void main(String [] args){
        Collection<Integer> nums = new ArrayList <Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        System.out.println("Printing the values directly:");
        System.out.println(nums);
        System.out.println("Printing using for loop:");
        for (int n : nums){
            System.out.println(n);
        }

        System.out.println("Now printing using list:");
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(3);
        System.out.println("Printing list directly:");
        System.out.println(l);
        System.out.println("printing list using for loop");
        for (int n : l){
            System.out.println(n);
        }
        System.out.println("Printing values using set");

        Set<Integer> s = new HashSet<Integer>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        System.out.println("Printing set values directly:");
        System.out.println(s);
        System.out.println("Printing set values using loop:");
        for (int i : s){
            System.out.println(i);
        }
    }
}