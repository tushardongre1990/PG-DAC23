public class pat13
{

        public static void main(String[] args)
        {
            for (char i = 65; i <= 69 ; i++)
            {
                for (char j = 69; j > i ; j--)
                {
                    System.out.print(" ");
                }
                for (char k = 65; k <= i ; k++)
                {
                    System.out.print(i + " ");
                }
                System.out.println();

            }

        }
    }


