//Encapsulation in Java:

class Computer{
     private int ram = 12;
     private String company = "HP";

     public void showModel1(){
         System.out.println("This is model-1");

     }

     public int getModel1Ram(){
         return ram;
     }
     public String getModel1Company(){
         return company;
     }
}

class Hello{
    public static void main(String[] args){
         Computer computer = new Computer();
         computer.showModel1();
        System.out.println("Ram:" + computer.getModel1Ram() + "\nCompany:" + computer.getModel1Company());

    }
}