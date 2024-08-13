package MissionImpossible_Vehicle;

public class Vehicle {

    private  String brandName;
    private  TypeFuel typeFuel;


    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public TypeFuel getTypeFuel() {
        return typeFuel;
    }

    public void setTypeFuel(TypeFuel typeFuel) {
        this.typeFuel = typeFuel;
    }

    public Vehicle(String brandName, TypeFuel typeFuel) {
        this.brandName = brandName;
        this.typeFuel = typeFuel;
    }
}
