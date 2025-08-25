package DB;

import Tools.AdvCalculator;
import Tools.Calculator;

class NewDemo extends Calculator{
    public void printSomethingGreat(){
        System.out.println("Protected variable inside Student.java of DB package:" + value);
    }
}
public class Student{
    public String branch = "Computer science";
    protected String city = "Gorakhpur";

    public String nameInformation(String str){
        NewDemo demo = new NewDemo();
        demo.printSomethingGreat();
        return str;
    }

}