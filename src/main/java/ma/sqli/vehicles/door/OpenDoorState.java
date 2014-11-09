package ma.sqli.vehicles.door;

public class OpenDoorState extends AbstractDoor implements Door {

    OpenDoorState (int position){
        this.position = position;
    }

    @Override
    public String draw() {
        return isLocatedAtRight() ? "\\" : "/" ;
    }


}
