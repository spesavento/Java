import java.util.LinkedList;

public class decrSquaresOdd {
    public static LinkedList<Integer> decrSquaresOdd(int n) {
        LinkedList<Integer> myList = new LinkedList<Integer>();
        return recDecrSquaresOdd(n, myList, 1);
    }
    public static LinkedList<Integer> recDecrSquaresOdd(int n, LinkedList<Integer> list, int index) {
        if(index > n) {
            return list;
        }
        //if index is odd
        if(index % 2 != 0) {
            list.addFirst(index*index); 
        } 
        return recDecrSquaresOdd(n, list, index+1);
    }

    public static void main(String[] args) {
        System.out.println(decrSquaresOdd(1));
        System.out.println(decrSquaresOdd(2));
        System.out.println(decrSquaresOdd(3));
        System.out.println(decrSquaresOdd(4));
        System.out.println(decrSquaresOdd(7));
    }
}
