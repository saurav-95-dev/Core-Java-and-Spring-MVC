package Tools;

public class Calculator{
    protected int value = 1000000;
    public int add(int a , int b){

        return a+b;
    }
    public int sub(int a , int b){
        return a-b;
    }
    public int mul(int a , int b){
        return (a*b);
    }
    protected void myGreatName(){
        System.out.println("This is protected method of Calculator class inside DB package");
    }

}