package hg222ii_assign1.project_ferry;

import java.util.ArrayList;

/**
 * Class constructing <code>Vehicles</code>
 */

public class Vehicle {

    private int maxPassengers = 0;
    private int space = 0;
    private double vehicleCost = 0;
    private double passengerCost = 0;

    ArrayList<Passenger> passengers = new ArrayList<Passenger>();

    public Vehicle(int maxPassengers, int space, double costVehicle, double costPassenger) {

        this.maxPassengers = maxPassengers;
        this.space = space;
        this.vehicleCost = costVehicle;
        this.passengerCost = costPassenger;
    }

    /**
     * Method adding <code>Passangers</code> to vehicle
     * Throws <code>PassengerPlaceExceededException</code>
     */
    public void addPassenger(Passenger passenger) throws PassengerPlaceExceededException {

        if (this.maxPassengers > this.passengers.size()) {

            passengers.add(passenger);

        } else {

            throw new PassengerPlaceExceededException(maxPassengers);
        }
    }

    /**
     * gets total cost of vehicle with passengers
     * @return double
     */
    public double getTotalCost() {
       return this.vehicleCost + (this.passengers.size() * this.passengerCost);
}

    /**
     * gets total amount of passengers in vehicle
     * @return int
     */
    public int getTotalPassengers() {
        return this.passengers.size();
    }

    /**
     * gets the total amount of space that the vehicle occupies
     */
    public int getTotalSpace() {
        return this.space;
    }

    
    /**
     * Make a print out
     * @return String
     */
    public String toString() {

        StringBuffer sb = new StringBuffer();

        sb.append("Passengers: " + passengers.size() + " ");
        sb.append("Cost vehicle: " + vehicleCost + " ");
        sb.append("Cost passengers:" + passengerCost * passengers.size() + " ");

        return sb.toString();

    }

}