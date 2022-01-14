import java.awt.*;
import javax.swing.JFrame;

public class Graphics1 extends Canvas {

        public void paint( Graphics g )
        {
            g.setColor(Color.CYAN);
            g.drawRect(100,100,400,400);  // draw a rectangle
            g.setColor(Color.GRAY);
            g.fillOval(200,200,200,200); // draw a filled-in oval
            g.setColor(Color.RED);
            g.fillRect(225,225,150,150); // a filled-in rectangle
            g.drawOval(50,50,100,100);
            g.drawOval(50,450,100,100);
            g.drawOval(450,450,100,100);
            g.drawOval(450,50,100,100);

            g.setColor(Color.black);
            g.drawString("Graphics are pretty neat.", 235, 300);
            int x = getWidth() / 3;
            int y = getHeight() / 2;
            g.drawString("(" + x + "," + y + ")", x, y);
        }

        public static void main( String[] args )
        {
            // You can change the title or size here if you want.
            JFrame win = new JFrame("Graphics1");
            win.setSize(700,700);
            win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Graphics1 canvas = new Graphics1();
            win.add( canvas );
            win.setVisible(true);
        }
}
