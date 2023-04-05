import java.util.Scanner;

class CreditScore{
    private int creditHistory;
    private double creditUtilization;
    private boolean paymentHistory;

    CreditScore(){

    }

    public int getCreditHistory(){
        return this.creditHistory;
    }
    public void setCreditHistory(int creditHistory){
        this.creditHistory = creditHistory;
    }
    public double getCreditUtilization(){
        return this.creditUtilization;
    }
    public void setCreditUtilization(double creditUtilization){
      this.creditUtilization = creditUtilization;
    }
    public boolean getPaymentHistory(){
        return this.paymentHistory;
    }
    public void setPaymentHistory(String paymentHistory){
        this.paymentHistory = Boolean.parseBoolean(paymentHistory);
    }

    public int calculateCreditScore(){

        int creditScore = (this.creditHistory * 15) + (int)(this.creditUtilization * 30);

        if(getPaymentHistory() == true){
             creditScore += 55;
        }
        else{
            creditScore += 35;
        }
        return creditScore;
    }

}

class CreditSCoreCalculator{
    private CreditScore c1 = new CreditScore();
    static Scanner sc = new Scanner(System.in);

    public void acceptRecord(){

        System.out.println("Enter credit history");
        c1.setCreditHistory( sc.nextInt() );

        System.out.println("Enter credit utilization");
        c1.setCreditUtilization( sc.nextDouble() );

        System.out.println("Enter payment history as true or false : ");
        c1.setPaymentHistory( sc.next());
    }

    public void printRecord(){
        System.out.println("Based on the following details ");
        System.out.println("Credit History : " + c1.getCreditHistory());
        System.out.println("Credit Utilization : " + c1.getCreditUtilization());
        System.out.println("Payment History : " + c1.getPaymentHistory());

        System.out.println("Your credit score is " + c1.calculateCreditScore());
    }

    public static int menuList(){

        
        System.out.println("________________________________");
        System.out.println("0.Exit");
        System.out.println("1.Accept Record.");
        System.out.println("2.Print Record");
        System.out.print("Enter choice  : ");
        return sc.nextInt();

    }
}

public class Program {
    public static void main(String[] args) {

        int choice;

        CreditSCoreCalculator cr1 = new CreditSCoreCalculator();

        while( (choice = CreditSCoreCalculator.menuList()) != 0 )
        {
            switch(choice)
            {
                case 1 : cr1.acceptRecord();
                System.out.println("________________________________");
                break;
                case 2 : cr1.printRecord();
                System.out.println("________________________________");
                break;
                default : System.out.println("Invalid Choice");
            }
        }
        
    }
    
}
