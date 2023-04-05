
// class Vehicle{
//     private String vehicleType;
//     private int noOfAxles;
//     private int distance; 
// }

// public class Programer {
//     public static void main(String[] args) {
        
//     }
// }

import java.util.Scanner;

public class TollBoothBillGenerator {
    private String vehicleType;
    private int numAxles;
    private double distanceTraveled;
    private double tollFee;
    private double totalAmountDue;

    public TollBoothBillGenerator() {}

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while (option != 6) {
            System.out.println("1. Enter vehicle type (car, van, bus, or truck)");
            System.out.println("2. Enter number of axles");
            System.out.println("3. Enter distance travelled");
            System.out.println("4. Calculate toll fee");
            System.out.println("5. Generate bill");
            System.out.println("6. Exit");
            System.out.print("Enter option: ");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter vehicle type: ");
                    setVehicleType(scanner.next());
                    break;
                case 2:
                    System.out.print("Enter number of axles: ");
                    setNumAxles(scanner.nextInt());
                    break;
                case 3:
                    System.out.print("Enter distance travelled: ");
                    setDistanceTraveled(scanner.nextDouble());
                    break;
                case 4:
                    calculateTollFee();
                    System.out.println("Toll fee: $" + getTollFee());
                    break;
                case 5:
                    generateBill();
                    System.out.println("Vehicle type: " + getVehicleType());
                    System.out.println("Number of axles: " + getNumAxles());
                    System.out.println("Distance travelled: " + getDistanceTraveled());
                    System.out.println("Toll fee: $" + getTollFee());
                    System.out.println("Processing fee: $2.00");
                    System.out.println("Total amount due: $" + getTotalAmountDue());
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
        scanner.close();
    }

    private void calculateTollFee() {
        if (vehicleType.equals("car") || vehicleType.equals("van") || vehicleType.equals("bus")) {
            tollFee = 0.25 * numAxles * distanceTraveled;
        } else if (vehicleType.equals("truck")) {
            tollFee = 0.5 * numAxles * distanceTraveled;
        }
    }

    private void generateBill() {
        calculateTollFee();
        totalAmountDue = tollFee + 2.0;
    }

    // Getter and setter methods
    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getNumAxles() {
        return numAxles;
    }

    public void setNumAxles(int numAxles) {
        this.numAxles = numAxles;
    }

    public double getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(double distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public double getTollFee() {
        return tollFee;
    }

    public double getTotalAmountDue() {
        return totalAmountDue;
    }
}
