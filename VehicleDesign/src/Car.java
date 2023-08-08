public class Car extends Vehicle {

    public Car(int numOfWheels, EngineType engineType, double energyAmount) {
        super(numOfWheels, engineType, energyAmount);
    }

    public String getVehicleType() {
        return "Car";
    }

}