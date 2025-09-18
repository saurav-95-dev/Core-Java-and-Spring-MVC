//Enums in java :
//NOTES :
//Enums are named constant.
//Switch is recommended in case of Enums rather than if-else.
//Although enums are treated as class in java , but you cannot extend enums with any other class.
//Apart from the above you can have objects , methods , variables as well as constructors.
//By-default enum in java extends the enum class.

enum Status {
    waiting , success , error , failed , pending;
}

class Hello{
    public static void main(String [] args){
        System.out.println("Inside main function");
        Status s = Status.failed;
        System.out.println(s);
        System.out.println("Ordinal of " + s + " is " + s.ordinal());
        System.out.println();
        System.out.println("Printing all values : ");
        //printing all values :
        Status[] arr = Status.values();
        for(Status i : arr){
            System.out.println(i + "->" + i.ordinal() );
        }

    }
}