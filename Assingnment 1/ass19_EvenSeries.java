import java.util.Scanner;

public class ass19_EvenSeries
{
    static void evenSeries(int nThIndex)
    {
        int num = 0;
        for (int i = 0; i < nThIndex; i++)
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

        evenSeries(nThIndex);

    }
}
