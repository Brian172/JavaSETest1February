public class Q3 {
    public static void main(String[] args) {
        int nums[] = {23, 24, 12, 78, 62};

        int largestNum = 23;

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] > largestNum)
            {
                largestNum = nums[i];
            }
        }
        System.out.println("The largest number is " + largestNum);
    }
}
