//interface cannot have constructors but abstract classes can :

abstract class A{

    public abstract void code();
    public abstract void manage();

    public int salary;
    public String company;

    public A(int salary , String company){
        System.out.println("Parent constructor called");
        this.salary = salary;
        this.company = company;
    }

}

class B extends A{

    public void code() {
        System.out.println("code implemented inside B class");
    }

    public void manage() {
        System.out.println("manage implemented inside B class");
    }

    public B(int salary , String company){

        super(salary ,company);
        this.salary = salary;
        this.company = company;
        System.out.println("Child constructor called");
    }
}

class Hello{
    public static void main(String []args){

        A a = new B(123 , "DXC");
        System.out.println(a.salary  + " , " + a.company);
    }
}