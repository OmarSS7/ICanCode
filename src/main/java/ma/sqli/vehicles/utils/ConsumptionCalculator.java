package ma.sqli.vehicles.utils;

import ma.sqli.vehicles.common.Vehicle;

public class ConsumptionCalculator {

    public static Double calculate(Vehicle vehicle, double distance){
        return vehicle.getFuelType().getConsumption() * distance / 100;
    }
}
