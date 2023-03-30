public class pat21
{
    public static void main(String[] args)
    {
        char count = 65;
        for (int i = 1; i <= 5 ; i++)
        {
            for (int j = 1; j <= i ; j++)
            {
                System.out.printf("%3c ",count++);
            }
            System.out.println();
        }

    }
}
