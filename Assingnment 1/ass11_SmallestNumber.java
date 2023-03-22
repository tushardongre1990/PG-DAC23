import java.util.Scanner;

public class ass11_SmallestNumber
{
    static void smallestNumber(int a , int b, int c)
    {
        if(a <= b && a <= c)
        {
            System.out.println(a + " is smallest");
        } else if (b <= c)
        {
            System.out.println(b + " is smallest");
        }
        else
        {
            System.out.println(c + " is smallest");
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Enter 3 numbers");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        scanner.close();

        smallestNumber(a, b, c);



    }
}
