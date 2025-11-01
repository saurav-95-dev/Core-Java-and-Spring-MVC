//CONCEPT OF RECORD CLASSES :
//NOTES:
//Record class is meant to only hold data and for data carrying purpose , mutation is not allowed here.

//using record classes :
//constructor is already implemented inside the record class as well as toString method.
//we don't have default constructor inside the record class.
//all the variable that we receive inside record class are final by default.


record Developers(String name , int id){
      //implicit constructor that we get inside record class:
      public Developers(String name , int id){
          if(id == 0)
              throw new IllegalArgumentException("this is not allowed");
          this.id = id;
          this.name = name;
      }
}

class Hello{
    public static void main(String[] args){
        Developers d1 = new Developers("saurabh" , 1);
        Developers d2 = new Developers("saurabh" , 1);
        System.out.println(d1.equals(d2));
        System.out.println(d1);
    }
}