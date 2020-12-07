import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;
    //if you have more than two Nodes (not binary) - you could have an ArrayList of Nodes called children
    //then when you want to do a recursive call on all children of the current Node, 
    //loop through arraylist and for each child do a recursive call
    public Node(int data){
        this.data = data;
        left = right = null;
    }
}
public class TreeOrderTraversal {
    //this class deals with creating a binary tree. It's private data is the root NODE
    private Node root;

    //create a tree 
    //        5
    //       / \
    //      2   3
    //     /
    //    4

    //first you need the constructors - initialize the root to a Node or to null
    public TreeOrderTraversal(){
        root = null;
    }
    public TreeOrderTraversal(int data){
        root = new Node(data);
    }

    public static ArrayList<LinkedList<Integer>> linkedListLevels(Node root){
        //create empty arraylist of LinkedLists
        ArrayList<LinkedList<Integer>> treeLevels = new ArrayList<LinkedList<Integer>>();
        linkedListLevelsR(root, treeLevels, 0);
        return treeLevels;
    }
    public static void linkedListLevelsR(Node root, ArrayList<LinkedList<Integer>> treeLevels, int level){
        if(root == null){
            return; 
        }
        //create new linked list OR add to current linked list at given index
        if(treeLevels.size() <= level) {
            //new linked list
            LinkedList<Integer> nodeList = new LinkedList<Integer>();
            nodeList.add(root.data);
            treeLevels.add(level, nodeList);
        } else {
            //if already linkedlist at given index
            treeLevels.get(level).add(root.data);
        }
        
        linkedListLevelsR(root.left, treeLevels, level + 1);
        linkedListLevelsR(root.right, treeLevels, level + 1);
    }

    //method 2: a queue (linked list) of arraylists
    public static ArrayList<ArrayList<Integer>> levelQueue(Node root){

        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        if(root == null){
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        //add the root node
        queue.add(root);
        while(!queue.isEmpty()){
            //add to level array
            ArrayList<Integer> levelArray = new ArrayList<Integer>();
            //for each of these nodes in the queue, add them to an array for the curr level
            for(int i = 0; i < queue.size(); i++){
                Node curr = queue.remove();
                levelArray.add(curr.data);
                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }
            }
            result.add(levelArray);
        }
        return result;
    }
    public static void main(String[] args){
        //create a tree object
        TreeOrderTraversal tree = new TreeOrderTraversal(5);
        tree.root.right = new Node(3);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(4);

        ArrayList<LinkedList<Integer>> test = linkedListLevels(tree.root);
        for(int i = 0; i < test.size(); i++){
            System.out.println(test.get(i).toString());
        }
        ArrayList<ArrayList<Integer>> test2 = levelQueue(tree.root);
        for(int i = 0; i < test2.size(); i++){
            System.out.println(test2.get(i).toString());
        }

    }
}
