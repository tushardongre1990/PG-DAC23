import java.util.Scanner;

public class ass20_OddSeries
{
    static void oddSeries(int nThIndex)
    {
        int num = 1;
        System.out.print(num + " ");
        for (int i = 0; i < (nThIndex - 1); i++)
        {
            num = num + 2;
            System.out.print(num + " ");

        }
    }
    public static void main(String[] args)
    {
        System.out.println("Enter how many terms u want in EVEN SERIES");

        Scanner scanner = new Scanner(System.in);
        int nThIndex = scanner.nextInt();

        oddSeries(nThIndex);

    }
}
