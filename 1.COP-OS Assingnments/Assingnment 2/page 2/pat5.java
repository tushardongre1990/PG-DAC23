public class pat5
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 5 ; i++)
        {
            for (int j = 4; j >= i ; j--)
            {
                System.out.print("  ");
            }
            for (int j = 1; j <= i ; j++)
            {
                System.out.print("* ");
            }
            for (int k = 2; k <=i ; k++)
            {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}
