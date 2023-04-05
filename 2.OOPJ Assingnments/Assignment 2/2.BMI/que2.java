import java.util.Scanner;

class Bmi
{
    private float weight, height;
    
    Bmi()
    {

    }
    Bmi(float weight, float height)
    {
        this.weight = weight;
        this.height = height;
    }

//   weight get-set
    public float getWeight()
    {
        return this.weight;
    }
    public void setWeight(float weight)
    {
        this.weight = weight;
    }
    
    // height get-set

    public float getHeight()
    {
        return this.height;
    }
    public void seHeight(float height)
    {
        this.height = height;
    }

}

class BmiCalculator
{
    private Bmi bmi = new Bmi();

    static Scanner sc = new Scanner(System.in);

    public void acceptRecord()
    {

        System.out.println("Enter your Weight in kg");
        bmi.setWeight( sc.nextFloat() );

        System.out.println("Enter your height in meters");
        bmi.seHeight( sc.nextFloat() );
    }

    public void printRecord()
    {
        float weight = bmi.getWeight();
        float height = bmi.getHeight();

        float bodyMassIndex = weight / (height * height);
        
        System.out.println("BMI : " + bodyMassIndex);
    }

    public static int menuList( ){
        System.out.println("0.Exit");
        System.out.println("1.Accept Record.");
        System.out.println("2.Print Record");
        System.out.print("Enter choice  : ");
        return sc.nextInt();
      }
}


public class que2 
{
    public static void main(String[] args) 
    {
        int choice;
        BmiCalculator b1 = new BmiCalculator();

        while( (choice = BmiCalculator.menuList()) != 0 )
        {
            switch(choice)
            {
                case 1 : b1.acceptRecord();
                         b1.printRecord();

                         System.out.println("--------------------------------------------------");
                        break;
                case 2 : b1.printRecord();
                         System.out.println("--------------------------------------------------");
                        break;
            }
        }
    }
}
