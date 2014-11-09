package ma.sqli.vehicles.report;

import ma.sqli.vehicles.common.Vehicle;
import ma.sqli.vehicles.utils.DoorsChecker;

public class ReportGeneratorFactory {

    private ReportGeneratorFactory(){}

    public static ReportGenerator getReportGenerator(Vehicle vehicle, String doorsInput){
        ReportGenerator reportGenerator;
        if (DoorsChecker.checkAllAreClosed(vehicle, doorsInput)){
            reportGenerator = new DoorsOkReportGenerator();
        } else {
            reportGenerator = new DoorsKoReportGenerator();
        }
        return reportGenerator;
    }
}
