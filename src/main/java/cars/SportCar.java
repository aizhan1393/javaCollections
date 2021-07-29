package cars;

import model.ClassificationOnCarBodyType;
import model.ClassificationOnEngineType;
import model.ClassificationOnFuel;

import java.util.Objects;

public class SportCar extends Car{
    private ClassificationOnEngineType engineType;

    public SportCar(String brand, String model, int price, int fuelCosumption, int maxSpeed, ClassificationOnFuel fuel, ClassificationOnEngineType engineType) {
        super(brand, model, price, fuelCosumption, maxSpeed, fuel);
        this.engineType = engineType;
    }

    public ClassificationOnEngineType getEngineType() {
        return engineType;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", SportCar{ engineType=" + engineType + '}');
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SportCar)) return false;
        if (!super.equals(o)) return false;
        SportCar sportCar = (SportCar) o;
        return engineType == sportCar.engineType;
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), engineType);
    }
}

