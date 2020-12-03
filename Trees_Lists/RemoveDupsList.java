/*
remove duplicates from a linked list
Long method: loop through twice  
Shorter: Use a hashset
Q's
Does the linked list hold integer values?
*/
import java.util.HashSet;

//Create the Node class for a singly linked list
class Node{
    int data;
    Node next;
    Node(int val){
        data = val;
        next = null;
    }
    Node(int val, Node point){
        data = val;
        next = point;
    }
}
public class RemoveDupsList {
    
    public static void removeDups(Node list){
        HashSet<Integer> dups = new HashSet<Integer>();
        //pointers
        Node p_pointer = list;
        Node lag_pointer = list;

        // 1    1    2    2    2 
        //          lag   x    p
        while(p_pointer != null){
            //add data to the set
            //if already in set, delete Node in list
            if(!dups.add(p_pointer.data)){
                lag_pointer.next = p_pointer.next;
                p_pointer = p_pointer.next;
            } else {
                //else keep iterating
                lag_pointer = p_pointer;
                p_pointer = p_pointer.next;
            }
        }
    }

    public static void printList(Node list){
        Node pointer = list;
        while(pointer != null){
            System.out.print(pointer.data + " ");
            pointer = pointer.next;
        }
        System.out.println();
    }

    //create linked lists for testing 
    public static void main(String[] args){

        Node list = new Node(1, new Node(1, new Node(2, new Node(2, new Node(2)))));
        System.out.print("List before remove: ");
        printList(list);
        removeDups(list);
        System.out.print("List after remove: ");
        printList(list);
        System.out.println();
        Node list2 = new Node(1, new Node(1, new Node(1, new Node(2, new Node(3, new Node(2))))));
        System.out.print("List before remove: ");
        printList(list2);
        removeDups(list2);
        System.out.print("List after remove: ");
        printList(list2);
    }
}
