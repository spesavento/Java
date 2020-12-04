//implement an algorithm to delete a node in the middle of a list 
//(not first or last node), given only that node
class Node{
    int data;
    Node next;
    Node(int var){
        data = var;
        next = null;
    }
    Node(int var, Node point){
        data = var;
        next = point;
    }
}

public class DeleteMiddleList {
    
    public static void deleteMiddle(Node mid){
        if(mid == null || mid.next == null){
            return;
        }
        //change mid to be the next element
        mid.data = mid.next.data;
        mid.next = mid.next.next; //skip over next element
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
        Node node1 = new Node(3);
        Node node2 = new Node(5);
        Node node3 = new Node(6);
        Node node4 = new Node(8);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        deleteMiddle(node3);
        printList(node1);

        Node node1_1 = new Node(3);
        Node node2_1 = new Node(5);
        Node node3_1 = new Node(6);
        Node node4_1 = new Node(8);
        node1_1.next = node2_1;
        node2_1.next = node3_1;
        node3_1.next = node4_1;
        deleteMiddle(node2_1);
        printList(node1_1);
    }
}
