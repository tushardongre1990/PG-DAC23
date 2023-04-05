class ElectricityBill
{
    private String customerName;
    private double unitsConsumed;
    private double billAmount;

    ElectricityBill(String customerName, double unitsConsumed)
    {
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
    }

    public void calBill( ){

        if(unitsConsumed <= 100){
            billAmount = unitsConsumed* 5;
        }
        else if (unitsConsumed > 100 && unitsConsumed <= 300) {
            billAmount = 500 + (unitsConsumed - 100) * 7;
        }
        else{
            billAmount = 500 + 1400 + (unitsConsumed - 300) * 10;

        }
    }

    public void displayBill() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Bill Amount: Rs. " + billAmount);
    }


}


public class Program 
{
    public static void main(String[] args) 
    {

        ElectricityBill e1 = new ElectricityBill("Tushar Dongre", 450);

        e1.calBill();
        e1.displayBill();


        
    }
    
}
