import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Polygon;
import java.util.Random;

public class RandomTriangles extends Canvas{
    public void paint( Graphics g )
    {
        int x, y, z, color;
        for(int i=1;i<=1000;i++) {
            Polygon tri = new Polygon();
            Random r = new Random();

            x = 1 + r.nextInt(1024);
            y = 1 + r.nextInt(768);
            tri.addPoint(x, y);
            x = 1 + r.nextInt(1024);
            y = 1 + r.nextInt(768);
            tri.addPoint(x, y);
            x = 1 + r.nextInt(1024);
            y = 1 + r.nextInt(768);
            tri.addPoint(x, y);
            color = 1 + r.nextInt(13);

            switch (color){
                case 1: g.setColor(Color.blue);break;
                case 2: g.setColor(Color.pink);break;
                case 3: g.setColor(Color.yellow);break;
                case 4: g.setColor(Color.green);break;
                case 5: g.setColor(Color.black);break;
                case 6: g.setColor(Color.red);break;
                case 7: g.setColor(Color.white);break;
                case 8: g.setColor(Color.orange);break;
                case 9: g.setColor(Color.gray);break;
                case 10: g.setColor(Color.cyan);break;
                case 11: g.setColor(Color.magenta);
                case 12: g.setColor(Color.darkGray);
                case 13: g.setColor(Color.lightGray);
            }
            g.fillPolygon(tri);
        }
    }



    public static void main(String[] args)
    {
        JFrame win = new JFrame("Random Triangles");
        win.setSize(1024,768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add( new RandomTriangles() );
        win.setVisible(true);
    }

}
