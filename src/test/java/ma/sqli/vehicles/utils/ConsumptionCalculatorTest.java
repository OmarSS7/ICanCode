package ma.sqli.vehicles.utils;

import ma.sqli.vehicles.common.Vehicle;
import org.junit.Assert;
import org.junit.Test;

public class ConsumptionCalculatorTest {

    @Test
    public void testCalculate(){
        Vehicle vehicle = new Vehicle("CAR:Hybrid:4");
        Assert.assertEquals(new Double(3.0) , ConsumptionCalculator.calculate(vehicle, 100));
    }
}
