import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the first rational number
        System.out.println("Enter the first rational number:");
        System.out.println("numerator : ");
        int num1 = sc.nextInt();
        System.out.println("denominator : ");
        int den1 = sc.nextInt();
        
        // Input the second rational number
        System.out.println("Enter the second rational number:");
        System.out.print("numerator : ");
        int num2 = sc.nextInt();
        System.out.print("denominator : ");
        int den2 = sc.nextInt();
        
        // Input the arithmetic operation
        System.out.println("Enter the arithmetic operation (+, -, *, /):");
        String op = sc.next();
        
        // Perform the arithmetic operation and output the result
        double res_num = 0, res_den = 0;
        
        if (op.equals("+")) {
            res_num = num1 * den2 + num2 * den1;
            res_den = den1 * den2;
            System.out.println(res_num / res_den);
        } 
        else if (op.equals("-")) {
            res_num = num1 * den2 - num2 * den1;
            res_den = den1 * den2;
            System.out.println(res_num / res_den);
        }
         else if (op.equals("*")) {
            res_num = num1 * num2;
            res_den = den1 * den2;
            System.out.println(res_num / res_den);
        } 
        else if (op.equals("/")) {
            res_num = num1 * den2;
            res_den = den1 * num2;
            System.out.println(res_num / res_den);
        } 
        else {
            System.out.println("Invalid operation!");
            System.exit(0);
        }
        

    }
    

}
