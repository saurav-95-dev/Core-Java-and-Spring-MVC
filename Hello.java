//Concept of classes and objects:
class Calculator{

    public int add(int a,int b){
        return a+b;
    }
}
public class Hello {
    public static void main(String[] args) {
        System.out.println("Building Foundation in java");
        //Create a calculator to add two number:
        Calculator c = new Calculator();
        int result = c.add(5,2);

        System.out.println(result);
    }
}




//Takeaways:
//In java , in order to create an object , you first have to create a class.
//Java Byte code is platform independent and can run on any OS that has JRE.
//JRE has a software component called JVM that converts java byte code into native code for the unline OS.
//We create a blueprint by creating a class which turns into bytecode . This bytecode pass into JVM from where
// we get our object.

