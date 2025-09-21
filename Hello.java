//Exceptions in java :
//Types of error -> Compile time error , Runtime errors , logical errors .
//Exceptions are basically run-time errors .
//We basically tend to handle the exceptions .
//It is recommended to put only critical statement inside try block , if it runs fines , control will skip the catch block.
//Control only executes the catch block if something goes wrong inside try.


class Hello{
    public static void main(String []args){
        int i = 12;
        int j = 0;

        int result = i/j; //Run time error
        System.out.println("Inside main function");
        System.out.println(result);
    }
}

