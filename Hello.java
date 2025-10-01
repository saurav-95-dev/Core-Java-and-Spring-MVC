//Java Collection :
//1) Concept of Collection interface .
//Collection interface extends iterable interface .

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Hello{
    public static void main(String []args){
        System.out.println("inside main");

        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(3);
        nums.add(6);
        nums.add(13);
        nums.add(9);
        nums.add(7);

        System.out.println(nums);
        System.out.println();
        for(int n : nums){
            System.out.println(n);
        }

        System.out.println("Printing using list:");
        List<Integer> a =  new ArrayList<Integer>();
        a.add(1);
        a.add(3);
        a.add(6);
        a.add(13);
        a.add(9);
        a.add(7);

        System.out.println(a.get(3));
        System.out.println(a.indexOf(9));
        System.out.println("printing elements:");
        for(int i : a){
            System.out.println(i);
        }

    }
}