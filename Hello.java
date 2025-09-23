//Creating thread via implementing runnable interface :
//Thread is basically a class which implements runnable interface . Inside runnable interface , we have a method called run.
//In runnable interface we don't have start method , previously it was coming from Thread class.

class A implements Runnable{
     public void run(){
         for(int i=1;i<5;i++){
             System.out.println("in a");
             try {
                 Thread.sleep(10); //try-catch because sleep will throw exception
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
         }
     }
}

class B implements Runnable{
    public void run(){
        for(int i=1;i<5;i++){
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

//        A a = new A();
//        B b = new B();
        Runnable a = new A(); //we can create reference of an interface and object of the class.
        Runnable b = new B();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        t1.start();
        t2.start();
//        a.start();
//        b.start();

    }
}