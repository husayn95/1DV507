package hg222ii_assign1.project_ferry;

public class PassengerPlaceExceededException extends Exception {

	/**
     * Exception class made to throw No room for passenger exceptions
	 */
    private static final long serialVersionUID = -9049979697538276439L;

    public PassengerPlaceExceededException(int maxPassengers) {

        super("No room for new passengers. The maximum place" + maxPassengers + " for passengers will be exceeded."); 
        // message to be thrown when exception is triggered

    }

}
