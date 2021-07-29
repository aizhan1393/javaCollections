import model.ClassificationOnCarBodyType;
import model.ClassificationOnEngineType;
import model.ClassificationOnFuel;
import org.junit.Assert;
import cars.*;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaxiStationTest {

    private static List<Car> cars = Arrays.asList(
            new SportCar("BMW", "M3", 100000, 120, 300, ClassificationOnFuel.DIESELFUEL, ClassificationOnEngineType.SIXCYLINDER),
            new FamilyCar("Chrysler", "200", 60000, 70, 220, ClassificationOnFuel.GAS, 7),
            new LuxuryCar("Audi", "A5", 70000, 80, 200, ClassificationOnFuel.GAS, ClassificationOnCarBodyType.HATCHBACK),
            new LuxuryCar("Audi", "A8", 80000, 90, 220, ClassificationOnFuel.PETROL, ClassificationOnCarBodyType.SEDAN),
            new CompactCar("Volkswagen", "Golf3", 50000, 40, 180, ClassificationOnFuel.PETROL, ClassificationOnCarBodyType.HATCHBACK),
            new CompactCar("Volkswagen", "Golf", 40000, 50, 150, ClassificationOnFuel.GAS, ClassificationOnCarBodyType.HATCHBACK),
            new MiddleCar("Kia", "Optima", 70000, 80, 200, ClassificationOnFuel.PETROL, ClassificationOnCarBodyType.HATCHBACK ),
            new SportCar("BMW", "M5", 150000, 150, 300, ClassificationOnFuel.DIESELFUEL, ClassificationOnEngineType.SIXCYLINDER)
    );

    @org.junit.jupiter.api.Test
    void getTaxiStationPrice() {
        TaxiStation taxiStation = new TaxiStation(cars);
        Assert.assertEquals(taxiStation.getTaxiStationPrice(), 620000);
    }

    @org.junit.jupiter.api.Test
    void sortByFuelConsumption() {
        TaxiStation taxiStation = new TaxiStation(cars);
        taxiStation.sortByFuelConsumption();
        List<? extends Car> carsSortedByFuelConsumption = taxiStation.getCars();
        Assert.assertEquals(8, carsSortedByFuelConsumption.size());
        Assert.assertTrue(carsSortedByFuelConsumption.get(0).getFuelCosumption() <= carsSortedByFuelConsumption.get(1).getFuelCosumption());
        Assert.assertTrue(carsSortedByFuelConsumption.get(1).getFuelCosumption() <= carsSortedByFuelConsumption.get(2).getFuelCosumption());
        Assert.assertTrue(carsSortedByFuelConsumption.get(2).getFuelCosumption() <= carsSortedByFuelConsumption.get(3).getFuelCosumption());
        Assert.assertTrue(carsSortedByFuelConsumption.get(3).getFuelCosumption() <= carsSortedByFuelConsumption.get(4).getFuelCosumption());
        Assert.assertTrue(carsSortedByFuelConsumption.get(4).getFuelCosumption() <= carsSortedByFuelConsumption.get(5).getFuelCosumption());
        Assert.assertTrue(carsSortedByFuelConsumption.get(5).getFuelCosumption() <= carsSortedByFuelConsumption.get(6).getFuelCosumption());
        Assert.assertTrue(carsSortedByFuelConsumption.get(6).getFuelCosumption() <= carsSortedByFuelConsumption.get(7).getFuelCosumption());
    }

    @org.junit.jupiter.api.Test
    void getCarWithSpeedRange() {
        TaxiStation taxiStation = new TaxiStation(cars);
        Assert.assertTrue(taxiStation.getCarWithSpeedRange(170, 190).getMaxSpeed() > 170 && taxiStation.getCarWithSpeedRange(170, 190).getMaxSpeed() < 190);
        }
}