package ma.sqli.vehicles.door;

public abstract class AbstractDoor {

    protected int position;

    public AbstractDoor(int position){
        this.position = position;
    }

    protected boolean isLocatedAtRight() {
        boolean right = false;
        if(this.position%2==0){
            right = true;
        }
        return right;
    }
}
