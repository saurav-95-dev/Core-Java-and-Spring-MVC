import java.util.HashMap;
import java.util.Map;

class Hello{
    public static void main(String []args){
        Map<String , Integer> m = new HashMap<>();
        m.put("saurabh" , 23);
        m.put("pragya" , 34);
        System.out.println(m);
        for(String s : m.keySet()){
            System.out.println(s + " ---> " + m.get(s));
        }
    }
}