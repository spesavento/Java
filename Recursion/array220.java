//CodingBat: Given an array of ints, compute recursively if the array 
//contains somewhere a value followed in the array by that value times 10.
public class array220 {
    public boolean array220(int[] nums, int index) {
  
        //if at the end or empty, return false
        if(nums.length - 1 <= index) {
          return false;
        }
        //if it's divisble by 10, return true 
        if(nums[index] * 10 == nums[index+1]) {
          return true;
        }
        //increment
        return array220(nums, index + 1);
      }
      
}
