//More on interfaces:
//NOTE:
//class A will have access to every method of the interfaces which it is implementing along-with its own methods

interface X{
    void code();
    void manage();

}
interface Y{
    void testing();
}
interface Z extends Y{
    void analytics();
}

class A implements X , Z{
    public void code(){
        System.out.println("Implemented code");
    }
    public void manage(){
        System.out.println("Implemented manage");
    }
    public void testing(){
        System.out.println("Implemented testing..");
    }
    public void analytics(){
        System.out.println("Implemented analytics");
    }
    //Separate method inside class A:
    public void exp(){
        System.out.println("Separate method inside class A");
    }
}

class Hello{
    public static void main(String[] args) {
        System.out.println("Inside main function");
        X x = new A();
        x.manage();
        x.code();
        System.out.println();
        Y y = new A();
        y.testing();
        System.out.println();
        Z z = new A();
        z.analytics();
        z.testing();
        A a = new A();
        System.out.println();
        a.exp();


    }
}