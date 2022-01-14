import java.util.Scanner;
public class AddingValuesWithForLoop {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Number: ");
        int quantityNumber = keyboard.nextInt();
        int inputNumber;
        int sum = 0;
        for (int i = 1; i <= quantityNumber;i++){
            inputNumber = keyboard.nextInt();
            sum = sum + inputNumber;
        }
        System.out.println("The sum is " + sum + ".");
    }
}
