package ma.sqli.vehicles.report;

import ma.sqli.vehicles.common.Vehicle;

public abstract class AbstractReportGenerator {

    protected Vehicle vehicle;
    protected String doorsInput;
    protected String distanceInput;

    public AbstractReportGenerator(Vehicle vehicle, String doorsInput, String distanceInput){
        this.vehicle = vehicle;
        this.doorsInput = doorsInput;
        this.distanceInput = distanceInput;
    }

}
