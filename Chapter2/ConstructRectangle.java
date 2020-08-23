import java.awt.Rectangle;
/* 
Write a program that constructs a rectangle with area 42 and a rectangle with 
perimeter 42. Print the widths and heights of both rectangles.
*/

public class ConstructRectangle {
    public static void main(String[] args) {
        //constuct a rectangle with an area of 42
        Rectangle rectangleArea42 = new Rectangle(5, 5, 6, 7);
        //constuct a rectangle with a perimeter of 42
        Rectangle rectanglePeri42 = new Rectangle(5, 5, 2, 19);
        System.out.println("For the rectangle with an area 42, the width is " + rectangleArea42.getWidth() + " and the height is " + rectangleArea42.getHeight() + ".");
        System.out.println("For the rectangle with a perimeter of 42, the width is " + rectanglePeri42.getWidth() + " and the height is " + rectanglePeri42.getHeight() + ".");
    }
}