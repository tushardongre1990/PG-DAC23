import java.util.Scanner;

public class ass12_AddWithoutArithmeticOperator
{
    static int addWithoutPlus(int num1 , int num2)
    {
        while( num2 != 0)
        {
            int carry = num1 & num2;
            num1 = num1 ^ num2;
            num2 = carry << 1;
        }
        return num1;
    }
    public static void main(String[] args)
    {

        System.out.println("Enter 2 no.s");
        Scanner scanner = new Scanner(System.in);

        int num1  = scanner.nextInt();
        int num2  = scanner.nextInt();

        int res = addWithoutPlus(num1, num2);

        System.out.printf("%d + %d = %d", num1, num2, res);


    }
}
