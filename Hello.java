//Revisit java collection :
//NOTES :
//There are 3 things --> collection api , Collection , Collections.
//collection api is a topic , Collection is ann interface , Collections is a class.
//

import java.util.ArrayList;
import java.util.Collection;

class Hello{
    public static void main(String[] args){
        //Working with collection interface which is implemented by class - List:
        Collection nums = new ArrayList();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        //run-time exception vulnerability:
        nums.add("5");
        System.out.println("Printing without loop:");
        System.out.println(nums);
        System.out.println("printing with loops but without generics:");
        for(Object o : nums){
            System.out.println((Integer)o);
        }



    }
}