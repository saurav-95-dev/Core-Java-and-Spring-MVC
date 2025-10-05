//Sorting in collection and the concept of comparator and comparable:
//normal sorting -> Collections class ->sort method.
//Customized sorting --> we can use comparator which is an interface.
//To implement the comparator interface , we can use either anonymous class or a class which implements interface.
//Sorting based on the magnitude of last digit.
import java.util.*;

class Hello{
    public static void main(String [] args){

        //Implementing comparator :
        Comparator<Integer> c = new Comparator<Integer>()
        {
            public int compare(Integer i , Integer j){
                if (i%10 > j%10)
                    return 1;
                else
                    return -1;
            }

        };

        List<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(13);
        l.add(31);
        l.add(11);
        l.add(86);
        l.add(64);
        l.add(19);
        System.out.println("printing normally:");
        System.out.println(l);

        //to sort the values we have a special class called Collections:
        System.out.println("Normal sorting : ");
        Collections.sort(l);
        System.out.println(l);
        System.out.println("Sorting based on last digit:");
        Collections.sort(l , c);
        System.out.println(l);

    }
}