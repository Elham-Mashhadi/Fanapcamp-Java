package MissionImpossible_Vehicle;

public class Car extends Vehicle implements Movable,Starting{
 private CarClassification carClassification;

    public CarClassification getCarClassification() {
        return carClassification;
    }

    public void setCarClassification(CarClassification carClassification) {
        this.carClassification = carClassification;
    }

    public Car(String brandName, TypeFuel typeFuel, CarClassification carClassification) {
        super(brandName, typeFuel);
        this.carClassification = carClassification;
    }
    public void move(){
        System.out.println("Moving");
    }
    public void pushStarting(){
        System.out.println("Starting");
    }
}
