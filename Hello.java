//Concept of interface:
//They don't have their own memory in the heap.
//All the methods inside the interface are by default public and abstract.
//All the variables declared inside the interface are final and static.
//Once we declare the methods inside the interface , its becomes compulsory to implement those methods inside the class which is implementing it.
//If we fail to implement the methods of an interface inside the class which is extending it , then by default , that class also becomes an abstract class.
//NOTE: Compile time rule says , that we can call object which reference type is aware of.
//We cannot object of a parent class and reference of a child class.

interface Employee{
    //These variables are final and static:
    int salary=12000;
    String company = "Mckinsey";

   void code();
   void manage();

}

class CEO implements Employee{
    public void code(){
        System.out.println("Inside code method defined inside CEO class");
    }
    public void manage(){
        System.out.println("Inside manage method defined inside CEO class");
    }
    //Separate method for CEO:
    public void testing(){
        System.out.println("Inside testing method defined inside CEO class which is not implementing Employee class methods");

    }
}

class Hello{
    public static void main(String []args){
        System.out.println("inside main function");
        //Object of child class and reference of parent class .
        Employee e = new CEO(); //Creating reference of Employee and object of CEO class
        e.code();
        e.manage();
        System.out.println();
        CEO c = new CEO();
        c.code();
        c.manage();
        c.testing();
    }
}