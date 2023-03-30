public class pyr4
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 9 ; i++)
        {
            int p = 1;
            for (int k = i; k <= 9 ; k++)
            {
                System.out.print("  ");
            }
            for (int j = 1; j < i ; j++)
            {
                System.out.print( p++ +" ");
            }
            for (int l = 1; l <= i ; l++)
            {
                System.out.print( p-- +" ");
            }
            System.out.println();

        }

    }

}
