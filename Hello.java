//Abstract Keyword in Java:
//NOTES:
//abstract method can only belong to an abstract class.
//It is not possible to create the object of an abstract class but it is ok to create a reference of it.
//It is necessary to have an abstract class for an abstract method but reverse os not true.
//It is not necessary to have an abstract method inside an abstract class.
//It is necessary to implement the abstract methods inside the child class which is also called concrete class.

abstract class Car{

    public abstract void drive();
    public void playMusic(){
        System.out.println("I'm playing music");
    }

}

class Iten extends Car{
    public void drive(){
        System.out.println("I'm driving");
    }

}

public class Hello{
    public static void main(String [] args){
       Car car = new Iten();
       car.drive();
       car.playMusic();
    }
}