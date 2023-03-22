public class pyr5 {
    public static void main(String[] args)
    {
        int i, j, k, l;
        for (i = 9; i >= 1; i--)
        {

            for (k = (i - 1); k >= 1; k--)
            {
                System.out.print("  ");
            }

            for (j = i; j <= 9; j++)
            {
                System.out.print(j + " ");
            }

            for (l = 8; l >= i; l--)
            {
                System.out.print(l + " ");
            }

            System.out.println();


        }
    }
}
