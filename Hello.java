//Threads-REV :

class A extends Thread{
    public void run(){
        for(int i=1;i<100;i++){
            System.out.println("Hii..");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=1;i<100;i++){
            System.out.println("Hello..");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Hello{
    public static void main(String []args){
        A a = new A();
        B b = new B();
        System.out.println(a.getPriority());
        System.out.println(b.getPriority());
        a.start();

        a.setPriority(1);
        b.start();
        b.setPriority(Thread.MAX_PRIORITY);

    }
}