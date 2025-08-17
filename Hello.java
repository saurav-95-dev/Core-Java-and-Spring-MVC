//Encapsulation in Java:

class Computer{
     private int ram;
     private String company;

     public void showModel1(){
         System.out.println("This is model-1");
     }

     //Getters:
     public int getModel1Ram(){
         return ram;
     }
     public String getModel1Company(){
         return company;
     }

     //Setters:
     public void setModel1Ram(int ram , Computer obj){
         obj.ram = ram;
     }
     public void setModel1Company(String company){
         this.company = company;
     }

}

class Hello{
    public static void main(String[] args){
         Computer computer = new Computer();
         computer.showModel1();
         computer.setModel1Ram(122 ,  computer);
         computer.setModel1Company("Lenovo");
        System.out.println("Ram:" + computer.getModel1Ram() + "\nCompany:" + computer.getModel1Company());

    }
}

//Note: We can set values in the setters without using this keyword while keeping the same variable name by passing the object itself.