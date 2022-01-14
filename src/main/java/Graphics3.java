import java.awt.*;
import javax.swing.JFrame;

public class Graphics3 extends Canvas
{
    public void paint( Graphics g )
    {

        g.setColor(Color.MAGENTA);
        g.setFont(new Font("Consolas", Font.PLAIN, 36)); // 36-pt plain
        g.drawString("Happy New Year!", 400, 200);

        g.setColor(Color.GRAY);
        g.setFont(new Font("Calibri", Font.BOLD+Font.ITALIC, 60)); // 60-pt italic bold
        g.drawString("Serhiy Subbotin", 300, 350);

        g.setColor(Color.blue);
        g.setFont(Font.decode("Calibri-BOLDITALIC-60")); // a different way to specify the same font
        g.drawString("Anna Lonskaya", 290, 360);

        g.setColor(Color.black);
        g.setFont(new Font(null)); // restore default font

        g.setColor(Color.red);
        g.setFont(new Font("Consolas", Font.PLAIN, 18));
        g.drawString("12", 190,370);
        g.drawString("3", 285,455);
        g.drawString("6", 195,545);
        g.drawString("9", 105,455);

        g.setColor(Color.MAGENTA);
        g.drawOval(100,350,200,200);
        g.setColor(Color.GRAY);
        g.fillOval(195,445,10,10);
        g.setColor(Color.green);
        g.fillRect(198,448,4,-45);
        g.setColor(Color.RED);
        g.drawLine(200,450,170,370);


//        // labels
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

    }

    public static void main( String[] args )
    {
        JFrame win = new JFrame("Graphics3");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Graphics3 canvas = new Graphics3();
        win.add( canvas );
        win.setVisible(true);
    }
}
