/*
Print from the middle of a list to the end (second node if even)
Print from the beginning of a list to the middle
*/
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
public class MiddleList {
    
    //1 2 3 4 5
    //1 2 3 4 5 6 
    public static Node lastHalf(Node list){
        //have two pointers and one travels twice as fast
        Node p_pointer = list;
        Node half_pointer = list;

        while(p_pointer != null && p_pointer.next != null){
            p_pointer = p_pointer.next.next;
            half_pointer = half_pointer.next;
        }
        return half_pointer;
    }

    public static void printList(Node list){
        Node p_pointer = list;
        while(p_pointer != null){
            System.out.print(p_pointer.data + " ");
            p_pointer = p_pointer.next;
        }
        System.out.println();
    }



    public static void main(String[] args){
        Node list = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5)))));
        System.out.print("List before: ");
        printList(list);
        System.out.print("Last half: ");
        //lastHalf reutrns a Node
        Node half = lastHalf(list);
        printList(half);
        System.out.println();

        Node list2 = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, new Node(6))))));
        System.out.print("List before: ");
        printList(list2);
        System.out.print("Last half: ");
        Node half2 = lastHalf(list2);
        printList(half2);
    }
}
