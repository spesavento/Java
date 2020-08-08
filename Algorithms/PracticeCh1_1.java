package Algorithms;

public class PracticeCh1_1 {
    
    public static void main(String[] args) {
        //pre-increment vs. post-increment
        int i = 1;
        int j = 1;
        int k = i++;
        System.out.println(k); //1, k gets the current value of i, then after that i is incremented by 1
        System.out.println(i); //2
        int l = ++j;
        System.out.println(l); //2, j is incremented first and then returned 
        System.out.println(j); //2

        //find the maximum in an array of values

    }

}