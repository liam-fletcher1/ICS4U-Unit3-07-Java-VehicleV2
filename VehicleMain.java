/*
 * The Vehicle V2 Program
 *
 * @author  Liam Fletcher
 * @version 1.0
 * @since   2021-12-15
 */

// Import the Scanner class
import java.util.Scanner;

public class VehicleMain {

    public static void main(String[] args) {

        // create scanner object
        Scanner userInput = new Scanner(System.in);

        try {
            // bike colour
            System.out.println("Enter the colour for your bike: ");
            String bcolourChoice = userInput.nextLine();

            // bike with colour choice
            Bike userBike = new Bike(bcolourChoice);

            // truck colour
            System.out.println("Enter the colour for your truck: ");
            String tcolourChoice = userInput.nextLine();

            // truck with colour choice
            Truck userTruck = new Truck(tcolourChoice);

            // bike and truck colours
            System.out.println();
            System.out.println("Your bikes colour is: " + userBike.getColour());
            System.out.println("Your trucks colour is: " + userTruck.getColour());
            System.out.println();

            //honking horns
            System.out.println("Honking the horns of your bike and truck");
            System.out.println();
            System.out.println("Truck: " + userTruck.callHonk());
            System.out.println("Bike: " + userBike.callBell());
            System.out.println();

            //riding the bike
            System.out.println("How fast would you like" +
                " to bike (km/h)");
            float bikeSpeed = userInput.nextFloat();
            userBike.accelerate(bikeSpeed);

            // printing speed
            System.out.println("You accelerate to " + userBike.currentSpeed() +
                " km/h");

            // printing speed
            System.out.println("Current cadence: " + userBike.getCadence() +
                " RPM");

            // slow down
            System.out.println();
            System.out.println("How many km/h's do you " +
                "slow down by on your bike?: ");
            float bikeSlow = userInput.nextFloat();
            userBike.brake(bikeSlow);

            // printing speed
            System.out.println("Your current speed: " + userBike.currentSpeed() +
                " km/h on your bike");

            // printing cadence
            System.out.println("Current cadence: " + userBike.getCadence() +
                " RPM");

            // begin truck sequence
            System.out.println();
            System.out.println("" +
                " How much do you accelerate by in your truck?");
            float truckSpeed = userInput.nextFloat();
            userTruck.accelerate(truckSpeed);

            // printing speed
            System.out.println("You accelerate to " + userTruck.currentSpeed() +
                " km/h in your truch");

            // slow down
            System.out.println();
            System.out.println("How many km/h's do you " +
                "slow down by in your truck?: ");
            float truckSlow = userInput.nextFloat();
            userTruck.brake(truckSlow);

            // printing speed
            System.out.println("Your current speed: " + userTruck.currentSpeed() +
                " km/h in your truck");

            // sequence end
            System.out.println();
            System.out.println("You stop the truck.");

            // catch 
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }
    }
}
