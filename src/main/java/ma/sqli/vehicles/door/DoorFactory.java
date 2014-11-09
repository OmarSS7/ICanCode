package ma.sqli.vehicles.door;

public class DoorFactory {

    private DoorFactory(){}

    public static Door getDoorState(String doorsInput, int position){
        Door door;
        if(doorsInput.contains(String.valueOf(position))){
            door = new ClosedDoorState(position);
        } else {
            door = new OpenDoorState(position);
        }
        return door;
    }
}
