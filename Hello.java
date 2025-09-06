//Interface revisit :
//NOTES:
//In the abstract class , we can have abstract as well as normal methods.
//If we have a class with only abstract methods inside it , we can use interface.
//Every method inside interface , are by default public abstract.
//When a class implements an interface , it becomes compulsory to define all the methods declared inside the interface .
//If we don't define the methods inside the class which implements interface , then that class becomes abstract class by default.
//Variable inside an interface are by-default final and static.

interface A{
    void playMusic();
    void goToGym();
    int marks = 22;
    String name = "Saurabh Dev";
}

class B implements A{

    public void playMusic(){
        System.out.println("Playing music inside class B");
    }
    public void goToGym(){
        System.out.println("Inside gym");
    }

}

class Hello{
    static void main(String[] args) {
        System.out.println("Inside main function:");
        A a = new B();
        a.goToGym();
        a.playMusic();
        String name = A.name;
        int  m = A.marks;
        System.out.println("Marks :" + m + ", Name:" + name);

    }

}