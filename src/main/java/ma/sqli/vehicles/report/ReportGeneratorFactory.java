package ma.sqli.vehicles.report;

import ma.sqli.vehicles.common.Vehicle;
import ma.sqli.vehicles.utils.DoorsChecker;

public class ReportGeneratorFactory {

    private ReportGeneratorFactory(){}

    public static ReportGenerator getReportGenerator(Vehicle vehicle, String doorsInput, String distanceInput){
        ReportGenerator reportGenerator;
        if (DoorsChecker.checkAllAreClosed(vehicle, doorsInput)){
            reportGenerator = new DoorsOkReportGenerator(vehicle, doorsInput, distanceInput);
        } else {
            reportGenerator = new DoorsKoReportGenerator(vehicle, doorsInput, distanceInput);
        }
        return reportGenerator;
    }
}
