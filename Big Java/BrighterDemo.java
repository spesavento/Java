/* E2.9 - Write a program BrighterDemo that constructs a Color object with red, green, and blue 
values of 50, 100, and 150. Then apply the brighter method of the Color class and 
print the red, green, and blue values of the resulting color. */
import java.awt.Color;
import javax.swing.JFrame;

public class BrighterDemo {
    public static void main(String[] args) {


        Color colObj = new Color(50, 100, 150);
        System.out.println("Original Color: " + colObj.toString());

        JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setTitle("Original Color");
		frame.getContentPane().setBackground(colObj);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        Color brighterObj = colObj.brighter();
        System.out.println("Brighter Color: " + brighterObj.toString());

        JFrame frame2 = new JFrame();
		frame2.setSize(500, 500);
		frame2.setTitle("Original Color");
		frame2.getContentPane().setBackground(brighterObj);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);

    }
}
