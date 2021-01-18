
public class q8 {
    // min: Computes the minimum value in an array, nums
    // PRE: nums.length >= 1
    public static int min(int[] nums) {
        return minR(nums, 0);
    }
   // minR (recursive helper function for min)
   // Computes the minimum value of the elements in num in positions start
   // through nums.length-1
   // PRE: nums.length >= 1
   private static int minR(int[] nums, int start) {
    
        if (start == nums.length - 1) {
        return nums[start];
        }
   
        int minRest = minR(nums, start + 1);
   
        //before: if (nums[start] < nums[start + 1]) {
        if (nums[start] < minRest) {
            return nums[start];
        }
        else {
            return minRest;
        }
   }
   public static void main(String[] args){
       int[] nums = {3, 4, 5, 2};
       System.out.println(min(nums));
       int[] nums2 = {4, 2, 3, 1};
       System.out.println(min(nums2));
       int[] nums3 = {4};
       System.out.println(min(nums3));
   }
}
