//Concept of LVTI --> Local variable type inference.
//we can declare a variable using var keyword but only for a local variable and not instance variable
//instance variable are for the storing purpose whereas local variable are for the processing purpose.
//if we declare variable using var , we need to assign a value to it which is compulsory.

class Student{

}
class Hello{
    public static void main(String[] args){
        System.out.println("local variable type inference:");
        int i = 12;
        var j = 15;
        int c;
        //var in arrays and objects:
        int arr[] = new int[12];
        var arr1 = new int[10];

        var obj = new Student();

    }
}