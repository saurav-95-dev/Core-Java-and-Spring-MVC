//Multi-Threading :
//Creating thread by implementing runnable interface via anonymous inner class.

class A implements Runnable{
    public void run(){
        for(int i=1;i<100;i++){
            System.out.println("hii");
        }
    }
}

class B implements Runnable{
    public void run(){
        for(int i=1;i<100;i++){
            System.out.println("hello");
        }
    }
}


class Hello {
    public static void main(String[] args) {
        System.out.println("Inside main function");

        Runnable a = new A();
        Thread t1 = new Thread(a);
        t1.start();
        Runnable b = new B();
        Thread t2 = new Thread(b);
        t2.start();

    }
}