import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         double gallonFuel = 0;
         double miles_Per_Gallon = 0;
         double price_of_Fuel = 0;
         boolean CostValid = false;
         boolean MPGValid = false;
         boolean GallonValid = false;
         double fuelCost;
         double distanceLeft;

         Scanner scan = new Scanner(System.in);


         do {
             System.out.println("What is the cost of fuel right now?");
            if (scan.hasNextDouble()) {
                price_of_Fuel = scan.nextDouble();
                if (price_of_Fuel > 0 && price_of_Fuel <= 10) {
                    CostValid = true;
                } else {
                    scan.nextLine();
                    System.out.println("You did not enter a valid fuel price " + price_of_Fuel);
                }
            }
            else {
                scan.nextLine();
                System.out.println("Please enter a valid gas price between 0 and 10 dollars");
            }


         } while (!CostValid);
        do {
            System.out.println("How many miles per gallon does your car get");
            if (scan.hasNextDouble()) {
                miles_Per_Gallon = scan.nextDouble();
                if (miles_Per_Gallon >= 1 && miles_Per_Gallon <= 261) {
                   MPGValid = true;
                }
                else {
                    scan.nextLine();
                    System.out.println("You did not enter a valid mpg " + miles_Per_Gallon);
                }
            }
            else  {
                scan.nextLine();
                System.out.println("You did not enter a valid mpg please enter a number between 1-261");
                }

        } while (!MPGValid);

        do {
            System.out.println("How many gallons do you have in your car right now");
            if (scan.hasNextDouble()) {
                gallonFuel = scan.nextDouble();
                if (gallonFuel >= 0 && gallonFuel <= 48) {
                    GallonValid = true;
                }
                else {
                    scan.nextLine();
                    System.out.println("You did not enter a valid amount gallons " + gallonFuel);
                }
            }
            else {
                scan.nextLine();
                System.out.println("You did not enter a valid Gallons of fuel in your car please enter a number between 0-48");
            }

        } while (!GallonValid);

        //calculations
        fuelCost = (100 * price_of_Fuel) / miles_Per_Gallon;
        distanceLeft = gallonFuel * miles_Per_Gallon;

        //print
        System.out.printf("%-13s %6.2f","The cost for 100 miles is ", fuelCost);
        System.out.printf("\n%-11s %6.2f","Distance left in Miles ", distanceLeft);
    }
}