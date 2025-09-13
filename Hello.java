

abstract class Employee{

    public abstract void coder();

    public void receptionist(){
        System.out.println("Receptionist method inside Employee class-non-abstract");
    }

    public void manager(){
        System.out.println("manager method inside Employee class-non-abstract");
    }
    public abstract void dataAnalyst();
}

class Engineer extends Employee{
    public void dataAnalyst(){
        System.out.println("This is the implementation of dataAnalyst inside Engineer");
    }
    public void coder(){
        System.out.println("This is the implementation of coder inside Engineer");
    }
    public void businessAnalyst(){
        System.out.println("This is business analyst inside Engineer class which is not implementing any abstract class");
    }
}

public class Hello{
    public  static void main(String [] args){
        System.out.println("Inside main function");
        //Compile time rule -> You can only call methods which reference type knows about.
        Employee e = new Engineer();
        e.manager();
        e.dataAnalyst();
        e.coder();
        System.out.println();
        System.out.println("Printing from Engineer reference");
        Engineer e1 = new Engineer();
        e1.businessAnalyst();
        e1.coder();
        e1.manager();
        e1.receptionist();
        e1.dataAnalyst();


    }
}