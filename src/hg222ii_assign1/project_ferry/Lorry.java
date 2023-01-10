package hg222ii_assign1.project_ferry;

public class Lorry extends Vehicle {

	/**
     * Subclass to superclass Vehicle that contain values and constructor for this
	 * specific object type
	 */
    private static int maxPassangers = 2;
    private static int space = 40;
    private static double vehicleCost = 300;
    private static double passengerCost = 15;

    public Lorry() {

        super(maxPassangers, space, vehicleCost, passengerCost);

    }

}