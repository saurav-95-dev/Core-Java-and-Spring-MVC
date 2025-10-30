//Concept of sealed keyword:
//Problem statement : Not every class should have the power to access class the parent class , by using sealed keyword , we can restrict it.

//In terms of sealed classes:
//Give class D permission to inherit B
sealed class A permits B,C{

}

sealed class B extends A permits D{

}
final class C extends A{

}

final class D extends B{

}

class Hello{
    public static void main(String[] args){

    }
}