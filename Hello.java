//Multiple Threads and Thread priority adn sleep .
//getPriority method --> gives you the current priority of the thread.
//Range of this priority goes from 1 to 10.

class  A extends Thread{
    public void run(){
        for(int i=1;i<100;i++){
            System.out.println("in a run");
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=1;i<100;i++){
            System.out.println("in b run");
        }
    }
}

class Hello{
    public static void main(String [] args ){
        A a = new A();
        a.start(); //Directly calling run method will execute the method as normal method call and thus no new thread will be created.
        B b = new B();
        b.start();
    }
}