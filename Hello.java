// 24/08/2025 -- Concept of access modifiers in Java
//NOTE:
//public methods/variables can be accessed from anywhere.
//Protected methods/variables can be used within same class , same package , different package, but it should be subclass.
//Private variable and method can only be used within same class.
//Default access modifiers , can be used within same class and same package.

import Tools.*;
import DB.Student;

class Individual extends Student {
    public void printSomething(){
        //This city variable is accessible in diff package (Hello File) but subclass.
        System.out.println("Protected variable City:" + city);
    }
}

class Demo extends Calculator{
    public void printSomethingNew(){
        //This protected value variable is accessible in diff package (Hello file) but only in Demo subclass.
        System.out.println("Protected variable value:" + value);
        myGreatName();
    }

}
public class Hello {
    public static void main(String[] args) {
        ScientificCalculator calc = new ScientificCalculator();
        int result = calc.mul(3,4); // calls overridden mul() from AdvCalculator
        System.out.println(result);

        double p = calc.power(2,3);
        System.out.println(p);

        Student s = new Student();
        String str = s.nameInformation("Saurabh Dev");
        System.out.println(str);
        System.out.println(s.branch);
        AdvCalculator adv = new AdvCalculator();
        int advResult = adv.mul(4,4); // calls AdvCalculator's mul()
        System.out.println(advResult);
        Demo demo = new Demo();
        demo.printSomethingNew();
        Individual i = new Individual();
        i.printSomething();

    }
}
