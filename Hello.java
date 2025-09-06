//Need for the interface:
//For loose coupling.

interface Computer{
    void code();

}

class Laptop implements Computer{

    public void code() {
        System.out.println("Coding , debugging , deployment inside laptop");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Coding , debugging , deployment inside desktop");
    }
}

class Developer{
    public void codeAppliation(Computer l){
        l.code();
    }
}

class Hello{
    static void main(String[] args) {
        Developer developer = new Developer();
        Computer l = new Laptop();
        Computer d = new Desktop();
        developer.codeAppliation(d);
    }
}