import java.util.Scanner;

public class ass8_DigitsOfNumber
{
    static void numToWord(char digit)
    {
        switch (digit)
        {
            case '0' :
                System.out.print("Zero ");
                break;
            case '1' :
                System.out.print("one ");
                break;
            case '2' :
                System.out.print("Two ");
                break;
            case '3' :
                System.out.print("Three ");
                break;
            case '4' :
                System.out.print("Four ");
                break;
            case '5' :
                System.out.print("Five ");
                break;
            case '6' :
                System.out.print("Six ");
                break;
            case '7' :
                System.out.print("Seven ");
                break;
            case '8' :
                System.out.print("Eight ");
                break;
            case '9' :
                System.out.print("Nine ");
            default:
                System.out.println("Invalid Input");
        }

    }
    static void printDigits(int num)
    {
        String rev = "";
        int rem;
        while (num > 0){
            rem = num % 10;
            num = num / 10;
            rev = rev + rem;
        }

        char digit;

        for (int i = (rev.length() -1); i >= 0 ; i--)
        {
            digit = rev.charAt(i);
            numToWord(digit);
        }
    }




    public static void main(String[] args)
    {
        System.out.println("Enter a number");

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        scanner.close();

        printDigits(num);

    }
}
