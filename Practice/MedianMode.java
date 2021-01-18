/* Given an array of integers, find the median and mode. For the mean, keep 3 decimal places. */

import java.util.HashMap;
import java.util.Map;

public class MedianMode {
    private static String findMean(int[] arr){
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        //v1: (double)sum / (double)n;
        //v2:
        //DecimalFormat formatter = new DecimalFormat("#####0.000"); 
        //double d = (double)sum / (double)n; 
        //return formatter.format(d);

        return String.format( "%.3f", (double)sum / (double)n);
    }
    private static int findMode(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        //find the largest 
        int max = Integer.MIN_VALUE;
        int val = Integer.MIN_VALUE;
        for(Map.Entry<Integer, Integer> curr : map.entrySet()){
            if(curr.getValue() > max){
                max = curr.getValue();
                val = curr.getKey();
            }
        }
        return val;
    }
    public static void main(String[] args){
        int[] arr = new int[]{1,1,1,6,6,6}; //3.500
        System.out.println("Mean: " + findMean(arr));
        System.out.println("Mode: " + findMode(arr));
        int[] arr2 = new int[]{5,5,1,5,3,1};
        System.out.println("Mean: " + findMean(arr2)); //3.333 
        System.out.println("Mode: " + findMode(arr2));
        int[] arr3 = new int[]{1,0};
        System.out.println("Mean: " + findMean(arr3)); //0.500
        System.out.println("Mode: " + findMode(arr3));
        int[] arr4 = new int[]{50,80,900,140,555};
        System.out.println("Mean: " + findMean(arr4)); //345.000
        System.out.println("Mode: " + findMode(arr4));
    }
}
