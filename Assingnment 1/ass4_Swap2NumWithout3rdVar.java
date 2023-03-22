import java.util.Scanner;

public class ass4_Swap2NumWithout3rdVar
{
    static void swap(int num1, int num2)
    {
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("Swapped numbers are ");
        System.out.println("num1 : "+ num1 + " num2 : " + num2);
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 2 numbers u want to swap");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        scanner.close();
        System.out.println("num1 : "+ num1 + " num2 : " + num2);
        System.out.println();
        swap(num1, num2);

    }
}
