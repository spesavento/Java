import java.util.LinkedList;
import java.util.ArrayList;

public class copy {
    public static LinkedList<Integer> copy(ArrayList<Integer> orig) {
        LinkedList<Integer> myList = new LinkedList<Integer>();
        return copyR(orig, 0, myList);
    }

    public static LinkedList<Integer> copyR(ArrayList<Integer> orig, int start, LinkedList<Integer> myList) {
        //if the size of the ArrayList is 0 or the start >= the size
        //return the list
        if(orig.size() == 0 || start >= orig.size()) {
            return myList;
        } else {
            //if bigger, add the element at start into the LinkedList INCLUDE IN RETURN
            myList.addLast(orig.get(start));
            return copyR(orig, start + 1, myList);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(4);
        myList.add(5);
        System.out.println(copy(myList));
    }
}
