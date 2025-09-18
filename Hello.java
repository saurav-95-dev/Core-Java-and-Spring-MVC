//Enums in java :
//NOTES :
//Enums are named constant.
//Switch is recommended in case of Enums rather than if-else.
//Although enums are treated as class in java , but you cannot extend enums with any other class.
//Apart from the above you can have objects , methods , variables as well as constructors.
//By-default enum in java extends the enum class.

//Demonstration of enums with constructors , getters and setters :

enum Laptop{
    macbook(12334) , hp(123) , lenovo(464) , acer(4546); //Named objects

    private int price;

    private Laptop(int price){
        this.price = price;
    }

    //getters and setters:
    public void setPrice(int p){
        this.price = p;
    }
    public int getPrice(){
        return price;
    }



}

class Hello{
    public static void main(String[] args){

        Laptop l = Laptop.macbook;
        System.out.println("Price of " + l + " is: " +l.getPrice());

    }
}
