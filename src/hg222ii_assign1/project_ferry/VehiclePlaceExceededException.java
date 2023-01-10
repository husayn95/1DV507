package hg222ii_assign1.project_ferry;
public class VehiclePlaceExceededException extends Exception {
    /*
     * Exception class created to throw No room for vehicle exceptions
     */
    private static final long serialVersionUID = -9049979697539276439L;

    public VehiclePlaceExceededException() {

        super("No room for new vehicles. The maximum place for vehicles will be exceeded."); 
        // message to be thrown when exception is triggered

    }

}

