//Need for the interface :
//This is an example of tight coupling:

abstract class Computer{
   public abstract void code();
}

class Laptop extends Computer{
    public void code(){
        System.out.println("Developing application using laptop");
    }
}

class Desktop extends  Computer{
    public void code(){
        System.out.println("Developing application using desktop");
    }
}

class Developer{
    //developApplication method is dependent on device specific object
    public void developApplication(Computer device){
        System.out.println("Inside developApplication method..");
        device.code();
    }
}

public class Hello{
    public static void main(String[] args) {
        System.out.println("Inside main function");
        Computer desktop = new Desktop();
        Computer laptop = new Laptop();
        Developer saurabh = new Developer();
        saurabh.developApplication(laptop);
    }
}