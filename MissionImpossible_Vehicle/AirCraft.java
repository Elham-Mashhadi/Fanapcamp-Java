package MissionImpossible_Vehicle;

public class AirCraft extends Vehicle implements Flyable{
    public void takeoff(){
        System.out.println("takeOff");
    }
    public void landing(){
        System.out.println("LAnding");
    }
    public AirCraft(String brandName,TypeFuel typeFuel){
        super(brandName,typeFuel);
    }

}
