//Java Collection :
//1) Concept of Collection interface .
//Collection interface extends iterable interface .
//List is basically an interface implemented by a class called ArrayList.


import java.util.ArrayList;
import java.util.Collection;

class Hello{
    public static void main(String []args){
        System.out.println("inside main");

        Collection nums = new ArrayList();
        nums.add(1);
        nums.add(3);
        nums.add(6);
        nums.add(13);
        nums.add(9);
        nums.add(7);

        System.out.println(nums);



    }
}