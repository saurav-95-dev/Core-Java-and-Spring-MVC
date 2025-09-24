//Multi-Threading :
//Race conditions : When 2 or more threads try to access the same method to achieve same operation .
//Preventing race condition :
//join() method --> it allows main thread to wait for other 2 threads to come back and join.


class A{
    int count;
    // here we are using synchronized to basically stop both the threads from accessing the increment method.
    public synchronized void increment(){
        count++;
    }
}

class Hello{
    public static void main(String [] args) throws InterruptedException {
        A a1 = new A();
        //Thread 1:
        Runnable a = ()->{
            for(int i=1;i<=1000;i++){
                a1.increment();
            }
        };
        //Thread 2:
        Runnable b =()->{
            for(int i=1;i<=1000;i++){
                a1.increment();
            }
        };
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(a1.count);

    }
}