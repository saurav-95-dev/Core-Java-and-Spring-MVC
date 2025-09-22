//Taking user-input in java :
//NOTE --> Interview ques -> println belongs to which class ? -->It belongs to print-stream class
//We can take input via bufferReader or by scanner . In case of bufferReader , it's a resource , hence it is your responsibility to close it
//BufferReader can not only take input from key , but also from file , network etc.


import java.util.Scanner;

class Hello{
    public static void main(String [] args){

        System.out.println("Inside main function");
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();
        System.out.println(result);

    }
}
