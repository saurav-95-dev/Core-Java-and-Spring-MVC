package Devices;

public class AdvancedCalculator {

    protected int result =9;

   
    public int mul(int a, int b) {
        result = a * b;
        return result;
    }
    
    public int div(int a, int b) {
        result = a / b;
        return result;
    }

    public int getResult(){
        return result;
    }


}
