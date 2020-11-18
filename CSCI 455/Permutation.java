import java.util.Set;
import java.util.HashSet;

public class Permutation {
    
    //determine if a is a permutation of b. Assume no duplicate values, and you may use no additional arrays.
    //a and b are not changed by this method
    public static boolean isPermutation(int[] a, int[] b){
        if(a.length != b.length){
            return false;
        }
        if(a.length < 1){
            return true;
        }

        Set<Integer> nums = new HashSet<Integer>();
        for(Integer num : a){
            nums.add(num);
        }
        for(Integer num : b) {
            if(nums.add(num)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int[] a = {1,2};
        int[] b = {3,2,1};
        System.out.println(isPermutation(a, b));

        int[] a1 = {1,2};
        int[] b1 = {2,1};
        System.out.println(isPermutation(a1, b1));

        int[] a2 = {1,3,5};
        int[] b2 = {4,2};
        System.out.println(isPermutation(a2, b2));

        int[] a3 = {1,3,5};
        int[] b3 = {3,2,1};
        System.out.println(isPermutation(a3, b3));

        int[] a4 = {};
        int[] b4 = {};
        System.out.println(isPermutation(a4, b4));
        
        int[] a5 = {3};
        int[] b5 = {3};
        System.out.println(isPermutation(a5, b5));

        int[] a6 = {2,5,4,7};
        int[] b6 = {7,5,2,4};
        System.out.println(isPermutation(a6, b6));

    }
}
