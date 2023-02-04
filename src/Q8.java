public class Q8 {
    public static void main(String[] args) {
        int nums[][] = {{1, 2, 3, 4, 5},
                        {5, 4, 3, 2, 1},
                        {7, 8, 9, 1, 5, 7, 7}};

        for (int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums[i].length; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
