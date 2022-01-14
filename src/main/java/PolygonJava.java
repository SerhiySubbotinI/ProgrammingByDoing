import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Polygon;

public class PolygonJava extends Canvas
{
    public void paint( Graphics g )
    {
//                // labels
//        g.setColor(Color.black);
//        g.setFont(new Font(null));
//        for ( int X=0; X<1600; X += 50 )
//            g.drawString( String.valueOf(X), X, 50 );
//        for ( int Y=100; Y<850; Y += 50 )
//            g.drawString( String.valueOf(Y), 28, Y );
//        // lines
//        g.setColor(Color.lightGray);
//        for ( int X=0; X<1600; X += 50 )
//            g.drawLine(X,0,X,850);    // horizontal
//        for ( int Y=0; Y<850; Y += 50 )
//            g.drawLine(0,Y,1599,Y);    // vertical

        g.setColor(Color.black);
        g.drawString("TRIANGLE", 50, 50);

        Polygon tri = new Polygon();
        tri.addPoint(100, 100);
        tri.addPoint(100, 300);
        tri.addPoint(200, 300);
        g.setColor(Color.blue);
        g.fillPolygon(tri);

        Polygon pent = new Polygon();
        pent.addPoint(450, 200);
        pent.addPoint(500, 250);
        pent.addPoint(475, 350);
        pent.addPoint(425, 350);
        pent.addPoint(400, 250);
        g.setColor(Color.green);
        g.fillPolygon(pent);

        Polygon trapezoid = new Polygon();
        trapezoid.addPoint(500, 650);
        trapezoid.addPoint(600, 450);
        trapezoid.addPoint(850, 450);
        trapezoid.addPoint(950, 650);
        g.setColor(Color.yellow);
        g.fillPolygon(trapezoid);

        Polygon triangle = new Polygon();
        triangle.addPoint(650, 400);
        triangle.addPoint(750, 200);
        triangle.addPoint(800, 380);
        g.setColor(Color.pink);
        g.fillPolygon(triangle);

        Polygon hex = new Polygon();
        // use trig to make a regular hexagon
        int radius = 100; // pixels
        int xCenter = 200;
        int yCenter = 500;
        for ( double ang = 0; ang<2*Math.PI; ang=ang+(2*Math.PI)/6.0)
        {
            double xDelta = radius * Math.cos(ang);
            double yDelta = -radius * Math.sin(ang);
            hex.addPoint(xCenter+(int)xDelta, yCenter+(int)yDelta);
        }
        g.setColor(Color.black);
        g.fillPolygon(hex);
    }

    public static void main(String[] args)
    {
        JFrame win = new JFrame("Polygon");
        win.setSize(1024,768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add( new PolygonJava() );
        win.setVisible(true);
    }

}
