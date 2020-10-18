public class isUpDown {
    public static boolean isUpDown(int[] a) {
        return recursivePeak(a, 0, a.length-1, 1);
    }

    public static boolean recursivePeak(int[] a, int start, int end, int target) {
        if(start >= end) {
            
            //if the target are equal or start > end
            if((a[start] == target && a[end] == target) || start > end) {
                return true;
            } else {
                return false;
            }
        } else if(a[start] == target && a[end] == target) {
            return recursivePeak(a, start+1, end-1, target+1);
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        int[] myArray = new int[5];
        myArray[0] = 1; 
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 2;
        myArray[4] = 1;  
        System.out.println(isUpDown(myArray));

        int[] myArray2 = new int[4];
        myArray2[0] = 1; 
        myArray2[1] = 2;
        myArray2[2] = 2;
        myArray2[3] = 1;
        System.out.println(isUpDown(myArray2));

        int[] myArray3 = new int[2];
        myArray3[0] = 1;
        myArray3[1] = 1;
        System.out.println(isUpDown(myArray3));

        int[] myArray4 = new int[2];
        myArray4[0] = 2;
        myArray4[1] = 2;
        System.out.println(isUpDown(myArray4));

        int[] myArray5 = new int[4];
        myArray5[0] = 1; 
        myArray5[1] = 2;
        myArray5[2] = 3;
        myArray5[3] = 2;
        System.out.println(isUpDown(myArray5));
    }
    
}
