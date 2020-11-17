import java.awt.Rectangle;

public class PerimeterTester {
    public static void main(String[] args) {
        //create a new Rectangle object
        Rectangle myBox = new Rectangle(5,10,10,30);
        //get the width and height
        double myBoxWidth = myBox.getWidth();
        double myBoxHeight = myBox.getHeight();
        //calculate the perimeter
        double myBoxPerimeter = 2 * myBoxWidth + 2 * myBoxHeight;
        //print the actual and expected perimeter
        System.out.println("The expected perimeter is 80.0");
        System.out.println("The actual perimeter is " + myBoxPerimeter);
    }
}