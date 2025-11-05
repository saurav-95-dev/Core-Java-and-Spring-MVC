
//Types of interface :
//Normal interface , functional interface (SAM), Marker .
//Normal interface are the one with 2 or more methods .
//Functional interface are the one with only one method declaration.
//Marker interfaces are actually blank interface with no method.
//**We can use lambda expression only with functional interface.

@FunctionalInterface //Annotations used here
interface A{
    void code(int i);
}

interface B{
    int manage(int a , int b);
}

interface C{
    public String testing(String name);
}

class Hello{

    public static void main(String [] args){
        A a = (int i)->{
            System.out.println("code implemented in lamda expression-" + i);
        };

        a.code(123);

        B b = (int x , int y)->{
            return x+y;
        };
        int result  = b.manage(12,4);
        System.out.println(result);

        C c = (String name) ->{
            return name;
        };

        String str = c.testing("Sapient");
        System.out.println(str);
    }

}
