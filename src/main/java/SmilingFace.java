import java.awt.*;
import javax.swing.JFrame;

public class SmilingFace extends Canvas
{
    public void paint( Graphics g )
    {   int x=25,y=50;
        for(int i=1;i<=6;i++) {
            drawSmilingFace(g, x, y);
            x+=320;
            if(i%3==0){x=25;y=380;}
        }
    }

    public void drawSmilingFace( Graphics g, int x, int y )
    {
        // draw circle for the head
        g.setColor(Color.yellow);
        g.fillOval(x,y,300,300);
        // draw eyes
        g.setColor(Color.blue);
        g.fillOval(x+75,y+75,50,50);
        g.fillOval(x+175,y+75,50,50);
        // draw mouth
        g.setColor(Color.red);
        g.drawArc(x+100,y+200,100,50,200,140);
    }

    public static void main(String[] args)
    {
        JFrame win = new JFrame("Smiling Face");
        win.setSize(1024,768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add( new SmilingFace() );
        win.setVisible(true);
    }


}