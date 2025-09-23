//throws : --> used where there  is ducking of exceptions:

class A {
   public void show() throws ClassNotFoundException{
       System.out.println("in a show ");

           Class.forName("Demo");

   }
}

class Hello{

    public static void main(String [] args){
         A a  = new A();
         try{
             a.show();
         }
         catch(ClassNotFoundException e){
             System.out.println("Ooops , ....class not found !");
         }

    }
}