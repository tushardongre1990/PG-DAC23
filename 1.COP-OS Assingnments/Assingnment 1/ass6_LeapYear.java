import java.util.Scanner;

public class ass6_LeapYear
{
    static void isLeap(int year)
    {
        if(  ( (year % 4 ) == 0 && (year % 100) != 0 ) || (year % 400) == 0 )
        {
            System.out.println(year + " : Leap Year");
        }
        else
        {
            System.out.println(year +" : Not a Leap Year");
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Enter a year");

        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        isLeap(year);


    }
}
