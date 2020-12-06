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
public class OddEvenLinkedList {
    
    public static Node evenOddList(Node list){
        if(list == null){
            return null;
        }
        Node odd_pointer = list;
        Node even_pointer = list.next;
        Node even_head = even_pointer;
        //1 2 3 4 5

        while(even_pointer != null && even_pointer.next != null){
            odd_pointer.next = even_pointer.next; //change the pointer for odd so that it is pointing to next
            odd_pointer = odd_pointer.next; //move to next odd node

            even_pointer.next = odd_pointer.next;
            even_pointer = even_pointer.next;
        }
        //now we have an odd list and an even list
        //1 3 5 and 2 4   we want to connect 5 (odd_pointer) to 2   <- go back and include head_pointer for even
        odd_pointer.next = even_head;

        return list;
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
        Node list1 = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5)))));
        evenOddList(list1);
        printList(list1);
        Node list2 = new Node(2, new Node(1, new Node(3, new Node(5, new Node(6, new Node(4, new Node(7)))))));

    }
}
