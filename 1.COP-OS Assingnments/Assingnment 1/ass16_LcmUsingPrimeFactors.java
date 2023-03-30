import java.util.Scanner;
public class ass16_LcmUsingPrimeFactors
{
    // Function to calculate LCM of two numbers using prime factors
    public static int lcm(int a, int b)
    {
        int max = (a > b) ? a : b;
        int lcm = 1;

        // loop through each prime number less than or equal to the maximum number
        for (int i = 2; i <= max; i++)
        {
            int count_a = 0, count_b = 0;

            // count the number of times the current prime factor i divides a
            while (a % i == 0)
            {
                count_a++;
                a /= i;            }

            // count the number of times the current prime factor i divides b
            while (b % i == 0)
            {
                count_b++;
                b /= i;
            }

            // find the maximum count of the current prime factor in a and b, and multiply it to lcm
            if (count_a > count_b)
            {
                lcm *= Math.pow(i, count_a);
            } else
            {
                lcm *= Math.pow(i, count_b);
            }
        }

        return lcm;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("LCM of %d and %d is %d\n", a, b, lcm(a, b));
    }
}
