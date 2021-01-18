
import java.util.Stack;

public class p3 {
    public static void stackProb() {
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		for (int i = 2; i <= 4; i++) {
		int val = s.peek();
		s.push(i * 2);
		s.push(val + 1);
		System.out.print(s.pop() + " ");
		}
		System.out.println();
		System.out.println(s.toString());
		// *
	   }

	   public static void main(String[] args) {
		   stackProb();
	   }
}
