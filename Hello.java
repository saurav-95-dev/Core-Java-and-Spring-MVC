enum Laptop{
    macbook(12334) , hp(123) , lenovo , acer(4546); //Named objects

    private int price;

    private Laptop(){
        System.out.println("default constructor called");
        price = 1;
    }
    private Laptop(int price){
        System.out.println("Parameterized constructor called for :" + this.name());
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
        System.out.println();
        //Printing all laptop :
        System.out.println("Printing all laptops:");
        Laptop[] arr = Laptop.values();
        for(Laptop i : arr){
            System.out.println(i + "->" + i.ordinal() + " price -->" + i.getPrice() );
        }

    }
}