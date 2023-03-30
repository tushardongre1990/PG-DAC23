public class pat10
{
    public static void main(String[] args)
    {
        for (char i = 69; i >= 65 ; i--)
        {
            for (char j = 65; j <= 69 ; j++)
            {
                if(j <i)
                    System.out.print(" ");
                else
                    System.out.print(j + " ");

            }
            System.out.println();

        }
    }
}
