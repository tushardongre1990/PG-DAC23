public class pyr7
{
    public static void main(String[] args)
    {
        for (int i = 1, p = 9; i <= 9 ; i++, p--)
        {
            for (int k = 1; k <= i ; k++)
            {
                System.out.print(" ");

            }
            for (int j = i; j <= 9 ; j++)
            {
                System.out.print( p +" ");
            }
            System.out.println();
        }


    }
}
