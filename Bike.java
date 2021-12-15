/*
 * The Vehicle V2 Program
 *
 * @author  Liam Fletcher
 * @version 1.0
 * @since   2021-12-15
 */

public class Bike extends Vehicle {
    // Initializing fields
    private float cadence;

    /**
     * Setting field values with a constructor
     */
    public Bike(String bikeColour) {
        super(bikeColour);
        this.colour = bikeColour;
    }

    /**
     * Method for finding cadence.
     */
    public float getCadence() {
        cadence = (currentSpeed() * 8);
        return cadence;
    }

    public String callBell() {
        String bell = ("Ring!");
        return bell;
    }
}
