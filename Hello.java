//Enums in java :
//NOTES :
//Enums are named constant.

enum Status{
    //Now here , as per java, Status is a class .
    Running , Failed , Success , Pending; //These are the objects name.
}

class Hello{

    public static void main(String [] args){
         Status s = Status.Success;
        System.out.println(s);

    }
}