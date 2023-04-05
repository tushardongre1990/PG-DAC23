// import java.util.Scanner;

// class BankAccount{
//     private String name;
//     private int accNo;
//     private double balance;

//     private int 
    


//     public String getName(){
//         return this.name;
//     }
//     public void setName(String name){
//         this.name = name;
//     }

//     public void setAccNo(){
//         this.accNo = 
//     }


// }

// class BankTest{
//     static Scanner sc = new Scanner(System.in);

//     BankAccount acc1 = new BankAccount();

//     public void acceptRecord(){

//         System.out.println("Enter name");
//         acc1.setName(sc.nextLine());



//     }

// }

// public class Program {
//     public static void main(String[] args) {
        
//     }
// }


import java.util.Scanner;

class Bank{
    String holders_name;
    static int acc_no=3892773;
    double balance=10000; 
   

    private Scanner sc = new Scanner (System.in);

    public void menu(){
        System.out.println("ENTER YOUR CHOICE");
        System.out.println("1. Create Account");
        System.out.println("2. Deposite Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Display Balance");
        System.out.println("5. Display Details");
        System.out.println("0. Exit");
    }
    public  void createAccount()
    {   System.out.println("----ENTER YOUR NAME----");
        this.holders_name=sc.nextLine();
        System.out.println("----YOUR ACCOUNT IS CREATED----");
        System.out.println("YOUR ACCOUNT NUMBER IS "+(this.acc_no+=1));
        } 
        public  void depositeMoney()
        {
            System.out.println("----ENTER ACCOUNT NUMBER----");
        this.acc_no=sc.nextInt();
        System.out.println("----ENTER THE AMOUNT TO DEPOSITE----");
        double amountToDeposite = sc.nextDouble();
        this.balance = this.balance+amountToDeposite;
        System.out.println("----YOUR MONEY IS DEPOSITED----");
        System.out.println("YOUR CURRENT BALANCE IS "+this.balance);
        }
        public  void withdrawMoney()
        {
            System.out.println("----ENTER ACCOUNT NUMBER----");
            this.acc_no=sc.nextInt();
        System.out.println("----ENTER AMOUNT TO BE WITHDRAWN----");
        double amountToWithDraw = sc.nextDouble();
        if(amountToWithDraw>this.balance)
        System.out.println("----INSUFFICIENT BALANCE---- "+ this.balance);
        else{
        this.balance=this.balance-amountToWithDraw;
        System.out.println("----AMOUNT WITHDRAWED----");
        System.out.println("YOUR REMAINING  BALANCE IS "+this.balance);
        }
        } 

        public  void displayBalance()
        {
            System.out.println("----ENTER ACCOUNT NUMBER----");
            this.acc_no=sc.nextInt();
        System.out.println("----DISPLAYING BALANCE----");
        System.out.println("YOUR BALANCE  IS "+ this.balance);
        }
    
        public  void displayDetails()
        {
            System.out.println("----ENTER ACCOUNT NUMBER----");
            this.acc_no=sc.nextInt();
        System.out.println("----YOUR ACCOUNT DETAILS ARE----");
        System.out.println("CUSTOMER NAME     : "+ this.holders_name);
        System.out.println("ACCOUNT NUMBER    : "+ this.acc_no);
        System.out.println("BALANCE AMOUNT    : "+ this.balance);
        }
}



public class que6 {
    public static void main(String [] args){
      Bank bms = new Bank();

        bms.menu();
        Scanner sc = new Scanner(System.in);
        int choice ;
        while((choice = sc.nextInt())!=0){
            bms.menu();
            switch(choice){
                case 1: bms.createAccount();
                break;
                case 2 : bms.depositeMoney();
                break;
                case 3 : bms.withdrawMoney();
                break;
                case 4 : bms.displayBalance();
                break;
                case 5:  bms.displayDetails();
                break;
               
            }

        }

    }      
    
}
