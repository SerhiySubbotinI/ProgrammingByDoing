import java.util.Scanner;

public class Numeric
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        int numberInt1 = 0, numberInt2 = 0, i = 0, d = 0;
        double numberDbl1 = 0, numberDbl2 = 0;
        String operation;
        String op = "";
        do
        {
            //System.out.print("> ");
            operation = keyboard.next();

            if (operation.equals("!")) break;

            if(isNumeric(operation)) {

                if (isInteger(operation) && i == 0) {
                    numberInt1 = Integer.parseInt(operation);
                    i++;
                } else if (isInteger(operation) && i == 1) {
                    numberInt2 = Integer.parseInt(operation);
                    i++;
                } else if (isDouble(operation) && d == 0) {
                    numberDbl1 = Double.valueOf(operation);
                    d++;
                } else if (isDouble(operation) && d == 1) {
                    numberDbl2 = Double.valueOf(operation);
                    d++;
                }
            }
            else op = operation;

            if(i >= 2){
                System.out.print(" = ");
                i=0;
                switch (op){
                    case "+" : {System.out.println(numberInt1 + numberInt2);break;}
                    case "-" : {System.out.println(numberInt1 - numberInt2);break;}
                    case "*" : {System.out.println(numberInt1 * numberInt2);break;}
                    case "/" : {System.out.println(numberInt1 / numberInt2);break;}
                    default:
                        throw new IllegalStateException("Unexpected value: " + op);
                }
            }
            if(d >= 2){
                System.out.print(" = ");
                d = 0;
                switch (op){
                    case "+" : {System.out.println(numberDbl1 + numberDbl2);break;}
                    case "-" : {System.out.println(numberDbl1 - numberDbl2);break;}
                    case "*" : {System.out.println(numberDbl1 * numberDbl2);break;}
                    case "/" : {System.out.println(numberDbl1 / numberDbl2);break;}
                    default:
                        throw new IllegalStateException("Unexpected value: " + op);
                }
            }
        } while (true);
    }

    public static boolean isNumeric( String s )
    {
        return ( isDouble(s) || isInteger(s) );
    }

    public static boolean isDouble( String s )
    {
        double n = 0;
        try
        {
            n = Double.valueOf( s );
        }

        catch ( NumberFormatException e )
        {
            return false;
        }

        return true;
    }

    public static boolean isInteger( String s )
    {
        int n = 0;
        try
        {
            n = Integer.valueOf( s );
        }

        catch ( NumberFormatException e )
        {
            return false;
        }

        return true;
    }
}
