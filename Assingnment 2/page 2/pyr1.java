public class pyr1
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 9 ; i++)
        {
            for (int k = i; k <= 9 ; k++)
            {
                System.out.printf(" ");

            }
            for (int j = 1; j <= i ; j++)
            {
                System.out.print(i+ " ");
            }
            System.out.println();

        }

    }
}
