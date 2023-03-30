import java.util.Scanner;

public class ass15_LcmOfTwoNum
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
    static int LCM(int num1, int num2)
    {
        int LCM =  (num1 * num2) / HCF(num1, num2);
        return LCM;
    }
    public static void main(String[] args)
    {
        System.out.println("Enter 2 num whose LCM u want to find out");
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int LCM = LCM(num1, num2);

        System.out.printf("LCM of %d & %d : %d", num1, num2, LCM);

    }
}
