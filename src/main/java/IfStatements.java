import java.util.Scanner;
import javax.swing.*;

public class IfStatements extends JFrame{
    public static void main(String[] args) throws InterruptedException {
        ifStatements1();
        ifStatements2();
        ifStatements3();
        ifStatements4();
        ifStatements5();
        ifStatements6();
        ifStatements7();
    }

    private static void ifStatements7() {
        JFrame f = new IfStatements();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,400);
        f.setVisible(true);
    }

    private static void ifStatements6()  {
        String name = JOptionPane.showInputDialog("What is your name?");
        String input = JOptionPane.showInputDialog("Hoy old are you?");
        int age = Integer.parseInt(input);
        System.out.print("Hello, " + name + ".");
        System.out.println("Next year, you'll be " + (age+1));
        System.exit(0);
    }

    private static void ifStatements5() throws InterruptedException {
        for ( int i=0; i<80; i++ )
        {
            if ( i%16 == 0 )
                System.out.print(" ********                 \r");
            else if ( i%16 == 1 )
                System.out.print("   ********               \r");
            else if ( i%16 == 2 )
                System.out.print("     ********             \r");
            else if ( i%16 == 3 )
                System.out.print("       ********           \r");
            else if ( i%16 == 4 )
                System.out.print("         ********         \r");
            else if ( i%16 == 5 )
                System.out.print("           ********       \r");
            else if ( i%16 == 6 )
                System.out.print("             ********     \r");
            else if ( i%16 == 7 )
                System.out.print("               ********   \r");
            else if ( i%16 == 8 )
                System.out.print("                 ******** \r");
            else if ( i%16 == 9 )
                System.out.print("               ********   \r");
            else if ( i%16 == 10 )
                System.out.print("             ********     \r");
            else if ( i%16 == 11 )
                System.out.print("           ********       \r");
            else if ( i%16 == 12 )
                System.out.print("         ********         \r");
            else if ( i%16 == 13 )
                System.out.print("       ********           \r");
            else if ( i%16 == 14 )
                System.out.print("     ********             \r");
            else if ( i%16 == 15 )
                System.out.print("   ********               \r");

            Thread.sleep(200);
        }
    }

    private static void ifStatements4() throws InterruptedException {
            int repeats = 5;
            int steps_per_second = 10;

            for ( int i=0; i<repeats*11 ; i++ )
            {
                if ( i%11 == 0 )
                    System.out.print(" .oOo..... \r");
                else if ( i%11 == 1 )
                    System.out.print(" ..oOo.... \r");
                else if ( i%11 == 2 )
                    System.out.print(" ...oOo... \r");
                else if ( i%11 == 3 )
                    System.out.print(" ....oOo.. \r");
                else if ( i%11 == 4 )
                    System.out.print(" .....oOo. \r");
                else if ( i%11 == 5 )
                    System.out.print(" ......oOo \r");
                else if ( i%11 == 6 )
                    System.out.print(" .......oO \r");
                else if ( i%11 == 7 )
                    System.out.print(" o.......o \r");
                else if ( i%11 == 8 )
                    System.out.print(" Oo....... \r");
                else if ( i%11 == 9 )
                    System.out.print(" oOo...... \r");
                else if ( i%11 == 10 )
                    System.out.print(" .oOo..... \r");

                Thread.sleep(1000/steps_per_second);
            }
    }

    private static void ifStatements3() {
        int people = 30;
        int cars = 40;
        int buses = 15;

        if ( cars > people )
        {
            System.out.println( "We should take the cars." );
        }
        else if ( cars < people )
        {
            System.out.println( "We should not take the cars." );
        }
        else
        {
            System.out.println( "We can't decide." );
        }
        if ( buses > cars )
        {
            System.out.println( "That's too many buses." );
        }
        else if ( buses < cars )
        {
            System.out.println( "Maybe we could take the buses." );
        }
        else
        {
            System.out.println( "We still can't decide." );
        }
        if ( people > buses )
        {
            System.out.println( "All right, let's just take the buses." );
        }
        else
        {
            System.out.println( "Fine, let's stay home then." );
        }
    }

    private static void ifStatements2() {
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;
        System.out.print("Hey, what's your name? ");
        name = keyboard.next();
        System.out.print("Ok, " + name + ", how old are you? ");
        age = keyboard.nextInt();
        if(age < 16) System.out.println("You can't drive, " + name);
        if (age < 18) System.out.println("You can't vote, " + name);
        if (age < 25) System.out.println("You can't rent a car, " + name);
        if (age >= 25) System.out.println("You can do anything that's legal, " + name);
    }

    public static void ifStatements1(){
        int people = 20;
        int cats = 20;
        int dogs = 20;

        if ( people < cats ) System.out.println( "Too many cats!  The world is doomed!" );
        if ( people > cats ) System.out.println( "Not many cats!  The world is saved!" );

        if ( people < dogs ) System.out.println( "The world is drooled on!" );
        if ( people > dogs ) System.out.println( "The world is dry!" );
        dogs += 5;
        if ( people >= dogs ) System.out.println( "People are greater than or equal to dogs." );
        if ( people <= dogs ) System.out.println( "People are less than or equal to dogs." );
        if ( people == dogs ) System.out.println( "People are dogs." );
    }

}
