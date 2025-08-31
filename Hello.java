//Enums and annotations:
//Enums are a kind of class in java , and all the named constant inside it can be called as the objects.
//Switch is supported in enum.
//Although Enum is a class , u cant extends enum in any other class. But we can define methods , constructor , variables.
//By default , enum in java extends enum class . and all the extra methods we get from enum class.

enum Laptop{
    //Whatever the values we are passing here , will get assigned in private int price variable.
    mackbook(2000), hp , thinkpad(300) , lenovo(800);
    private int price;

    //Parameterized constructor:
    private Laptop(int price){
        this.price = price;
        System.out.println("This is parameterized constructor");
    }

    private Laptop(){
        this.price = 200000;
        System.out.println("This is default constructor");
    }

    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }

}

class Hello{

    public static void main(String[] args) {
        Laptop l = Laptop.thinkpad;
        System.out.println(l);
        System.out.println(l + " : " + l.getPrice());
        //printing all the laptop:
        System.out.println("Printing for all laptops:");
        Laptop arr[] = Laptop.values();
        for(Laptop i : arr){
            System.out.println(i + " : " + i.getPrice());
        }
    }

}