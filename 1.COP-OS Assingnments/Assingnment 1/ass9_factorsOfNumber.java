
import java.util.Scanner;

public class ass9_factorsOfNumber
{
    static void factor(int num)
    {
        System.out.println("Factors of " + num);
        for (int i = 1; i <= num / 2 ; i++)
        {
            if( (num % i) == 0)
            {
                System.out.print(i + " ");
            }

        }
        System.out.print(num);
    }

    public static void main(String[] args)
    {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        factor(num);


    }
}
