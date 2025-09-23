//Two main ways of creating a thread --> By extending a thread class , by implementing the runnable interface .

//METHOD -1 : By extending a Thread class :
//In this approach we directly create a class that is inherited from Thread class and overrides its run() method.


class A extends Thread{
     public void run(){
         for(int i=1;i<100;i++){
             System.out.println("in a");
         }
     }
}

class B extends Thread{
    public void run(){
        for(int i=1;i<100;i++){
            System.out.println("in b");
        }
    }
}

class Hello{
    public static void main(String [] args){

        A a = new A();
        a.start();
        B b = new B();
        b.start();

    }
}