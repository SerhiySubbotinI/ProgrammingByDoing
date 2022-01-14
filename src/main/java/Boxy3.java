import javax.swing.*;
import java.awt.*;
import java.util.Random;

class Boxy3 extends Canvas
{
    public void paint( Graphics window ) {
        for (int i = 1; i <= 7; i++) {
        Random r = new Random();
        int width = 40 + r.nextInt(200);
        int height = 40 + r.nextInt(200);
        int x = 1 + r.nextInt(500);
        int y = 1 + r.nextInt(300);
        drawBox(window, x, y, width, height);
    }
    }

        public void drawBox( Graphics window, int x, int y, int w, int h ) {
            Random r = new Random();
            int color = 1 + r.nextInt(12);
            switch (color) {
                case 1: window.setColor(Color.blue);
                    break;
                case 2:
                    window.setColor(Color.pink);
                    break;
                case 3:
                    window.setColor(Color.yellow);
                    break;
                case 4:
                    window.setColor(Color.green);
                    break;
                case 5:
                    window.setColor(Color.black);
                    break;
                case 6:
                    window.setColor(Color.red);
                    break;
                case 7:
                    window.setColor(Color.orange);
                    break;
                case 8:
                    window.setColor(Color.gray);
                    break;
                case 9:
                    window.setColor(Color.cyan);
                    break;
                case 10:
                    window.setColor(Color.magenta);
                    break;
                case 11:
                    window.setColor(Color.darkGray);
                    break;
                default:
                    window.setColor(Color.lightGray);
                    break;
            }
            window.fillRect(x,y,w,h);
            window.setColor(Color.WHITE);
            window.fillRect(x+10,y+10,w-20,h-20);
        }

        public static void main( String[] args )
        {
            Canvas canvas = new Boxy3();
            JFrame win = new JFrame("Boxy3");
            win.setSize(800, 600);
            win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            canvas.setBackground(Color.WHITE);
            win.add(canvas);
            win.setVisible(true);
        }
    }
