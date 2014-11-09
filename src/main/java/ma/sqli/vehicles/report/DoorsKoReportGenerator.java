package ma.sqli.vehicles.report;

import ma.sqli.vehicles.common.Vehicle;
import ma.sqli.vehicles.door.Door;
import ma.sqli.vehicles.door.DoorFactory;

public class DoorsKoReportGenerator extends AbstractReportGenerator implements ReportGenerator {

    public DoorsKoReportGenerator(Vehicle vehicle, String doorsInput, String distanceInput) {
        super(vehicle, doorsInput, distanceInput);
    }

    @Override
    public String render() {

        StringBuilder canvas = new StringBuilder();
        canvas.append("DOORS KO, BLOCKED \n");
        canvas.append("  _\n");
        for (int position=1; position<=vehicle.getNumberOfDoors(); position++){
            if(position<vehicle.getNumberOfDoors()){
                canvas.append(" ");
            } else {
                canvas.append("_");
            }
            Door door = DoorFactory.getDoorState(doorsInput, position);
            canvas.append(door.draw());
            if(position==2){
                canvas.append("\n");
            }
        }
        return canvas.toString();
    }
}
