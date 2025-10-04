//Starting Collections :
//->Starting with collection interface:
//Collection belongs to java.util package.
//Collections work with objects and not with the primitive values.

import java.util.ArrayList;
import java.util.Collection;

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
    }
}