//Starting Collections :
//->Starting with collection interface:
//Collection belongs to java.util package.
//Collections work with objects.


import java.util.ArrayList;
import java.util.Collection;

class Hello{
    public static void main(String [] args){
        Collection nums = new ArrayList();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        System.out.println(nums);
    }
}