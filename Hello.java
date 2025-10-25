//Java Collection revisit :
//NOTES :
//collection api is a concept , Collection is an interface , and Collections is a class.
//List support working with the index , whereas Collection and Set don't.
//List can have duplicate values but Set can't.
//Generics in collection helps to basically remove the bugs of your code.

import java.util.ArrayList;
import java.util.Collection;

class Hello{
    public static void main(String[] args){
          Collection c = new ArrayList();
          c.add(1);
          c.add(2);
          c.add(3);
          System.out.println(c);
          for(int o : c){
              System.out.println((Integer)o);
          }
    }
}