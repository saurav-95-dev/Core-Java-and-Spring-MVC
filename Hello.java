
class Hello{

    public static void main(String[] args) {

        System.out.println(l);

        //printing all the laptop:
        System.out.println("Printing for all laptops:");
        Laptop arr[] = Laptop.values();
        for(Laptop i : arr){
            System.out.println(i + " : " + i.getPrice());
        }
    }

}