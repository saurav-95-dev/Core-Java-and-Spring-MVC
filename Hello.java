
class Saurabh {


    int num1=11;
    static int number = 12;

    public void saurabhShow() {
        System.out.println("This is outer class");
    }

    static class Dev {
        
        int num2;

        public void devShow() {
            System.out.println("This is inner class");
            System.out.println(number);
            Saurabh o = new Saurabh();
            System.out.println(o.num1);

        }
    }
    
}

public class Hello {
    public static void main(String[] args) {
        System.out.println("This is main method");

        Saurabh obj = new Saurabh();
        obj.saurabhShow();

        Saurabh.Dev obj1 = new Saurabh.Dev();
        obj1.devShow();

    }
}