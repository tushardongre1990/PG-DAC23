import java.util.Scanner;

public class ass2_Factorial
{
    static int factorial(int num)
    {
        int fact = 1;

        if(num == 0) return 1;

        for (int i = num; i > 0 ; i--)
        {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args)
    {
        System.out.println("Enter an integer number");

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        scanner.close();

        int factorial = factorial(num);

        System.out.println("Factorial of " + num + " : " + factorial );

    }
}
