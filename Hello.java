//Concept of sealed keyword:
//Problem statement : Not every class should have the power to access class the parent class , by using sealed keyword , we can restrict it.

//In terms of sealed classes:
//Give class D permission to inherit B
//note: you can make the subclasses non-sealed for it to get extended by some other classes.
sealed class A permits B,C{

}

non-sealed class B extends A{

}
non-sealed class C extends A{

}

class D extends B{

}

//in terms of interface :
//In interface , we don't have option of final , so subclasses can be either sealed or nonsealed
sealed interface X permits Y{

}

non-sealed interface Y extends X{

}

class Hello{
    public static void main(String[] args){

    }
}