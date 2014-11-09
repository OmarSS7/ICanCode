package ma.sqli.vehicles.door;

public class OpenDoorState extends AbstractDoor implements Door {

    OpenDoorState (int position){
        super(position);
    }

    @Override
    public String draw() {
        return isLocatedAtRight() ? "\\" : "/" ;
    }


}
