// 24/08/2025 -- Concept of packages in Java
//Notes:
//Every java file will have java.lang.* package imported by default.


import Tools.*;
import DB.Student;

public class Hello {

    public static void main(String[] args){
         ScientificCalculator calc = new ScientificCalculator();
         int result = calc.mul(3,4);
         System.out.println(result);
         double p = calc.power(2,3);
         System.out.println(p);
         Student s = new Student();
         String str = s.nameInformation("Saurabh Dev");
        System.out.println(str);

    }

}
