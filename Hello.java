//Introduction to Threads :
//Thread can be defined as smallest unit of a task.
//We can have multiple threads at the same time.
//In this example we are trying to execute the both the methods of both the class together , and for that purpose , we'll use threads.
//Note that in every thread , you need to have a run method.

class A extends Thread{
    public void run(){
        for(int i=1;i<100;i++){
            System.out.println("in a show..");
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=1;i<100;i++){
            System.out.println("in b show..");
        }
    }
}

class Hello{
    public static void main() {

        A a = new A();
        a.start();
        System.out.println();
        B b = new B();
        b.start();


    }

}