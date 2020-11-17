import java.awt.Rectangle;

public class AreaTester{
    public static void main(String[] args) {
        //create a new Rectangle object
        Rectangle box = new Rectangle(5,10,10,10);
        //get the width and height
        double boxWidth = box.getWidth();
        double boxHeight = box.getHeight();
        //calculate the area
        double boxArea = boxWidth * boxHeight;
        //print expected and actual area
        System.out.println("The expected area is 100.0");
        System.out.println("The actual area is " + boxArea);
    }
}