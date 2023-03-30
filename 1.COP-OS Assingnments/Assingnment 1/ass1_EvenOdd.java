import java.util.Scanner;
public class ass1_EvenOdd
{
    static void isEven(int num)
    {
        if( (num % 2) == 0 )
        {
            System.out.println(num + " is even");
        }
        else
        {
            System.out.println(num + " is odd");
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Enter a integer number");
        Scanner scanner  = new Scanner(System.in);

        int num = scanner.nextInt();
        scanner.close();

        isEven(num);

    }
}
