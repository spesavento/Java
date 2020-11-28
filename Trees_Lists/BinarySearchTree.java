class Node {
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
        left = right = null;
    }
    public Node() {}
}

public class BinarySearchTree {
    private Node root;
    private int[] binaryArr;

    //constructor takes an array and using it, creates a binary search tree from the root
    public BinarySearchTree(int[] arr){
        binaryArr = arr;
        root = createBST(binaryArr, 0, arr.length-1);
        
        BTreePrinter printer = new BTreePrinter();
        printer.printNode(root);
    }

    public Node createBST(int[] arr, int low, int high){
        // 1 3 5 6 7 9
        if(low > high){
            return null; //right and left for leaf node is null
        }
        int mid = (low + high) / 2;
        Node curr = new Node(arr[mid]);

        curr.left = createBST(arr, low, mid-1);
        curr.right = createBST(arr, mid+1, high);
        return curr;
    }

    public static void printBST(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        printBST(root.left);
        printBST(root.right);
    }
}