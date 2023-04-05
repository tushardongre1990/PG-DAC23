import java.util.Scanner;
class RationNumber{
    private int num1;
    private int num2;
    private int deno1;
    private int deno2;

    public int getNum1(){
        return this.num1;
    }
    public void setNum1(int num1){
        this.num1 = num1;
    }
    public int getNum2(){
        return this.num2;
    }
    public void setNum2(int num2){
        this.num1 = num2;
    }
    public int getDeno1(){
        return this.deno1;
    }
    public void setDeno1(int deno1){
        this.num1 = deno1;
    }
    public int getDeno2(){
        return this.deno2;
    }
    public void setDeno2(int deno2){
        this.num1 = deno2;
    }

    public arithematicOperation(String op){

             // Perform the arithmetic operation and output the result
             int res_num = 0, res_den = 0;

             if(this.deno1 >0 && this.deno2 > 0) {
        
             if (op.equals("+")) {
                 res_num = num1 * den2 + num2 * den1;
                 res_den = den1 * den2;
             } else if (op.equals("-")) {
                 res_num = num1 * den2 - num2 * den1;
                 res_den = den1 * den2;
             } else if (op.equals("*")) {
                 res_num = num1 * num2;
                 res_den = den1 * den2;
             } else if (op.equals("/")) {
                 res_num = num1 * den2;
                 res_den = den1 * num2;
             } else {
                 System.out.println("Invalid operation!");
                 System.exit(0);
             }
        }
        else{
            System.out.println("Enter +ve denominator");
        }


    }


}
class RationNumberTest{
    RationNumber r1 = new RationNumber();
    RationNumber r2 = new RationNumber();
    static Scanner sc = new Scanner(System.in);

    public void acceptRecord(){

        // Input the first rational number
        System.out.println("Enter the first rational number:");
        System.out.println("numerator :");
        r1.setNum1( sc.nextInt() );

        System.out.println("denominator : ");
        r1.setDeno1(sc.nextInt());
        
        
        // Input the second rational number
        System.out.println("Enter the second rational number:");
        System.out.println("numerator :");
        r2.setNum2( sc.nextInt() );

        System.out.println("denominator : ");
        r1.setDeno2(sc.nextInt());
        
        // Input the arithmetic operation
        System.out.println("Enter the arithmetic operation (+, -, *, /):");
        String op = sc.next();

    }

}
public class Program {

    public static void main(String[] args) {
        
        
        
        
        
     
    }
    

    
}
