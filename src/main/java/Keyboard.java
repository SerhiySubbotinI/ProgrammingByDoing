import java.util.Locale;
import java.util.Scanner;
public class Keyboard {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int task;
        System.out.println("Input task number (1-7): ");
        task = keyboard.nextInt();
        switch (task) {
            case 1:
                askingQuestions1();
                break;
            case 2:
                askingQuestions2();
                break;
            case 3:
                askingQuestions3();
                break;
            case 4:
                askingQuestions4();
                break;
            case 5:
                askingQuestions5();
                break;
            case 6:
                askingQuestions6();
                break;
            case 7:
                askingQuestions7();
                break;
        }
    }

    private static void askingQuestions7() {
        Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);
        float height;
        float weight;
        float bmi;
        String category;
        System.out.print("Your height in m: ");
        height = keyboard.nextFloat();
        System.out.print("Your weight in kg: ");
        weight = keyboard.nextFloat();
        bmi = weight / (height * height);
        System.out.println("Your BMI is " + bmi);
        if(18.5 > bmi) category = "underweight";
            else if (25 > bmi && bmi >= 18.5) category = "normal weight";
            else if (30 > bmi && bmi >= 25) category = "overweight";
            else if(bmi >= 30) category = "obese";
            else category = "";
        System.out.println("BMI Category: " + category);
    }

    private static void askingQuestions6() {
        Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);
        float firstNumber;
        float secondNumber;
        float thirdNumber;
        float sumNumber;
        System.out.print("What is your first number? ");
        firstNumber = keyboard.nextFloat();
        System.out.print("What is your second number? ");
        secondNumber = keyboard.nextFloat();
        System.out.print("What is your third number? ");
        thirdNumber = keyboard.nextFloat();
        sumNumber = firstNumber + secondNumber + thirdNumber;
        System.out.print("( " + firstNumber + " + " + secondNumber + " + " + thirdNumber + " ) / 2 is... " + sumNumber/2);
    }

    private static void askingQuestions5() {
        Scanner keyboard = new Scanner(System.in);
        String name;
        byte age;
        System.out.print("Hello.  What is your name? ");
        name = keyboard.next();
        System.out.print("Hi, " + name + "!  How old are you? ");
        age = keyboard.nextByte();
        System.out.print("Did you know that in five years you will be " + (age - 5) + " years old?\nAnd five years " +
                "ago you were " + (age + 5) + "! Imagine that!");
    }

    private static void askingQuestions4() {
        Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);
        String firstName;
        String lastName;
        String loginName;
        byte gradeClassification; //9-12
        int studentIdNumber;
        float gpa;  //0.0-4.0

        System.out.println("First name: " );
        firstName = keyboard.next();

        System.out.println("Last name: ");
        lastName = keyboard.next();

        System.out.println("Grade (9-12): ");
        gradeClassification = keyboard.nextByte();

        System.out.println("Student ID: ");
        studentIdNumber = keyboard.nextInt();

        System.out.println("Login: ");
        loginName = keyboard.next();

        System.out.println("GPA (0.0-4.0): ");
        gpa = keyboard.nextFloat();

        System.out.format("Your information: \n\t\tLogin: \t" + loginName + "\n\t\tID: \t" + studentIdNumber + "\n\t\t"
          + "Name: \t" + lastName + ", " + firstName + "\n\t\tGPA: \t" + gpa + "\n\t\tGrade: \t" + gradeClassification);
    }

    private static void askingQuestions3() {
        //Scanner keyboard = new Scanner(System.in); input 99,9
        Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);
        //.useLocale(Locale.US) for input value float or double 99.9
        String name;
        int age;
        float moneyPerHour;

        System.out.println("Hello.  What is your name?");
        name = keyboard.next();

        System.out.println("Hi, " + name + "How old are you?");
        age = keyboard.nextInt();

        System.out.println("So you're " + age + ", eh?  That's not old at all!");
        System.out.println("How much do you make, " + name);
        moneyPerHour = keyboard.nextFloat();

        System.out.println(moneyPerHour + "!  I hope that's per hour and not per year! LOL!");
    }

    private static void askingQuestions2() {
    Scanner keyboard = new Scanner(System.in);
        System.out.println("Give me a word!");
        keyboard.next();

        System.out.println("Give me a second word!");
        keyboard.next();

        System.out.println();
        System.out.println("Great, now your favorite number?");
        keyboard.nextInt();

        System.out.println("And your second-favorite number...");
        keyboard.nextInt();

        System.out.println("Whew!  Wasn't that fun?");
    }

    private static void askingQuestions1() {
        Scanner keyboard = new Scanner(System.in);
        int age;
        int feet;
        int inches;
        double weight;
        System.out.print( "How old are you? " );
        age = keyboard.nextInt();
        System.out.print( "How many feet tall are you? " );
        feet = keyboard.nextInt();
        System.out.print( "And how many inches? " );
        inches = keyboard.nextInt();
        System.out.print( "How much do you weigh? " );
        weight = keyboard.nextDouble();
        System.out.println( "So you're " + age + " old, " + feet + "'" + inches + " tall and " + weight + " heavy." );
    }
}
