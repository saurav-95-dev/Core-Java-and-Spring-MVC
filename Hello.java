//Exceptions in java :
//Types of error -> Compile time error , Runtime errors , logical errors .
//Exceptions are basically run-time errors .
//We basically tend to handle the exceptions .
//It is recommended to put only critical statement inside try block , if it runs fines , control will skip the catch block.
//Control only executes the catch block if something goes wrong inside try.
//Exception is like a parent class of all type of exceptions.
//Class hierarchy in the context of exceptions ->
//object class --> Throwable class --> Errors (can't handle) & Exceptions(can/should be handled).
//Errors --> can be ThreadDeath , VM Error  , IO error , outOfMemory error .
//Exceptions --> can be Runtime (Arithmetic , arrayIndexOutOfBound , Null pointer) which are checked exceptions or else it can be SQL Exceptions/IO Exceptions etc. which are basically checked exceptions.
//In case of runtime exception , there ain't a compulsion to handle the exception , but in case of an exception which is not run-time exception , compiler will force you to handle the exception.


class Hello{
    public static void main(String []args){
        int i = 12;
        int j = 0;
        int result = 0;

        try{
            result = i/j; //Run time error
        }
        catch (ArithmeticException e){
            System.out.println("Here is the exception -> " + e);
        }
        catch (Exception e){
            System.out.println("Something went wrong here..!");
        }

        System.out.println("Inside main function");
        System.out.println(result);
        System.out.println("last statement");
    }
}

