//CONCEPT OF RECORD CLASSES :
//NOTES:
//Record class is meant to only hold data and for data carrying purpose , mutation is not allowed here.

//General procedure :
class Developers{

    private final String name;
    private final int id;

    //constructor to assign the values:
    Developers(String name , int id){
        this.name = name;
        this.id = id;
    }

    //getters for both the variables:
    String getName(){
        return name;
    }
    int getId(){
        return id;
    }
}

class Hello{
    public static void main(String[] args){
        Developers d1 = new Developers("saurabh" , 1);
        System.out.println(d1);
    }
}