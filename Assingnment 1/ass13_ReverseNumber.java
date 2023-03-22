import java.util.Scanner;

public class ass13_ReverseNumber
{

    static void reverseNumber(int num)
    {
        int rem = 0;
        int revNum = 0;
        int temp = num;

        while(temp > 0)
        {
            rem = temp % 10;
            temp = temp / 10;
            revNum = (revNum * 10) + rem;
        }
        System.out.println("Reverse of " + num + " : " + revNum);
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a +ve integer number");
        int num = scanner.nextInt();
        scanner.close();

        reverseNumber(num);

    }
}
