//Types of interface :
//Normal interface , functional interface (SAM), Marker .
//Normal interface are the one with 2 or more methods .
//Functional interface are the one with only one method declaration.
//Marker interfaces are actually blank interface with no method.
//**We can use lambda expression only with functional interface.

@FunctionalInterface //Annotations used here
interface A{
    void code();
}

class Hello{

    public static void main(String [] args){
       A a = ()->{
           System.out.println("code implemented in lamda expression");
       };

       a.code();
    }

}