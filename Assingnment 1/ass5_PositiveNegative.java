import java.util.Scanner;

public class ass5_PositiveNegative
{
    static void isPostNeg(int num)
    {
        if(num == 0)
        {
            System.out.println("0 is neither +ve nor -ve");
        } else if (num > 0)
        {
            System.out.println(num + " is +ve");
        }
        else
        {
            System.out.println(num + " is -ve");
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Enter a number");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        isPostNeg(num);
    }
}
