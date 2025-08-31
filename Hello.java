//Enums and annotations:
//Enums are a kind of class in java , and all the named constant inside it can be called as the objects.
//Enums with if-else and switch:

enum Status{
    running , waiting , failed , successful; // Named constants (can be called as objects)
}

public class Hello {

    public static void main(String[] args){
        Status status = Status.waiting;
        if(status == Status.running){
            System.out.println("System is running...");
        }
        else if(status == Status.waiting){
            System.out.println("In waiting mode ..");
        }
        else if(status == Status.failed){
            System.out.println("Transaction failed..");
        }
        else{
            System.out.println("Transaction successful");
        }
    }

}
