public class Hello {
    public static void main(String[] args) {
        //Multidimensional array
        int nums[][] = new int[3][4];

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " c");
            }

            System.out.println();
            
        }
    
       
    }
}