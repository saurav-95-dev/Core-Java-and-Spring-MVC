

class Desktop{
    public void useDesktop(){
        System.out.println("Inside desktop method of Desktop class");
    }
    public void writeCodeDesktop(){
        System.out.println("Writing code using desktop");
    }
}

class Laptop{
    public void useLaptop(Desktop desktop){
        desktop.useDesktop();
    }
    public void writeCodeLaptop(){
        System.out.println("Writing code using laptop");
    }
}

class Developer{
    //Tight coupling as we are limit to receiving only Laptop object here.
    public void buildApplication(Laptop laptop){
        System.out.println("Software engineering");
        laptop.writeCodeLaptop();
    }
}

class Hello{
    public static void main(){
        Desktop desktop = new Desktop();
        Laptop laptop = new Laptop();
        Developer developer = new Developer();
        //Tight coupling:
        developer.buildApplication(dektop);
    }
}