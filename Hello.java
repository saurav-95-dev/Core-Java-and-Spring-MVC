//Need for the interface :
//This is an example of tight coupling:

class Laptop{
    public void code(){
        System.out.println("Developing application using laptop");
    }
}

class Desktop{
    public void code(){
        System.out.println("Developing application using desktop");
    }
}

class Developer{
    //developApplication method is dependent on device specific object
    public void developApplication(Desktop d){
        System.out.println("Inside developApplication method..");
        d.code();
    }
}

public class Hello{
    public static void main(String[] args) {
        System.out.println("Inside main function");
        Laptop l = new Laptop();
        Desktop d = new Desktop();
        Developer saurabh = new Developer();
        saurabh.developApplication(d);
    }
}