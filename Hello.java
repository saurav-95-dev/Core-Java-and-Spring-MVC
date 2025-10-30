//Concept of sealed keyword:
//Problem statement : Not every class should have the power to access class the parent class , by using sealed keyword , we can restrict it.

//In terms of sealed classes:
sealed class A permits B,C{

}

final class B extends A{

}
final class C extends A{

}
class D extends A{

}

class Hello{
    public static void main(String[] args){

    }
}