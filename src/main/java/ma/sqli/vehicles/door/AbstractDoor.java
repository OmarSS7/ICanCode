package ma.sqli.vehicles.door;

public abstract class AbstractDoor {

    protected int position;

    protected boolean isLocatedAtRight() {
        boolean right = false;
        if(this.position%2==0){
            right = true;
        }
        return right;
    }
}
