//Sorting in collection and the use of comparator
//Comparator is an interface

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Hello{
    public static void main(String[]args){

        Comparator<Integer> com = new Comparator<Integer>(){
            public int compare(Integer i , Integer j){
                if(i%10 > j%10){
                    return  1;
                }
                else
                    return -1;
            }
        };
        List<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(13);
        l.add(55);
        l.add(71);
        l.add(90);
        l.add(88);
        System.out.println("b4 sorting:");
        System.out.println(l);
        System.out.println("After sorting without comparator:");
        System.out.println(l);
        System.out.println("After sorting with using comparator:");
        Collections.sort(l , com);
        System.out.println(l);


    }
}