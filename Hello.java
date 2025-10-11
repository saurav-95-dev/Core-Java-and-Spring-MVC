//Sorting in collection and the use of comparator
//Comparator is an interface

import java.util.*;

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

        Comparator<String> c1 = new Comparator<String>(){
            public int compare(String s1 , String s2){
                if(s1.length() > s2.length())
                    return 1;
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
        //sorting the strings based on length:
        List<String> l1 = new ArrayList<>();
        l1.add("saurabh dev");
        l1.add("laukik");
        l1.add("kiran");
        l1.add("great khali");
        l1.add("the under taker");
        l1.add("Alister.. the demolition man...!");
        l1.add("bee");
        System.out.println("printing strings normally :");
        System.out.println(l1);
        System.out.println("sorting strings based on lenght:");
        Collections.sort(l1 , c1);
        System.out.println(l1);


    }
}