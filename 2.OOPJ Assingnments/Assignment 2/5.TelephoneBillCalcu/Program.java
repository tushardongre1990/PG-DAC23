import java.util.Scanner;
class TeleBill{
    private String customerName;
    private String phoneNumber;
    private int numberOfCalls;
    private int durationOfCalls;


    public String getCustomerName(){
        return this.customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public int getNumberOfCalls(){
        return this.numberOfCalls;
    }
    public void setNumberOfCalls(int numberOfCalls){
        this.numberOfCalls = numberOfCalls;
    }
    public int getDurationOfCalls(){
        return this.durationOfCalls;
    }
    public void setDurationOfCalls(int durationOfCalls){
        this.durationOfCalls = durationOfCalls;
    }

    public int BillCalc(){

        // Calculating bill based on the given criteria
        int numberOfCallsBeyond100 = Math.max(0, this.numberOfCalls - 100);
        int numberOfCallsWithin100 = this.numberOfCalls - numberOfCallsBeyond100;

        int bill = (int) ((numberOfCallsWithin100 * 0.5) + (numberOfCallsBeyond100 * 0.25)) * Math.max(1, durationOfCalls);
        bill += 10; // Flat rate of $10 per month

        return bill;

    }

}

class TeleBillTest{

    private static Scanner scanner = new Scanner(System.in);

    TeleBill t1 = new TeleBill();

    // Taking input from the user
    public void acceptRecord(){
        System.out.print("Enter customer name: ");
        t1.setCustomerName(scanner.nextLine());

        System.out.print("Enter phone number: ");
        t1.setPhoneNumber(scanner.nextLine());
        

        System.out.print("Enter number of calls made: ");
        t1.setNumberOfCalls(scanner.nextInt());
       

        System.out.print("Enter duration of calls (in minutes): ");
        t1.setDurationOfCalls(scanner.nextInt());
    }


    // Displaying the final bill to the user
    public void printRecord(){
        System.out.println(t1.getCustomerName());
        System.out.println(t1.getPhoneNumber());
        System.out.println(t1.getNumberOfCalls());
        System.out.println(t1.getDurationOfCalls());
        System.out.println("Total Bill : " + t1.BillCalc());
    }


}
public class Program {
    public static void main(String[] args) {

        TeleBillTest t = new TeleBillTest();
        t.acceptRecord();
        t.printRecord();
    }
}
