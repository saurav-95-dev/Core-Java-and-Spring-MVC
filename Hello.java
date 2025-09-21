//Working of throws keyword :
//NOTES:
//throws is used when there is ducking of the exceptions , and it makes sense for checked exceptions.

class A{
    public void show() throws ClassNotFoundException{

        System.out.println("Inside show function");

            Class.forName("Demo");

    }
}

class Hello{

    static {
        System.out.println("Main class is loaded...");
    }
    public static void main(String [] args){

        System.out.println("Inside main function");
        A a = new A();
        try{
            a.show();
        }
        catch (ClassNotFoundException e){
            System.out.println("OOPs .. .class not found.." + e);
        }
    }
}