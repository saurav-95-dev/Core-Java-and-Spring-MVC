//Two main ways of creating a thread --> By extending a thread class , by implementing the runnable interface .
//METHOD -1 : By extending a Thread class :
//In this approach we directly create a class that is inherited from Thread class and overrides its run() method.

//THREAD PRIORITY :
//-> Multiple Threads and Thread priority adn sleep .
//-> getPriority method --> gives you the current priority of the thread.
//-> Range of this priority goes from 1 to 10.

class A extends Thread{
     public void run(){
         for(int i=1;i<100;i++){
             System.out.println("in a");
             try {
                 Thread.sleep(10); //try-catch because sleep will throw exception
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
         }
     }
}

class B extends Thread{
    public void run(){
        for(int i=1;i<100;i++){
            System.out.println("in b");
            try {
                Thread.sleep(10); //try-catch because sleep will throw exception
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Hello{
    public static void main(String [] args){

        A a = new A();
        System.out.println(a.getPriority());
        a.setPriority(6);
        a.start();

        B b = new B();
        b.setPriority(Thread.MAX_PRIORITY);
        b.start();

    }
}