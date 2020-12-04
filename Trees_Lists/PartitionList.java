/*
Parition a list so that values less than x come become those greater or equal to x
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

public class PartitionList {
    //chan we modify the original list?
    //3 5 8 5 10 
    public static Node partitionList(Node list, int x){
        //create new lists to store (before, after)
        Node beforeStart = null;
        Node beforeEnd = null;
        Node afterStart = null;
        Node afterEnd = null;

        while(list != null){
            //our current node
            Node nextNode = list.next; //store 5
            list.next = null; //3 
            if(list.data < x){
                //insert into end of the before list
                //if first node
                if(beforeStart == null){
                    beforeStart = list; // 3 null
                    beforeEnd = beforeStart;  
                } else {
                    //3 
                    beforeEnd.next = list;
                    beforeEnd = list;
                       //3  list is 5
                }
                //insert into end of the after list
            } else {
                if(afterStart == null){
                    afterStart = list; // 3 null
                    afterEnd = afterStart;  
                } else {
                    afterEnd.next = list;
                    afterEnd = list;
                }
            }
            list = nextNode;
        }
        //now connect
        beforeEnd.next = afterStart;
        return beforeStart;
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
        Node list = new Node(3, new Node(5, new Node(8, new Node(5, new Node(10, new Node(2, new Node(1)))))));
        printList(list);
        Node partitioned = partitionList(list, 5);
        printList(partitioned);
    }
}
