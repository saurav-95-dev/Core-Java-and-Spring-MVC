//Enums in java :
//NOTES :
//Enums are named constant.
//Switch is recommended in case of Enums rather than if-else.


enum Status{
    //Now here , as per java, Status is a class .
    Running , Failed , Success , Pending; //These are the objects name.
}

class Hello{

    public static void main(String [] args){
         Status s = Status.Success;
        System.out.println(s.ordinal() + "->" + s);
        System.out.println();
        //To print all the status :
        Status []arr = Status.values();
        for( Status i : arr){
            System.out.println(i + "->" + i.ordinal());
        }
        System.out.println();
        Status s1 = Status.Failed;
        switch (s1){
            case Running :
                System.out.println("Running...");
                break;
            case Failed :
                System.out.println("Failed...");
                break;
            case Success:
                System.out.println("Success ...");
                break;
            default:
                System.out.println("Pending...");
                break;
        }


    }
}