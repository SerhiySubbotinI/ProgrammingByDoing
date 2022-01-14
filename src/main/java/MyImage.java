import java.awt.*;
import javax.swing.JFrame;
import java.io.File;
import javax.imageio.ImageIO;

public class MyImage extends Canvas
{
    Image coolFace;

    public MyImage() throws Exception
    {
        coolFace = ImageIO.read( new File("serhiy.jpeg") );
        // Java supports PNG, JPEG, and GIF (but not animated GIFs). It does not support BMP.
    }

    public void paint( Graphics g )
    {
        g.drawImage(coolFace,100,100,this);

        g.setColor(Color.white);
        g.setFont(new Font("Century Gothic", Font.BOLD+Font.PLAIN, 24)); // 60-pt italic bold
        g.drawString("SERHIY SUBBOTIN", 165, 435);

        g.setColor(Color.black);
        g.setFont(new Font("Century Gothic", Font.BOLD+Font.PLAIN, 34));
        g.drawString("M", 100, 454);
        g.drawString("N", 335, 454);
        g.setFont(new Font("Century Gothic", Font.BOLD+Font.PLAIN, 24));
        g.drawString("R. SERHIY SUBBOTI", 132, 450);
        g.drawLine(155,454,341,454);
    }

    public static void main(String[] args) throws Exception
    {
        JFrame win = new JFrame("My Image");
        win.setSize(1024,768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add( new MyImage() );
        win.setVisible(true);
    }


}
