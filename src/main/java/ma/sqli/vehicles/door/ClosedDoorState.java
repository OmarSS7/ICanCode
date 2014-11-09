package ma.sqli.vehicles.door;

public class ClosedDoorState extends AbstractDoor implements Door {

    ClosedDoorState (int position){
        super(position);
    }

    @Override
    public String draw() {
        return "|";
    }
}
