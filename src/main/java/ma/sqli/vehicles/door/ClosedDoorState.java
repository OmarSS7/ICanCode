package ma.sqli.vehicles.door;

public class ClosedDoorState extends AbstractDoor implements Door {

    ClosedDoorState (int position){
        this.position = position;
    }

    @Override
    public String draw() {
        return "|";
    }
}
