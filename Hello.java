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
        Status s = Status.pending;
        System.out.println(s);
        System.out.println();
        System.out.println("Usage of switch:");
        switch (s){
            case waiting :
                System.out.println("Waiting");
                break;
            case success :
                System.out.println("Success");
                break;
            case error :
                System.out.println("error");
                break;
            case failed :
                System.out.println("failed");
                break;
            default:
                System.out.println("Pending..");
        }
    }
}