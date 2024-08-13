package MissionImpossible_Vehicle;

public class Main {
    public static void main(String[] args) {
        AirPlane A1=new AirPlane("A100",TypeFuel.whitePetrol,Status.Delay);
        AirPlane A2=new AirPlane("A110",TypeFuel.whitePetrol,Status.Onboard);
        AirPlane A3=new AirPlane("A120",TypeFuel.whitePetrol,Status.OnTime);
        Helicopters H1=new Helicopters("H100",TypeFuel.whitePetrol,TypeFly.Horizontal);
        Car C1=new Car("BMW",TypeFuel.Petrol,CarClassification.Coupe);
        Car C2=new Car("KIA",TypeFuel.Diesel,CarClassification.Suv);
        AirPlane[] airPlanes=new AirPlane[]{A1,A2,A3};
        Helicopters[ ] helicopters=new Helicopters[]{H1};
        Car[] cars=new Car[]{C1,C2};
        Parking P1=new Parking(cars);

        AirPort IKA=new AirPort(airPlanes,helicopters,P1);




    }
}
