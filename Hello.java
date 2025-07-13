//Concept of package :
//Public , Private , Protected . 

import Devices.AdvancedCalculator;
import Devices.Calculator;

class Sub extends AdvancedCalculator {
    
    public void test() {
       
        System.out.println(this.result);
    }
    
}

class Hello {
    public static void main(String[] args) {

        System.out.println("Concpet of package and access modifiers");
        Calculator obj1 = new Calculator();
        int r1 = obj1.add(2, 4);
        System.out.println(r1);
        
        
        System.out.println(obj1.result1);

    }
}
