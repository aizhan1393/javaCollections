package cars;

import model.ClassificationOnCarBodyType;
import model.ClassificationOnFuel;

import java.util.Objects;

public class LuxuryCar extends Car{
    private ClassificationOnCarBodyType carBodyType;

    public LuxuryCar(String brand, String model, int price, int fuelCosumption, int maxSpeed, ClassificationOnFuel fuel, ClassificationOnCarBodyType carBodyType) {
        super(brand, model, price, fuelCosumption, maxSpeed, fuel);
        this.carBodyType = carBodyType;
    }

    public ClassificationOnCarBodyType getCarBodyType() {
        return carBodyType;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", LuxuryCar{ carBodyType=" + carBodyType + '}');
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LuxuryCar)) return false;
        if (!super.equals(o)) return false;
        LuxuryCar luxuryCar = (LuxuryCar) o;
        return carBodyType == luxuryCar.carBodyType;
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), carBodyType);
    }
}

