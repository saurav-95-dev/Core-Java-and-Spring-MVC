//Enums and annotations:
//Enums are a kind of class in java , and all the named constant inside it can be called as the objects.
//Switch is supported in enum.

//Enums with if-else and switch:

enum Status{
    running , waiting , failed , successful; // Named constants (can be called as objects)
}

public class Hello {

    public static void main(String[] args){
        Status status = Status.successful;
        switch(status){
            case running:
                System.out.println("Running mode..");
                break;
            case waiting:
                System.out.println("in waiting mode ...");
                break;
            case failed:
                System.out.println("In failed mode..");
                break;
            default:
                System.out.println("Transaction sucess..!");

        }
    }

}
