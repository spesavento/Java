public class numDouble {
    public static int numDouble(int[] nums) {
        return findDoubles(nums, 0);
    }
    public static int findDoubles(int[] nums, int start) {
        //if empty or the iterator reached the end, return 0
        if(nums.length == 0 || start >= nums.length) {
            return 0;
            //if current is a double add 1 + findDoubles 
        } else if (nums[start]%10 == ((nums[start]/10) % 10)) {
            //check if current 
            return 1 + findDoubles(nums, start+1);
        } else {
            return findDoubles(nums, start+1);
        }
     }

     public static void main(String[] args) {
         int[] myArray = new int[4];
         myArray[0] = 3;
         myArray[1] = 88;
         myArray[2] = 32;
         myArray[3] = 3;

         System.out.println(numDouble(myArray));
     }
}
