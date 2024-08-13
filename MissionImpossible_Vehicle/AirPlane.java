package MissionImpossible_Vehicle;

public class AirPlane extends AirCraft implements Movable {
    private Status status;

    public AirPlane(String brandName, TypeFuel typeFuel, Status status) {
        super(brandName, typeFuel);
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    public void move(){
        System.out.println("Moving");
    }
}
