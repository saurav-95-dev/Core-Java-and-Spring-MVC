hence we will get run-time exception :
//Starting Collections :
//->Starting with collection interface:
//Collection belongs to java.util package.
//Collections work with objects and not with the primitive values.

import java.util.ArrayList;
import java.util.Collection;

class Hello{
    public static void main(String [] args){
        Collection nums = new ArrayList();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add("6"); //Here it will give run time exception.Hence, to prevent this , we use generics.
        System.out.println("Printing the values directly:");
        System.out.println(nums);
        System.out.println("Printing using for loop:");
        for (Object n : nums){
            System.out.println((int)n);
        }
    }
}
