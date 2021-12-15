/* 
 * The Vehicle V2 Program
 *
 * @author  Liam Fletcher
 * @version 1.0
 * @since   2021-12-15
 */

public class Vehicle {

    String colour;
    private float speed;
    private float maxSpeed;

    /**
     * Setting field values with a constructor
     */
    public Vehicle(String colourInput) {
        this.colour = colourInput;
        this.speed = 0;
        this.maxSpeed = 150;
    }

    // setter for colour
    public void setColour(String userColour) {
        colour = userColour;
    }

    // getter for colour
    public String getColour() {
        return colour;
    }


    // Method for getting speed 
    public float currentSpeed() {

        return speed;
    }

    /**
     * Method for accellerating.
     */

    public float accelerate(float accSpeed) {
        if ((speed + accSpeed) < maxSpeed) {
            this.speed = speed + accSpeed;
        } else {
            this.speed = maxSpeed;
        }
        return speed;
    }

    /**
     * Method for decellerating.
     */

    public float brake(float brakeSpeed) {
        if ((speed - brakeSpeed) > 0) {
            this.speed = speed - brakeSpeed;
        } else {
            this.speed = 0;
        }
        return speed;
    }
}
