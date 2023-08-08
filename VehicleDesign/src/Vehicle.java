public abstract class Vehicle {

    private int numOfWheels;
    private EngineType engineType;
    private double energyAmount;

    public Vehicle(int numOfWheels, EngineType engineType, double energyAmount) {
        this.numOfWheels = numOfWheels;
        this.engineType = engineType;
        this.energyAmount = energyAmount;
    }

    public int getNumberOfWheels() {
        return numOfWheels;
    }

    public double getAmountOfEnergy() {
        return energyAmount;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public abstract String getVehicleType();

    public String toString() {
        return getVehicleType() + " " + "{" +
                "\n" +
                "\tnumberOfWheels: " + numOfWheels + ",\n" +
                "\tengineType: " + engineType + ",\n" +
                "\tamountOfEnergy: " + energyAmount +
                "\n" +
                "}";
    }
}
