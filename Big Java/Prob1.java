
import java.awt.Point;

public class Prob1 {

    //for VALUES/VARIABLES (not object references)
    //As the method starts, the parameter variable myZ is set to the same value as z 
    // Then the myZ variable is set to a different value. That modification has no effect on z, 
    //because myZ is a separate variable. When the method terminates, the myZ variable is removed, and z remains unchanged.
    //a Java method can never change the contents of a variable that is passed as an argument––the method manipulates a different variable.

    //The parameter variables a, b contain a copy of the object reference x, y --> 
    //this means you get a reference to the same object!
    public static void foo(Point a, Point b, int myZ) { 
        myZ = 5000;
        a.translate(3, 4); //A Java method can mutate an object when it receives a reference to it as an argument.
        b = new Point(21, 25);  //However, a method cannot replace an object reference that is passed as an argument. so now b points to a new object
       System.out.println(a + " " + b);
       System.out.println(myZ);
    }
    public static void main(String[] args) {
        Point x = new Point(5, 10); 
        Point y = new Point(12, 18);
        x = y;
        int z = 1000;
        foo(x, y, z);
        System.out.println(x + " " + y);
        System.out.println(z);

    }
}
