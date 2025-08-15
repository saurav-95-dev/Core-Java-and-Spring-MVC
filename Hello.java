//Strings:
public static void main(String[] args) {
    String s = "Saurabh";
    s = s + " Dev"; //Here , the original string won't be changed. Instead , a new object will get created at different location in Heap.
    System.out.println(s);
    String s1 = "Hello";
    String s2 = "Hello";
    //In stack , both s1 and s2 will be pointing at same location in Heap.
    //s1 and s2 will share the same object in Heap . Np separate object will be created both s1 and s2.
    //When line 7 get executed , we already have s1 Hello in the Heap inside string pool constant . Hence instead of separately creating a object , s2 will point at same location in Heap where the s1 is pointing.
}

//Takeaways:
//In java , strings are by default immutable.
//Once we create the object , we cannot change it.

