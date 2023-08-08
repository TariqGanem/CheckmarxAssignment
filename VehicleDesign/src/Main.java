import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car(4, EngineType.Fuel, 20));
        vehicles.add(new Car(4, EngineType.Electric, 0.4));
        vehicles.add(new Motorcycle(2, EngineType.Fuel, 5));
        vehicles.add(new Motorcycle(2, EngineType.Electric, 0.8));

        sortVehicles(vehicles);

        vehicles.forEach(System.out::println);
    }

    private static void sortVehicles(List<Vehicle> vehicles) {
        vehicles.sort((v1, v2) -> {
            if (v1.getEngineType().equals(v2.getEngineType())) {
                return Double.compare(v2.getAmountOfEnergy(), v1.getAmountOfEnergy());
            } else if (v1.getEngineType().equals(EngineType.Fuel)) {
                return -1;
            } else {
                return 1;
            }
        });
    }
}
