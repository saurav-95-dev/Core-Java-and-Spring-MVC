//Concept of Stream-API :
//NOTES:
//Stream is an interface supporting methods like map , filter , reduce etc.
//We can use Stream only once.
//By using Stream , we are not affecting original variable value or data .

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Hello{
    public static void main(String[] args){
        List<Integer> l = Arrays.asList(1,2,3,4 , 5);
        //printing using forEach:
        System.out.println("Printing list using forEach:");
        l.forEach(i-> System.out.println(i));
        System.out.println("Printing list value using Stream:");
        Stream<Integer> s1 = l.stream();
        s1.forEach(i-> System.out.println(i));
        //Performing some operation in list without using stream-api:
        int sum = 0;
        for (int i : l){
            if(i%2==0)
            {
                i = i *2;
                sum = sum + i;
            }
        }
        System.out.println("Operation result:");
        System.out.println(sum);

    }
}