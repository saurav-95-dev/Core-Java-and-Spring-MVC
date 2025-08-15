//Mutable Strings in java:
//StringBuffer and StringBuilder.
//StringBuffer is Thread saved and StringBuilder is not.

public static void main(String[] args){
    StringBuilder sb1 = new StringBuilder("Saurabh");
    sb1.append(" Dev,");
    sb1.insert(12, "How r u doing..!");
    System.out.println(sb1);

}

