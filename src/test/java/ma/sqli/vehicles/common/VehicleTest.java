package ma.sqli.vehicles.common;

import org.junit.Assert;
import org.junit.Test;

public class VehicleTest {

    @Test
    public void testVehicleConstructor() {

        Vehicle vehicle = new Vehicle("CAR:Hybrid:4");

        Assert.assertEquals("CAR", vehicle.getId());
        Assert.assertEquals(FuelType.HYBRID, vehicle.getFuelType());
        Assert.assertEquals(4, vehicle.getNumberOfDoors());

        Vehicle truck = new Vehicle("TRUCK:Diesel:2");

        Assert.assertEquals("TRUCK", truck.getId());
        Assert.assertEquals(FuelType.DIESEL, truck.getFuelType());
        Assert.assertEquals(2, truck.getNumberOfDoors());

        Vehicle motorcycle = new Vehicle("MOTORCYCLE:Gasoline:0");

        Assert.assertEquals("MOTORCYCLE", motorcycle.getId());
        Assert.assertEquals(FuelType.GASOLINE, motorcycle.getFuelType());
        Assert.assertEquals(0, motorcycle.getNumberOfDoors());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIllegalVehicleConstructorArgument() {
        Vehicle vehicle = new Vehicle("BOB:MARLEY");
    }
}
