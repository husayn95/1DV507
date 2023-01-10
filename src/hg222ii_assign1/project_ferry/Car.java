package hg222ii_assign1.project_ferry;

public class Car extends Vehicle {

	/**
     * Subclass to superclass Vehicle that contain values and constructor for this
	 * specific object type
	 */
    private static final int maxPassangers = 4;
    private static final int space = 5;
    private static double vehicleCost = 100;
    private static double passengerCost = 15;

    public Car() {

        super(maxPassangers, space, vehicleCost, passengerCost);

    }

}
 
