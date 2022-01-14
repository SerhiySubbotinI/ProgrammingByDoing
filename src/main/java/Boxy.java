import java.awt.*;
import javax.swing.JFrame;
import java.util.Random;

public class Boxy extends Canvas
{
    public void paint( Graphics window )
    {
        for(int i=1;i<=11;i++){
            int width = 100;
            int width2 = 80;
            int height = 100;
            int height2 = 80;
            Random r = new Random();
            int color = 1 + r.nextInt(13);
            int x = 1 + r.nextInt(600);
            int y = 1 + r.nextInt(400);
            switch (color){
                case 1: window.setColor(Color.blue);break;
                case 2: window.setColor(Color.pink);break;
                case 3: window.setColor(Color.yellow);break;
                case 4: window.setColor(Color.green);break;
                case 5: window.setColor(Color.black);break;
                case 6: window.setColor(Color.red);break;
                case 7: window.setColor(Color.white);
                case 8: window.setColor(Color.orange);break;
                case 9: window.setColor(Color.gray);break;
                case 10: window.setColor(Color.cyan);break;
                case 11: window.setColor(Color.magenta);break;
                case 12: window.setColor(Color.darkGray);break;
                case 13: window.setColor(Color.lightGray);break;
            }
            window.fillRect(x,y,width,height);
            window.setColor(Color.WHITE);
            window.fillRect(x+10,y+10,width2,height2);
        }
    }

    public static void main( String[] args )
    {
        Canvas canvas = new Boxy();
        JFrame win = new JFrame("Boxy");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvas.setBackground(Color.WHITE);
        win.add( canvas );
        win.setVisible(true);
    }
}
