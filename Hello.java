//Annotations and Types of Interface :
//Annotations are meant for resolving the bugs at run time.

class A{
    public void code(){
        System.out.println("coding in a class ");
    }
}

class B extends A{

    @Override
    public void code(){
        System.out.println("coding in b class");
    }
}

class Hello{

    public static void main(String [] args){
        A a = new B();
        a.code();
    }

}