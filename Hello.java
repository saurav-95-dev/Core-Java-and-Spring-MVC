public class Hello {
    public static void main(String[] args) {
        //Jagged arrays : 
        int nums[][] = new int[3][];

nums[0] = new int[4]; // Row 0 has 4 columns
nums[1] = new int[2]; // Row 1 has 2 columns
nums[2] = new int[1]; // Row 2 has 1 column

        nums[0][0] = 1;
        nums[0][1] = 2;
        nums[0][2] = 3;
        nums[0][3] = 4;
        nums[1][0] = 5;
        nums[1][1] = 6;
        nums[2][0] = 9;

        for (int i = 0; i < nums.length; i++) {
          for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
          System.out.println();    
        }
    
       
    }
}