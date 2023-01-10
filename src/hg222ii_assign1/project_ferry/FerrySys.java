package hg222ii_assign1.project_ferry;

import java.util.ArrayList; 
import java.util.Iterator;

public class FerrySys implements Ferry {

    protected int totalPassengers = 0;
    protected int vehicleSpace = 0;
    protected int cost = 0;

    private ArrayList<Passenger> passengers = new ArrayList<Passenger>();
    private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

    @Override
    public int countPassengers() { // Number of passengers on board
        return this.totalPassengers;
    }  //returns amount of passengers

    @Override
    public int countVehicleSpace() { // Used vehicle space. One car is 1.
        return this.vehicleSpace / 5;
    }

    public int moneyCost() { // Earned money
        int totalCostSum = 0;

        for (Vehicle v : this.vehicles) {
            totalCostSum += v.getTotalCost();

        }

        Passenger p = new Passenger();
        totalCostSum += p.totalPassengerCost() * this.passengers.size();

        this.cost += totalCostSum;

        return this.cost;

    }

    @Override
    public Iterator<Vehicle> iterator() { // Vehicle iterator

        return new VehicleIterator();

    }

    public void embark(Vehicle v) { // Embark vehicle warning if not enough space

        if (this.vehicles.contains(v)) {

            System.err.println("This vehicle has already embarked.");

        } else {

            this.vehicleSpace += v.getTotalSpace();

            if (this.vehicleSpace >= 200) {

                try {
					throw new VehiclePlaceExceededException();
				} catch (VehiclePlaceExceededException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

            }

            this.vehicles.add(v);
            this.totalPassengers += v.getTotalPassengers();
        }
    }

    @Override
    public void embark(Passenger p) throws PassengerPlaceExceededException { 
        // Embarks passenger exception if there's not enough room
        this.totalPassengers++;

        if (this.totalPassengers >= 200) {

            throw new PassengerPlaceExceededException(200);

        } else {
            this.passengers.add(p);

        }

    }

    @Override
    public void disembark() { // Clear (empty) ferry. The money earned remains
        this.passengers.clear();
        this.vehicles.clear();
        this.vehicleSpace = 0;
        this.totalPassengers = 0;

    }

    @Override
    public boolean hasSpaceFor(Vehicle v) { // checks if there's space for a vehicle

        this.vehicleSpace += v.getTotalSpace();

        if (this.vehicleSpace <= 200) {
            this.vehicleSpace -= v.getTotalSpace();
            return true;

        }

        this.vehicleSpace -= v.getTotalSpace();
        return false;
    }

    @Override
    public boolean hasRoomFor(Passenger p) { // true if we can embark vehicle v
        if (this.passengers.size() <= 200) {
            return true;
        }
        return false;
    }

    public String toString() { // ferry status print out

        String str = "Total embarked passengers: " + countPassengers()
                + "\nTotal vehicle space occupied(counted in cars): " + countVehicleSpace() + "\nCost: " + moneyCost()
                + "\n";

        return str;
    }

    public class VehicleIterator implements Iterator<Vehicle> {

        private int index;

        public VehicleIterator() {

            index = 0;
        }

        public boolean hasNext() {
            return index < vehicles.size();
        }

        public Vehicle next() {
            return vehicles.get(index++);
        }

    }


}

