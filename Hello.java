//Concept of classes and objects:

class Calculator{
    int num;
    public int add(int a , int b){
        return a+b;
    }
}
public class Hello{
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int result = c.add(2,3);
        System.out.println(result);
    }
}

//Takeaways:
//In java , in order to create an object , you first have to create a class.
//Java Byte code is platform independent and can run on any OS that has JRE.
//JRE has a software component called JVM that converts java byte code into native code for the unline OS.
//We create a blueprint by creating class which gets compiled into bytecode . This bytecode pass into JVM from where
// we get our object.

