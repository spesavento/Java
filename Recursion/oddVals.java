import java.util.ArrayList;

public class oddVals {
    public static ArrayList<Integer> oddVals(ArrayList<Integer> vals) {
        return recurisveOddVals(vals, new ArrayList<Integer>(), 0);
    }
    public static ArrayList<Integer> recurisveOddVals(ArrayList<Integer> orig, ArrayList<Integer> newArr, int index) {

        if(index >= orig.size()) {
            return newArr;
        }
        if(orig.get(index) % 2 != 0) { //if odd
            newArr.add(orig.get(index));
        }
        return recurisveOddVals(orig, newArr, index+1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> myArrayL = new ArrayList<Integer>();
        myArrayL.add(3);
        System.out.println(oddVals(myArrayL));
        ArrayList<Integer> myArrayL2 = new ArrayList<Integer>();
        myArrayL2.add(2);
        myArrayL2.add(4);
        System.out.println(oddVals(myArrayL2));

        ArrayList<Integer> myArrayL3 = new ArrayList<Integer>();
        System.out.println(oddVals(myArrayL3));
    } 
}
