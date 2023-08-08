public class Motorcycle extends Vehicle {

    public Motorcycle(int numOfWheels, EngineType engineType, double energyAmount) {
        super(numOfWheels, engineType, energyAmount);
    }

    public String getVehicleType(){
        return "Motorcycle";
    }
}
