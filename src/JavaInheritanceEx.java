/**
 * @author Abhishek Jain
 *
 * Problem
 * How we can enforce child class to provide values to parent class variables.
 *
 * Solution
 * In some application we want child class to provide values for parent class,
 * because for some calculation or logic we want common logic in parent class
 * for all sub classes depending upon the variable values from each sub class.
 * So to fulfill this case, we want to enforce subclass to provide values for parent class variables otherwise
 * it cannot extends parent class.
 *
 * Example-
 * Suppose we are working on a ‘TravelTimeCalculation’ project in which,
 * we want to calculate travel time through vehicle speed and distance.
 * For this formula is
 *
 * Time = Distance/Speed
 *
 * Check this code for more clarity.
 */

class ModeOfTravel{
    double travelDistance;
    double vehicleSpeed;
    double timeDuration = 0.0;

    //travelDistance, vehicleSpeed value is storing for each object.
    public ModeOfTravel(double travelDistance, double vehicleSpeed) {
        this.vehicleSpeed = vehicleSpeed;
        this.travelDistance = travelDistance;
    }

    //common logic/calculation for all sub classes, input values we are taking in constructor.
    public double getTravelTime()
    {
        try {
            timeDuration = travelDistance/vehicleSpeed;
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally
        {
            return timeDuration;
        }
    }
}

//Subclass Train extends parent class ModeOfTravel
class Train extends ModeOfTravel{
    //in the time of object creation collection values and passing same to parent class.
    Train(double travelDistance, double vehicleSpeed) {
        super(travelDistance, vehicleSpeed);
    }
}

//Subclass Bus extends parent class ModeOfTravel
class Bus extends ModeOfTravel{
    //in the time of object creation collection values and passing same to parent class.
    Bus(double travelDistance, double vehicleSpeed) {
        super(travelDistance, vehicleSpeed);
    }
}

//Subclass Taxi extends parent class ModeOfTravel
class Taxi extends ModeOfTravel{
    //in the time of object creation collection values and passing same to parent class.
    Taxi(double travelDistance, double vehicleSpeed) {
        super(travelDistance, vehicleSpeed);
    }
}
public class JavaInheritanceEx {
    public static void main(String[] args) {
        int totalDistance = 600;

        Train train = new Train(totalDistance, 110);
        System.out.println("\nTotal Travel time by Train is " + train.getTravelTime());

        Bus bus = new Bus(totalDistance, 60);
        System.out.println("\nTotal Travel time by Bus is " + bus.getTravelTime());

        Taxi taxi = new Taxi(totalDistance, 80);
        System.out.println("\nTotal Travel time by Taxi is " + taxi.getTravelTime());
    }
}
