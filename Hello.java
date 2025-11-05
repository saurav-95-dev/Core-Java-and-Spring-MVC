//Throw/throws keyword:
//throw keyword is used to throw the exception for the catch block to catch it .
//If we are doing a valid arithmetic for example , catch block won't get executed .
//Here we want to catch block to be executed for even a valid arithmetic operation , for that purpose we can use throw.
//**throwing self created custom exception.

class SaurabhException extends Exception{
    public SaurabhException(String s){
        super(s);
    }
}

class Hello{

    public static void main(String [] args){

        int i = 12;
        int j = 6;
        int result = 0;

        try{
            result = i/j;
            if(result == 0){
                //let's suppose here we want to throw a custom exception-of our own.
                throw new ArithmeticException("Additional message of Arithmetic exception when result is 0..");
            }

            if(result == 2){
                throw new SaurabhException("This additional message from saurabh's custom exception where the resultant is 2");
            }

        }
        catch (SaurabhException e){
            System.out.println("This is the message from saurabh's custom exception where resultant is 2 : " + e);
        }
        catch(ArithmeticException e){
            System.out.println("Something went wrong because the result is 0 or you have 0 as a denominator..!" + e);
        }


    }
}