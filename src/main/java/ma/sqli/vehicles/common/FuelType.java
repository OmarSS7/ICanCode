package ma.sqli.vehicles.common;

public enum FuelType {

    DIESEL(5.0),
    GASOLINE(6.0),
    HYBRID(3.0),
    FREE(0.0);

    private double consumption;

    private FuelType(double consumption){
        this.consumption = consumption;
    }

    public double getConsumption() {
        return this.consumption;
    }

}
