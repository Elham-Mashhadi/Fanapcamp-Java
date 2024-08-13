package MissionImpossible_Vehicle;

public class Helicopters extends AirCraft  implements Movable{
    private TypeFly typeFly;

    public Helicopters(String brandName, TypeFuel typeFuel, TypeFly typeFly) {
        super(brandName, typeFuel);
        this.typeFly = typeFly;
    }

    public TypeFly getTypeFly() {
        return typeFly;
    }

    public void setTypeFly(TypeFly typeFly) {
        this.typeFly = typeFly;
    }
    public void move(){
        System.out.println("Moving");
    }
}
