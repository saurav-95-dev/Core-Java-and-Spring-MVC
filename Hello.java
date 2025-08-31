//Enums and annotations:
//Enums are a kind of class in java , and all the named constant inside it can be called as the objects.

enum Status{
    running , waiting , failed , successful;
}

public class Hello {

    public static void main(String[] args){

        Status s = Status.running;
        //For different named constants we have a number.
        System.out.println(s.ordinal());
        //For getting more than one status at a time , we use values method with Status class (Enum).
         Status arr[] = Status.values();
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }

}