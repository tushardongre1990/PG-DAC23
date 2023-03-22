import java.util.Scanner;

public class ass3_FactorialUsingRecursion
{
    static long fact(int num)
    {
        if (num == 0)
            return 1;

        else
            return num * fact(num -1);
    }
    public static void main(String[] args)
    {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        long fact = fact(num);
        System.out.println(fact);



    }
}