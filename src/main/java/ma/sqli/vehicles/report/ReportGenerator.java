package ma.sqli.vehicles.report;

import ma.sqli.vehicles.common.Vehicle;

public interface ReportGenerator {
    String render(Vehicle vehicle, String doorsInput, String distanceInput);
}
