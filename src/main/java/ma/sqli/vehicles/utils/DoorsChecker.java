package ma.sqli.vehicles.utils;

import ma.sqli.vehicles.common.Vehicle;

public class DoorsChecker {

    public static boolean checkAllAreClosed(Vehicle vehicle, String doorsInput){

        StringBuilder expected = new StringBuilder("");
        for (int door=1; door<=vehicle.getNumberOfDoors(); door++){
            expected.append(door);
            if(door!=vehicle.getNumberOfDoors()){
                expected.append(" ");
            }
        }
        return expected.toString().equals(doorsInput);
    }

}
