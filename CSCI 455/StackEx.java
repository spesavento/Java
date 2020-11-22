import java.util.Stack;

public class StackEx {
    public static void stackProb() {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        for (int i = 2; i <= 5; i++) {
        int val = s.peek();
        s.push(i);
        s.push(val * 2);
        System.out.print(s.pop() + " ");
        }
        System.out.println();
        // *
        System.out.println("The stack: " + s.toString());
       }
       public static void main(String[] args){
           stackProb();
       }
}
