import java.util.Scanner;

public class ass18_PrimeFactorsOfNumber
{
    static boolean isPrime(int num)
    {
        if(num <= 1)
            return false;
        else if (num == 2)
            return true;
        else if (num % 2 == 0)
            return false;

        for (int i = 3; i < Math.sqrt(num) ; i += 2)
        {
          if (num % i == 0)
              return false;

        }
         return true;
    }

        static void PrimeFactor(int num)
        {
            System.out.print("Prime Factors of " + num+ " : ");

            for (int i = 1; i <= num / 2; i++)
            {
                if ( isPrime (i) && (num % i) == 0 )
                {
                    System.out.print(i + " ");
                }
            }
            if( isPrime(num) == true)
                System.out.println(num);;
        }


    public static void main(String[] args)
    {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        PrimeFactor(num);
    }
}
