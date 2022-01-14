import java.util.Scanner;

public class CollatzSequence {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Starting number: ");
        int i = 0;
        int maxValue=1;
        int number = keyboard.nextInt();
        do{
            i++;
            if(number % 2 == 0) number /=2;
            else number = (number * 3) +1;
            System.out.print(number + " ");
            if(i%30==0) System.out.println();
            if(number>maxValue)maxValue=number;
        }while (number != 1);
        System.out.println("\nTerminated after " + i + " steps, The largest value was: " + maxValue);


    }
}
