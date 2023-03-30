import java.util.Scanner;

public class ass17_PalindromeOrNot
{
    static int reverseNumber(int num) {
        int rem = 0;
        int revNum = 0;
        int temp = num; // 123

        while (temp > 0) {
            rem = temp % 10;
            temp = temp / 10;
            revNum = (revNum * 10) + rem; 
        }
        return revNum;
    }
    static void palindromeCheck(int num)
    {
        int revNum = reverseNumber(num);

        if (revNum == num)
            System.out.println(num + " is Palindrome");
        else
            System.out.println(num + " is not Palindrome");
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a +ve integer number");
        int num = scanner.nextInt();
        scanner.close();

        palindromeCheck(num);

    }
}
