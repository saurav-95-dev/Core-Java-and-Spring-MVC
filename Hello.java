//Throw/throws keyword:
//throw keyword is used to throw the exception for the catch block to catch it .
//If we are doing a valid arithmetic for example , catch block won't get executed .
//Here we want to catch block to be executed for even a valid arithmetic operation , for that purpose we can use throw.
//

class Hello{
    public static void main() {
        int i= 12;
        int j = 2;
        int result = 0;

        try{
            result = i/j;
            if(j==2){
                throw new ArithmeticException("This is a custom message alongwith the default one");
            }
        }
        catch(ArithmeticException e){
            result = i / 6;
            System.out.println("Something went wrong here...!" + e);
        }
        catch(Exception e){
            System.out.println("Inside parent exception class" + e);
        }
        System.out.println("Inside main function");

        System.out.println();
        System.out.println(result);
        System.out.println("Last statement inside main function..");
    }
}