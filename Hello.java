//Enums and annotations:
//Enums are a kind of class in java , and all the named constant inside it can be called as the objects.
//Switch is supported in enum.
//Although Enum is a class , u cant extends enum in any other class. But we can define methods , constructor , variables.
//By default , enum in java extends enum class . and all the extra methods we get from enum class.

enum Status{
    running , waiting , failed , successful;
}

class Hello{

    public static void main(String[] args) {
        Status s  = Status.running;
        System.out.println(s.getClass().getSuperclass());
    }

}