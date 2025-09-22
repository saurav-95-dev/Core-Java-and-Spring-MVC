//Taking user-input in java :

//Implementing try with finally/ try with resources .
//try can be used with finally.
//finally is used where we want to execute some statement irrespective of the exception that we encounter.
//finally can be used with try in order to close a resource.
//finally is basically meant for closing the resource, closing DB connection , closing file etc.


import javax.xml.transform.Source;
import java.util.Scanner;

class Hello{
    public static void main(String [] args){

        System.out.println("Inside main");
        Scanner sc = null;
        try{
            sc = new Scanner(System.in);
            int result = sc.nextInt();
            System.out.println(result);
        }
        finally {
           sc.close();
        }

    }
}
