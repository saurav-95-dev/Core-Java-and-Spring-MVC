
interface Computer{

    void buildApplication();
}

class Desktop implements Computer{
    public void useDesktop(){
        System.out.println("Inside desktop method of Desktop class");
    }
    public void writeCodeDesktop(){
        System.out.println("Writing code using desktop");
    }
    public void buildApplication(){
        System.out.println("Building application using desktop");
    }
}

class Laptop implements Computer{
    public void useLaptop(Desktop desktop){
        desktop.useDesktop();
    }
    public void writeCodeLaptop(){
        System.out.println("Writing code using laptop");
    }
    public void buildApplication(){
        System.out.println("Building application using laptop");
    }
}

class Developer{
    //Loose coupling as we are receiving the reference of Computer class interface which is getting implemented by both Laptop and Desktop class.
    public void buildApplication(Computer c){
        System.out.println("Software engineering");
        c.buildApplication();
    }
}

class Hello{
    public static void main(){

        Developer developer = new Developer();
        //Loose coupling:
        Computer desktop = new Desktop();
        Computer laptop = new Laptop();
        developer.buildApplication(laptop);
    }
}