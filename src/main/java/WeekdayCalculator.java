import java.util.Scanner;

public class WeekdayCalculator
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to birth-o-meter!");
        System.out.println();
        System.out.println("All you have to do is enter your birth date, and it will");
        System.out.println("tell you the day of the week on which you were born.");
        System.out.println();
        System.out.println("Some automatic tests....");
        System.out.println("12 10 2003 => " + weekday(12,10,2003));
        System.out.println(" 2 13 1976 => " + weekday(2,13,1976));
        System.out.println(" 2 13 1977 => " + weekday(2,13,1977));
        System.out.println(" 7  2 1974 => " + weekday(7,2,1974));
        System.out.println(" 1 15 2003 => " + weekday(1,15,2003));
        System.out.println("10 13 2000 => " + weekday(10,13,2000));
        System.out.println();

        System.out.println("Now it's your turn!  What's your birthday?");
        System.out.print("Birth date (mm dd yyyy): ");
        int mm = keyboard.nextInt();
        int dd = keyboard.nextInt();
        int yyyy = keyboard.nextInt();

        System.out.print("You were born on ");
        System.out.println(weekday(mm,dd,yyyy));
    }


    public static String weekday( int mm, int dd, int yyyy )
    {
        int yy, total;
        String date = "";
        yy = yyyy - 1900;
        total = (yy / 4) + yy + dd + month_offset(mm);
        if(is_leap(yyyy) && mm == 1) total -=1;
        if(is_leap(yyyy) && mm == 2) total -=1;
        date = weekday_name(total%7) + ", " + month_name(mm) + " " + dd + ", " + yyyy;
        return date;
    }

    public static boolean is_leap( int year )
    {
        boolean result;

        if ( year%400 == 0 ) result = true;
        else if ( year%100 == 0 ) result = false;
        else if ( year%4 == 0 ) result = true;
        else result = false;

        return result;
    }
    public static int month_offset( int month )
    {
        int result;
        switch (month){
            case 1 :
            case 10 : result = 1; break;
            case 2 :
            case 3 :
            case 11 : result = 4;break;
            case 4 :
            case 7 : result = 0;break;
            case 5 : result = 2;break;
            case 6 : result = 5;break;
            case 8 : result = 3;break;
            case 9 :
            case 12 : result = 6;break;
            default : result = -1;
        }
        return result;
    }
    public static String weekday_name(int day){
        String result;
        switch (day){
            case 1 : result = "Sunday";break;
            case 2 : result = "Monday";break;
            case 3 : result = "Tuesday";break;
            case 4 : result = "Wednesday";break;
            case 5: result = "Thursday";break;
            case 6 : result = "Friday";break;
            case 7 : result = "Saturday";break;
                default : result = "error weekday_name";
        }
        return result;
    }
    public static String month_name( int month )
    {
        String result;
        switch (month){
            case 1 : result = "January";break;
            case 2 : result = "February";break;
            case 3 : result = "March";break;
            case 4 : result = "April";break;
            case 5 : result = "May";break;
            case 6 : result = "June";break;
            case 7 : result = "July";break;
            case 8 : result = "August";break;
            case 9 : result = "September";break;
            case 10 : result = "October";break;
            case 11 : result = "November";break;
            case 12 : result = "December";break;
            default : result = "error month_name";
        }
        return result;
    }
}
