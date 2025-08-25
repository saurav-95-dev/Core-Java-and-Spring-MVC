package Tools;

public class AdvCalculator extends Calculator {

    //Child method of child class.
    public int mul(int a , int b){
        //value is protected variable of Calculator class
        System.out.println("VALUE IS:" + value);
        return (a*b)+4;
    }
    public int div(int a , int b){
        return a/b;
    }
}