import java.util.Scanner;

public class ass14_HcfOFTwoNum
{
    static int HCF(int num1 , int num2)
    {
        while(num1 != num2)
        {
            if( num1 > num2)
                num1 = num1 -num2;
            else
                num2 = num2 - num1;
        }
        return num1;
    }
    public static void main(String[] args)
    {
        System.out.println("Enter 2 numbers whose HCF u want to find out");

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int HCF = HCF(num1, num2);

        System.out.printf("HCF of %d & %d : %d",num1, num2, HCF );

    }
}
