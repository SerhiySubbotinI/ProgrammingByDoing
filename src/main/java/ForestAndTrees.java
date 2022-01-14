import java.awt.*;
import java.util.Random;
import javax.swing.JFrame;

public class ForestAndTrees extends Canvas
{
    public void paint( Graphics g )
    {
        // demonstrates the forest's boundary
        g.drawRect(5,5,1000,700);

        // draws a few single trees for testing
        drawTree(g,30,550);
        drawTree(g,100,580);
        drawTree(g,640,300);
        drawTree(g,730,370);

        // draws the first forest
        g.drawRect(10,10,500,500);
        g.drawRect(11,11,498,498);
        // draws a tree in the first forest
        drawForest(g,10,10,500,500);

        // draws the second forest
        g.drawRect(550,20,400,250);
        g.drawRect(551,21,398,248);
        // draws a tree in the second forest
        drawForest(g,550,20,400,250);

        // draws the third forest
        g.drawRect(200,530,710,160);
        g.drawRect(201,531,708,158);
        // draws a tree in the third forest
        drawForest(g,200,530,710,160);
    }

    private void drawTree(Graphics g, int i, int i1) {
        Polygon tri = new Polygon();
        g.setColor( new Color(134,83,0) );	// defines a brownish color
        g.fillRect(i+17,i1+50,15,50); //draw the trunk
        //demonstrates the trunk boundary
        g.setColor(Color.black);
        g.drawRect(i+17, i1+50, 15,50);
        //creates and draws a polygon for branches
        g.setColor(Color.green);
        tri.addPoint(i+25,i1);
        tri.addPoint(i,i1+75);
        tri.addPoint(i+50,i1+75);
        g.fillPolygon(tri);
        //demonstrates the branches boundary
        g.setColor(Color.black);
        g.drawPolygon(tri);
    }


    public void drawForest( Graphics g, int x, int y, int w, int h ) {
        Random r = new Random();
        // creates a box to demonstrate the forest's boundary
        g.setColor(Color.black);
        g.drawRect(x, y, w, h);
        int a, b;
        for (int i = 1; i <= 100; i++) {
                if(x==10 && y == 10) {a = r.nextInt(450); b = r.nextInt(400);}
                else if(x==550 && y == 20) { a = r.nextInt(350); b = r.nextInt(150);}
                else {a = r.nextInt(660); b = r.nextInt(60);}
                    drawTree(g, x + a, y + b);
                }
            }

    public static void main(String[] args)
    {
        JFrame win = new JFrame("ForestAndTrees");
        win.setSize(1024,768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add( new ForestAndTrees() );
        win.setVisible(true);
    }

}