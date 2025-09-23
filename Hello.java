//Exception REV-01:

class SaurabhException extends Exception{
    public SaurabhException(String s){
        super(s);
    }
}

class Hello{
    public static void main(String [] args){
        int i=12;
        int j=2;
        int result = 0;
        try{
            result = i/j;
            if(result == 2){
                throw new ArithmeticException("This is additional message as the result is 2");
            }

            if(result == 6){
                throw new SaurabhException("This is additional message from SaurabhException as the result is 6");
            }
        }
        catch(ArithmeticException e){
            System.out.println("Something went wrong because the result is probably 2 or denominator is 0 ->" + e);
        }
        catch (SaurabhException e){
            System.out.println("Something went wrong because the result is probably 6->" + e);
        }

        System.out.println(result);
        System.out.println("last statement of main...");

    }
}