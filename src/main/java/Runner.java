import java.util.Arrays;
import java.util.List;
import cars.*;
import model.ClassificationOnCarBodyType;
import model.ClassificationOnEngineType;
import model.ClassificationOnFuel;

import static java.util.Arrays.asList;

public class Runner {
    static List<Car> cars = asList(
            new LuxuryCar("Audi", "A8", 80000, 90, 220, ClassificationOnFuel.PETROL, ClassificationOnCarBodyType.SEDAN),
            new LuxuryCar("Hyundai", "Equus", 75000, 80, 220, ClassificationOnFuel.DIESELFUEL, ClassificationOnCarBodyType.SEDAN),
            new SportCar("BMW", "M3", 100000, 120, 300, ClassificationOnFuel.DIESELFUEL, ClassificationOnEngineType.SIXCYLINDER),
            new MiddleCar("Kia", "Optima", 70000, 80, 200, ClassificationOnFuel.PETROL, ClassificationOnCarBodyType.HATCHBACK),
            new CompactCar("Volkswagen", "Golf", 40000, 40, 180, ClassificationOnFuel.GAS, ClassificationOnCarBodyType.HATCHBACK),
            new CompactCar("Ford", "Focus", 50000, 40, 200, ClassificationOnFuel.PETROL, ClassificationOnCarBodyType.SEDAN),
            new FamilyCar("Chrysler", "200", 60000, 70, 220, ClassificationOnFuel.GAS, 7),
            new SportCar("Audi", "S3", 120000, 120, 330, ClassificationOnFuel.PETROL, ClassificationOnEngineType.BOXER));

    public static void main(String[] args) {
        TaxiStation taxiStation = new TaxiStation(cars);
        System.out.println("Taxi station costs  " + taxiStation.getTaxiStationPrice() + "$.");
        System.out.println("Taxi station's cars are sorted by fuel consumption: " + taxiStation.sortByFuelConsumption().toString());
        System.out.println("Car with max speed ranged 290 - 300 km/hour: " + taxiStation.getCarWithSpeedRange(290, 310).toString());
    }
}
