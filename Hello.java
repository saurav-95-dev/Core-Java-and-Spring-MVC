//Inner class :
//NOTES:
//-->A class inside a class.
//-->You cannot make outer class static , only inner class can be made static.
//-->To create the object of non-static inner class , you need to create the object of outer class first .
//-->If the inner class is static , we can dont need to object of outer class , we can call the inner class directly from outer class name.

class A{

    public void aShow(){
        System.out.println("Method inside class A");
    }

    class B{
        public void bShow(){
            System.out.println("Method inside inner class B");
        }
    }
    static class C{
        public void cShow(){
            System.out.println("Method inside inner class C");
        }
    }

}
class Hello{
    public static void main(String [] args){

        //To call bShow we need to create the object of B, but first we need to create the object of A first.
        A o1 = new A(); //Created the object of A.
        o1.aShow();
        A.B o2 = o1.new B(); //Using the object of A , we care creating object o2 of B.
        o2.bShow();
        //For calling cShow():
        A.C o3 = new A.C();
        o3.cShow();

        System.out.println("Inside main function");
    }
}