package ma.sqli.vehicles.utils;

import ma.sqli.vehicles.common.Vehicle;
import org.junit.Assert;
import org.junit.Test;

public class DoorsCheckerTest {

    @Test
    public void testCheck(){

        Vehicle vehicle = new Vehicle("CAR:Hybrid:4");
        String expected  = "1 2 3 4";

        Assert.assertTrue(DoorsChecker.checkAllAreClosed(vehicle, expected));

        Vehicle truck = new Vehicle("TRUCK:Hybrid:2");
        expected  = "1 2";

        Assert.assertTrue(DoorsChecker.checkAllAreClosed(truck, expected));
    }

}
