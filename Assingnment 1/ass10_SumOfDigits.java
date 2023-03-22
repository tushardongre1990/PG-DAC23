import java.util.Scanner;

public class ass10_SumOfDigits
{
    static void sum(int num)
    {
        int rem = 0 , sum = 0;
        int temp = num;
        while (temp > 0)
        {
            rem = temp % 10;
            temp = temp / 10;
            sum = sum + rem;
        }
        System.out.printf(" Sum of %d : %d",num, sum);
    }
    public static void main(String[] args)
    {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        sum(num);

    }
}
