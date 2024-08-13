package MissionImpossible_Vehicle;

public class Parking implements ParkCar{
    private Car[] car;

    public Parking(Car[] car) {
        this.car = car;
    }

    public Car[] getCar() {
        return car;
    }

    @Override
    public void ParkCar() {

    }

    public void setCar(Car[] car) {
        this.car = car;
    }
}
