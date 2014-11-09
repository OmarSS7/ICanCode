package ma.sqli.vehicles.report;

import ma.sqli.vehicles.common.Vehicle;
import ma.sqli.vehicles.utils.ConsumptionCalculator;
import ma.sqli.vehicles.utils.DistanceParser;

import java.util.Locale;

public class DoorsOkReportGenerator extends AbstractReportGenerator implements ReportGenerator {

    public DoorsOkReportGenerator(Vehicle vehicle, String doorsInput, String distanceInput) {
        super(vehicle, doorsInput, distanceInput);
    }

    @Override
    public String render() {
        Double distance = DistanceParser.parse(distanceInput);
        Double consumption = ConsumptionCalculator.calculate(vehicle, distance);
        return String.format(Locale.US, "DOORS OK, MOVING. The %s will consume %.2f L", vehicle.getId(), consumption);
    }
}
