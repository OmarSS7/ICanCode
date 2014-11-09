package ma.sqli.vehicles.door;

import org.junit.Assert;
import org.junit.Test;

public class DoorTest {

    @Test
    public void testClosedDoorFactory(){
        Door door = DoorFactory.getDoorState("1 2", 1);
        Assert.assertTrue(door instanceof ClosedDoorState);
    }

    @Test
    public void testOpenDoorFactory(){
        Door door = DoorFactory.getDoorState("2", 1);
        Assert.assertTrue(door instanceof OpenDoorState);
    }

    @Test
    public void testDrawClosedDoor(){
        Door door = DoorFactory.getDoorState("1 2", 1);
        Assert.assertEquals("|", door.draw());

        door = DoorFactory.getDoorState("1 2", 2);
        Assert.assertEquals("|", door.draw());
    }

    @Test
    public void testDrawOpenDoor(){
        Door door = DoorFactory.getDoorState("2", 1);
        Assert.assertEquals("/", door.draw());

        door = DoorFactory.getDoorState("1", 2);
        Assert.assertEquals("\\", door.draw());
    }

}
