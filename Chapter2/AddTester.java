import java.awt.Rectangle;

public class AddTester {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(5, 10, 20, 30);
        //the box was at (5,10) spanning 20 width and 30 length
        box.add(0, 0);
        //now the box is at (0, 0), the so 5 more to the width and 10 to the length

        //print expected and actual location, width, and height of the box
        System.out.println("The expected coordinates of the box are x = 0 and y = 0");
        System.out.println("The actual coordinates of the box are x = " + box.getX() + " and y = " + box.getY());
        System.out.println();
        System.out.println("The expected coordinates of the box are x = 40 and y = 25");
        System.out.println("The actual height of the box is " + box.getHeight() + " and width is " + box.getWidth());

    }
}