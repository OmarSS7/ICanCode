package ma.sqli.vehicles;


import ma.sqli.vehicles.common.Vehicle;
import ma.sqli.vehicles.report.ReportGenerator;
import ma.sqli.vehicles.report.ReportGeneratorFactory;

import java.util.HashMap;
import java.util.Map;

/************
 The aim of the exercise is to pass all the test cases bellow.
 It's about vehicles and their consumption. Each vehicle has a different consumption according to its Fuel type :
  - Diesel: 5%
  - Gasoline: 6%
  - Hybrid: 3%

 A vehicle is displayed as bellow. Please respect the door's numbers as in the schema : 
         _
 door 1 | | door 2
 door 3 |_| door 4

*************/

public class Vehicles {

    private Map<String, Vehicle> vehicles;

    public Vehicles(String vehiclesInput) {
        this.vehicles = new HashMap<String, Vehicle>();
        for (String part:vehiclesInput.split(", ")  ) {
            Vehicle vehicle = new Vehicle(part);
            this.vehicles.put(vehicle.getId(), vehicle);
        }
    }

    public String move(String id, String doorsInput, String distanceInput) {
        Vehicle vehicle = this.vehicles.get(id);
        ReportGenerator report = ReportGeneratorFactory.getReportGenerator(vehicle, doorsInput, distanceInput);
        return report.render();
    }

}
