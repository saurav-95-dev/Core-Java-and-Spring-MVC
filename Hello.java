//Multi-Threading :
//Race conditions : When 2 or more threads try to access the same method to achieve same operation .

class A{
    int count;
    public void increment(){
        count++;
    }
}

class Hello{
    public static void main(String [] args) {
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

        System.out.println(a1.count);

    }
}