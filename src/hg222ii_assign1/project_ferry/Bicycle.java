package hg222ii_assign1.project_ferry;

public class Bicycle extends Vehicle {

	/**
     * Subclass to superclass Vehicle that contain values and constructor for this
	 * specific object type
	 */
    private static final int maxPassangers = 1;
    private static final int space = 1;
    private static final double vCost = 40;
    private static final double pCost = 0;

    public Bicycle() {

        super(maxPassangers, space, vCost, pCost);

    }

}














//public class Bicycle extends Vehicle implements Ferry{
	
//	private int numberofbike;
//	protected int bikespace=0;
//	//protected int passengerspace=0;
//	
//	ArrayList<Vehicle> bike=new ArrayList<Vehicle>();
//	
//	
//	public Bicycle(String ferryname,int platenumber, String model,int num_of_passenger) {
//		super(ferryname,platenumber, model,num_of_passenger);
//	
//	}
//    
//	public int countMoney() {
//	
//        int bikemoneycount=num_of_passenger*80;
//			
//		return bikemoneycount;
//	}
//	
//	public void embark(Vehicle v) {
//		
//		if(passengerspace<=200&&bikespace<=200)
//		{
//		bike.add(v);
//		vehiclespace=vehiclespace+5;
//		bikespace=bikespace+1;
//		passengerspace=passengerspace+1;
//		}
//		
//				
//		else
//		System.out.println("Maximum number of Vehicles");
//			
//			
//		}
//
//	
//	public String toString()
//	{
//		return Integer.toString(numberofbike);
//		
//	}
//
//	@Override
//	public int countPassengers() {
//		return 0;
//		//TODO
//	}
//
//	
//	public void embark(Passenger p) {
//		
//	}
//
//	@Override
//	public void disembark() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public boolean hasRoomForPassenger() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//}
 