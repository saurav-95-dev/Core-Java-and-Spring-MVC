//Concept of Stream-API :
//NOTES:
//Stream is an interface supporting methods like map , filter , reduce etc.

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

class Hello{
    public static void main(String[] args){
        List<Integer> l = Arrays.asList(1,2,3,4);
        //Performing some operation in list without using stream-api:
        int sum = 0;
        for (int i : l){
            if(i%2==0)
            {
                i = i *2;
                sum = sum + i;
            }
        }
        System.out.println(sum);

    }
}