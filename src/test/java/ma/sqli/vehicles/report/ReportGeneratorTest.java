package ma.sqli.vehicles.report;

import ma.sqli.vehicles.common.Vehicle;
import org.junit.Assert;
import org.junit.Test;

public class ReportGeneratorTest {

    @Test
    public void testFactory(){
        Vehicle car = new Vehicle("CAR:Hybrid:4");
        Vehicle truck = new Vehicle("TRUCK:Diesel:2");

        ReportGenerator report = ReportGeneratorFactory.getReportGenerator(car, "1 2 3 4", "200 KM");
        Assert.assertTrue(report instanceof DoorsOkReportGenerator);

        report = ReportGeneratorFactory.getReportGenerator(truck, "1 2", "200 KM");
        Assert.assertTrue(report instanceof DoorsOkReportGenerator);

        report = ReportGeneratorFactory.getReportGenerator(car, "1 2 4", "200 KM");
        Assert.assertTrue(report instanceof DoorsKoReportGenerator);

        report = ReportGeneratorFactory.getReportGenerator(truck, "2", "200 KM");
        Assert.assertTrue(report instanceof DoorsKoReportGenerator);
    }


}
