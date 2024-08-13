package MissionImpossible_Vehicle;

public class AirPort {
    private AirPlane[] airPlanes;
    private Helicopters[] helicopters;
    private Parking parking;

    public AirPlane[] getAirPlanes() {
        return airPlanes;
    }

    public void setAirPlanes(AirPlane[] airPlanes) {
        this.airPlanes = airPlanes;
    }

    public Helicopters[] getHelicopters() {
        return helicopters;
    }

    public void setHelicopters(Helicopters[] helicopters) {
        this.helicopters = helicopters;
    }

    public Parking getParking() {
        return parking;
    }

    public void setParking(Parking parking) {
        this.parking = parking;
    }

    public AirPort(AirPlane[] airPlanes, Helicopters[] helicopters, Parking parking) {
        this.airPlanes = airPlanes;
        this.helicopters = helicopters;
        this.parking = parking;

    }
}
