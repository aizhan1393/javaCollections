package cars;

import model.ClassificationOnFuel;
import model.ClassificationOnCarBodyType;

import java.util.Objects;

public class FamilyCar extends Car{

    private int passengersCapacity;

    public FamilyCar(String brand, String model, int price, int fuelCosumption, int maxSpeed, ClassificationOnFuel fuel, int passengersCapacity) {
        super(brand, model, price, fuelCosumption, maxSpeed, fuel);
        this.passengersCapacity = passengersCapacity;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", FamilyCar{ passengersCapacity=" + passengersCapacity + '}');
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FamilyCar)) return false;
        if (!super.equals(o)) return false;
        FamilyCar familyCar = (FamilyCar) o;
        return passengersCapacity == familyCar.passengersCapacity;
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), passengersCapacity);
    }
}

