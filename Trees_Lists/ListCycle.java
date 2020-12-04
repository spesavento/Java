//determine if a list has a cycle in it
//a cycle is where any node links back to another node in the list

//
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
public class ListCycle {
    
    public static boolean hasCycle(Node list){
        //no cycles
        if(list == null){
            return false;
        }
        // 3
        // f
        // s
        //  3 2 0 -4
        //    f     
        //    s
        Node p_fast = list.next;
        Node p_slow = list;
        //
        while(p_fast != p_slow){
            //if the fast one reaches the end, no cycles
            if(p_fast == null || p_fast.next == null){
                return false;
            }
            p_slow = p_slow.next;
            p_fast = p_fast.next.next;

        }
        return true;
    }

    public static void main(String[] args){
        Node list = new Node(3);
        Node loop = new Node(2);
        list.next = loop;
        loop.next = new Node(0);
        loop.next.next = new Node(-4);
        loop.next.next.next = loop;
        System.out.println("Has cycle?");
        System.out.println(hasCycle(list));

        Node list2 = new Node(1);
        list2.next = new Node(2);
        list2.next.next = list2;
        System.out.println("Has cycle?");
        System.out.println(hasCycle(list2));

        Node list3 = new Node(1, new Node(5));
        System.out.println("Has cycle?");
        System.out.println(hasCycle(list3));
    }
}
