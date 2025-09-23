//finally block to close resource :


import java.util.Scanner;

class Hello{
    public static void main(String [] args){
        System.out.println("Enter a number:");
        Scanner sc = null;
        try{
            sc = new Scanner(System.in);
            int result = sc.nextInt();
            System.out.println(result);
        }
        finally {
            sc.close();
        }
    }
}