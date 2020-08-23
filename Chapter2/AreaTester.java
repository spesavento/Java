import java.awt.Rectangle;

public class AreaTester{
    public static void main(String[] args) {
        Rectangle box = new Rectangle(5,10,10,10);
        double boxWidth = box.getWidth();
        double boxHeight = box.getHeight();
        double boxArea = boxWidth * boxHeight;
        System.out.println("The expected area is 100.0");
        System.out.println("The actual area is " + boxArea);

    }
}