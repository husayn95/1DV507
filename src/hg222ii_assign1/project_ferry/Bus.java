package hg222ii_assign1.project_ferry;

public class Bus extends Vehicle {

	/*
     * Subclass to superclass Vehicle that contain values and constructor for this
	 * specific object type
	 */
    private static int maxPassangers = 20;
    private static int space = 20;
    private static double vCost = 100;
    private static double pCost = 10;

    public Bus() {

        super(maxPassangers, space, vCost, pCost);

    }

}