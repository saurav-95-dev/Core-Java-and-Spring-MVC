//Working of throws keyword :
//NOTES:
//throws is used when there is ducking of the exceptions , and it makes sense for checked exceptions.

class A{
    public void show(){

        System.out.println("Inside show function");
        try{
            Class.forName("Demo");
        }
        catch (ClassNotFoundException e){
            System.out.println("Sorry ..class not found anywhere...");
        }
    }
}

class Hello{

    static {
        System.out.println("Main class is loaded...");
    }
    public static void main(String [] args){

        System.out.println("Inside main function");
        A a = new A();
        a.show();
    }
}