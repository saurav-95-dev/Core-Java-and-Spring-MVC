//Concept of classes and objects:

class Demo{

    int num; //This is instance variable

    public String playMusic(int cost){
        //Here , cost is a local variable.
        if(cost >= 10){
            return "Playing music";
        }
        return "Nothing";
    }
}
public class Hello{
    public static void main(String[] args) {
         //Here demo is a reference variable.
         Demo demo = new Demo();
         String str = demo.playMusic(5);
         System.out.println(str);

    }
}
//Takeaways:
//Instance variable gets space inside Heap-memory.
//Reference variable are inside the stack which points to the address of the corresponding object that is created in the Heap.
