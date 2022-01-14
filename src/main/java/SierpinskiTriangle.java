import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Polygon;
import java.util.Random;

public class SierpinskiTriangle extends Canvas{
    public void paint( Graphics g )
    {
        int x1 = 512;
        int y1 = 109;
        int x2 = 146;
        int y2 = 654;
        int x3 = 876;
        int y3 = 654;
        int x = 512;
        int y = 382;
        for(int i=1;i<=50000;i++) {
            int dx = 0, dy=0;
            g.drawLine(x,y,x,y);
            Random r = new Random();
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int randNumber = 1 + r.nextInt(3);
            switch (randNumber){
                case 1: dx = x-x1; dy = y-y1;break;
                case 2 :dx = x-x2; dy = y-y2;break;
                case 3 :dx = x-x3; dy = y-y3;break;
            }
            x = x - dx / 2;
            y = y - dy / 2;

            g.setColor(Color.black);
            g.drawString("Sierpinski Triangle", 462, 484);
        }
    }

    public static void main(String[] args)
    {
        JFrame win = new JFrame("Sierpinski Triangle");
        win.setSize(1024,768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add( new SierpinskiTriangle() );
        win.setVisible(true);
    }

}

