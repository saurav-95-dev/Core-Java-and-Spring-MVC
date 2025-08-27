//Wrapper classes Glimpse
//For every primitive class , we have a class in java which extends the object class.


public class Hello{
    public static void main(String [] args){
        //Conversion from primitive to object type.
        int n = 4;
        Integer m = new Integer(n); //Boxing
        System.out.println(m);
        int a = 12;
        Integer b = a; //Auto-boxing (When we try to store a primitive type to Wrapper class variable)
        System.out.println(b);
        //Conversion from object to primitiv type.
        int z = b;
        System.out.println("Z value:" + z); //Auto-unboxing (When we try to fetch/store a wrapper class variable value inside a primitive type)

        //Others benefits:
        String number  = "12";
        int num = Integer.parseInt(number);
        System.out.println(num*3);

    }
}