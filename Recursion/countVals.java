public class countVals {

    public static int countNumVals(int[] nums, int val) {
        return countNumValsR(nums, val, 0);
    }

    public static int countNumValsR(int[] nums, int val, int start) {
        if(start >= nums.length){
            return 0;
        }
        //if the current value is the target val, add 1, otherwise keep searching
        if(nums[start] == val){
            return 1 + countNumValsR(nums, val, start+1);
        } else {
            return countNumValsR(nums, val, start+1);
        }
    }
    public static void main(String[] args){
        int[] test1 = {4, 5, 3};
        System.out.println("Excepted: 1");
        System.out.println("Actual: " + countNumVals(test1, 5));

        int[] test2 = {-4, 3, -10, 3};
        System.out.println("Excepted: 2");
        System.out.println("Actual: " + countNumVals(test2, 3));

        int[] test3 = {2};
        System.out.println("Excepted: 0");
        System.out.println("Actual: " + countNumVals(test3, 3));

        int[] test4 = {};
        System.out.println("Excepted: 0");
        System.out.println("Actual: " + countNumVals(test4, 5));

        int[] test5 = {5, 5, 5, 5};
        System.out.println("Excepted: 4");
        System.out.println("Actual: " + countNumVals(test5, 5));
    }
}
