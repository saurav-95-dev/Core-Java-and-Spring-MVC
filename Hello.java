//Enums and annotations:
//Enums are a kind of class in java , and all the named constant inside it can be called as the objects.

enum Status{
    running , waiting , failed , successful;
}

public class Hello {

    public static void main(String[] args){
        Status s = Status.running;
        System.out.println(s);
    }

}