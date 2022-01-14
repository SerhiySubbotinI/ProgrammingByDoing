import java.util.Random;
import java.util.Scanner;

/* Nim is a mathematical game of strategy in which two players take turns removing (or "nimming") objects
   from distinct heaps or piles. On each turn, a player must remove at least one object, and may remove any
   number of objects provided they all come from the same heap or pile. Depending on the version being played,
   the goal of the game is either to avoid taking the last object or to take the last object. */

public class EmptyThePiles {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        String pile = null;
        String player1;
        String player2;
        String leadingPlayer;
        String gameWithComputer;
        int number;
        int count = 0, count1 = 5, count2 = 7, count3 = 6;
        int whoFirst = 1 + r.nextInt(2);
        int computer;
        do {
            System.out.print("Do you want play with Computer? Y/N: ");
            gameWithComputer = keyboard.next();
            if(gameWithComputer.equals("Y")) break;
            else if (gameWithComputer.equals("N")) break;
            else System.out.println("If you want to play with Computer, enter Y, else enter N.");
        }while (true);

        System.out.print("Player 1, enter your name: ");
        player1 = keyboard.next();
        System.out.print("Player 2, enter your name: ");
        if(gameWithComputer.equals("Y")) {player2 = "Computer"; System.out.println(player2);}
        else player2 = keyboard.next();

        do {
            int max = (count1 > count2 && count1 > count3) ? count1 : ((count2 > count3) ? count2 : count3);
            while (max != 0) {
                if (max <= count1) System.out.print("\t*");
                else System.out.print("\t ");
                if (max <= count2) System.out.print("\t*");
                else System.out.print("\t ");
                if (max <= count3) System.out.print("\t*");
                else System.out.print("\t ");
                System.out.println();
                max--;
            }
            System.out.println("\tA\tB\tC\n\t" + count1 +"\t" + count2 + "\t" + count3 + "\n");

            if (whoFirst == 1) leadingPlayer = player1;
            else leadingPlayer = player2;

            int check = 0;
            do {
                System.out.print(leadingPlayer + ",choose a pile: ");
                if(gameWithComputer.equals("Y") && whoFirst == 2) {computer = 1 + r.nextInt(3);
                switch (computer){
                    case 1 : pile = "A"; System.out.println(pile);break;
                    case 2 : pile = "B"; System.out.println(pile);break;
                    case 3 : pile = "C"; System.out.println(pile);break;
                }
                }
                else pile = keyboard.next();

                switch (pile) {
                    case "A": count = count1;check++;break;
                    case "B": count = count2;check++;break;
                    case "C": count = count3;check++;break;
                    default: System.out.println(leadingPlayer + ",you must choose A, B or C.");
                }
                if( count == 0 && pile.equals("A") || count == 0 && pile.equals("B") || count == 0 && pile.equals("C"))
                { check--; System.out.println(leadingPlayer + ", choose another pile. Pine " + pile + " is empty");}

            }while (check != 1);

            do {
                System.out.print("How many to remove from pile: ");
                if (gameWithComputer.equals("Y") && whoFirst == 2) { number = 1 + r.nextInt(count);
                    System.out.println(number);}
                else number = keyboard.nextInt();

                if(number > 0 && number <= count) break;
                else System.out.println(leadingPlayer + ", you must choose at least 1 to ... " + count + " How many? ");

            }while (true);

            switch (pile) {
                case "A": count1 -= number; break;
                case "B": count2 -= number; break;
                case "C": count3 -= number; break;
                default: System.out.println();
            }

            if(whoFirst == 1) whoFirst +=1;
            else whoFirst -=1;

            if(count1 == 1 && count2 == 0 && count3 == 0) break;
            else if (count1 == 0 && count2 == 1 && count3 == 0) break;
            else if (count1 == 0 && count2 == 0 && count3 == 1) break;

            if(count1 == 0 && count2 == 0 && count3 == 0) {
                if (whoFirst == 1) whoFirst += 1;
                else whoFirst -= 1;
                break;
            }
            } while (count1 > 0 || count2 > 0 || count3 > 0);

            if(whoFirst == 1) System.out.println("\n" + player1 + ", you must take the last remaining counter, so \nyou lose. " + player2 + " wins!");
             else System.out.println(player2 + ", you must take the last remaining counter, so \nyou lose. " + player1 + " wins!");
        }
    }

