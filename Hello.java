//Multi-Threading :
//Creating thread by implementing runnable interface via lamda expression.


class Hello {
    public static void main(String[] args) {
        System.out.println("Inside main function");

        Runnable a = ()->{
            for(int i=1;i<100;i++){
                System.out.println("Hii");
            }
        };
        Thread t1 = new Thread(a);
        t1.start();
        Runnable b =()->{
            for(int i=1;i<100;i++){
                System.out.println("Hello");
            }
        };
        Thread t2 = new Thread(b);
        t2.start();

    }
}