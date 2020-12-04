//implement an algorithm to find the kth to last element of a singly linked list
//can we assume they give a k that is in range for the list?
//can the list be any size?
//does k start from 0 or 1?

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

public class KthToLast {

    //this solution is not optimal!
    public static int kthToLastElement1(Node list, int k){
        //find the middle of the list
        Node fast_pointer = list.next;
        Node slow_pointer = list;
        int index = 1;
        int length = 0;

        while(fast_pointer != null && fast_pointer.next != null){
            fast_pointer = fast_pointer.next.next;
            slow_pointer = slow_pointer.next;
            index++;
        } 
        //find the length of the list
        //if even, then length = index*2
        if(index % 2 == 0){
            length = index * 2;
        } else {
            length = (index * 2) - 1;
        }
        
        //keep moving slow_pointer to end x number of time
        //we want to stop when the index is (length - k) + 1
        Node find_index = list;
        index = 1; //reset index
        while(find_index != null && index != ((length - k) + 1)){
            index++;
            find_index = find_index.next;
        }
        return find_index.data;
    }

    //1 2 3 4  length 4 move k 3 move other 1  (k is null)
    //1 2 3 4 5 //length is 5 move k 3  move other and k is null 
    //if you move a pointer k spaces, then make another and move 
    // both forward until first is null, then second with be k from end
    public static int kthToLastElement2(Node list, int k){
        Node fast_pointer = list;
        Node slow_pointer = list;

        for(int i = 0; i < k; i++){
            fast_pointer = fast_pointer.next;
        }
        
        while(fast_pointer != null){
            fast_pointer = fast_pointer.next;
            slow_pointer = slow_pointer.next;
        }
        return slow_pointer.data;
    }

    //recursively implement 

    public static void main(String[] args){
        //long solution test
        Node list = new Node(1, new Node(2, new Node(3, new Node(4))));
        int element = kthToLastElement1(list, 2);
        System.out.println(element); //3

        Node list2 = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5)))));
        int element2 = kthToLastElement1(list2, 2);
        System.out.println(element2); //4

        Node list3 = new Node(1, new Node(2, new Node(3, new Node(4))));
        int element3 = kthToLastElement1(list3, 4);
        System.out.println(element3); //1

        Node list4 = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5)))));
        int element4 = kthToLastElement1(list4, 4);
        System.out.println(element4); //2

        //iterator solution test
        Node listi = new Node(1, new Node(2, new Node(3, new Node(4))));
        int elementi = kthToLastElement2(listi, 2);
        System.out.println(elementi); //3

        Node listi2 = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5)))));
        int elementi2 = kthToLastElement2(listi2, 2);
        System.out.println(elementi2); //4

        Node listi3 = new Node(1, new Node(2, new Node(3, new Node(4))));
        int elementi3 = kthToLastElement2(listi3, 4);
        System.out.println(elementi3); //1

        Node listi4 = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5)))));
        int elementi4 = kthToLastElement2(listi4, 4);
        System.out.println(elementi4); //2

    }
}
