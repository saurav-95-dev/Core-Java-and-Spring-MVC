//Throw/throws keyword:
//throw keyword is used to throw the exception for the catch block to catch it .
//If we are doing a valid arithmetic for example , catch block won't get executed .
//Here we want to catch block to be executed for even a valid arithmetic operation , for that purpose we can use throw.
//throwing self created custom exception.

class Hello{
    public static void main(String [] args){
        int i = 0;
        int j = 2;
        int result = 0;

        try{
            result = i/j;
            if(result == 0){
                throw new ArithmeticException("Additional message here..");
            }

        }
        catch(ArithmeticException e){
            System.out.println("Something went wrong..!" + e);
        }

        System.out.println("Inside main function...");
        System.out.println();
        System.out.println(result);
        System.out.println();
        System.out.println("Last statement inside main function..");
    }
}