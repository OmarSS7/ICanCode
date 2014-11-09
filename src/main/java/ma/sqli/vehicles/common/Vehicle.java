package ma.sqli.vehicles.common;

public class Vehicle {

    private String id;
    private FuelType fuelType;
    private int numberOfDoors;

    public Vehicle(String input) throws IllegalArgumentException {
        try {
            String[] parts = input.split(":");
            this.id = parts[0];
            this.fuelType = FuelType.valueOf(parts[1].toUpperCase());
            this.numberOfDoors = Integer.parseInt(parts[2]);
        } catch (Exception e){
            throw new IllegalArgumentException("Valid format: VEHICLE_ID:FUEL_TYPE:NUMBER_OF_DOORS");
        }
    }

    public String getId() {
        return id;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}
