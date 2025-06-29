//CONCEPT OF CLASSES AND OBJET IN JAVA:

class Computer {

    int v = 112; //This is an instance variable which will be created inside heap memory
    public int add(int num1 , int num2){ //num1 and num2 are local variable and will be created inside stack.
        int result  = num1 + num2;
        return result;
    }
}

class Hello {

    public static void main(String[] args) {
        int num1 = 12;
        System.out.println(num1);

        Computer obj = new Computer();
        int answer = obj.add(2, 3);

        Computer obj1 = new Computer();
        System.out.println(answer);

        obj.v = 23;
        System.out.println(obj.v);
            System.out.println(obj1.v);

    }
    
    //Every method has its own stack .
    //When we call obj.add() , its first search add method inside stack and from the address 
}