//Multi-Threading :
//Creating thread by implementing runnable interface via anonymous inner class.

class A extends Thread{
    public void run(){
        for(int i=1;i<100;i++){
            System.out.println("hii");
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=1;i<100;i++){
            System.out.println("hello");
        }
    }
}




class Hello{
    public static void main(String [] args){
        System.out.println("Inside main function");
        A a = new A();
        a.start();
        B b = new B();
        b.start();
    }
}