package cars;

import java.util.Objects;
import model.ClassificationOnFuel;

public abstract class Car {
    String brand;
    String model;
    private int price;
    private int fuelCosumption;
    private int maxSpeed;
    private ClassificationOnFuel fuel;

    public Car(String brand, String model, int price, int fuelCosumption, int maxSpeed, ClassificationOnFuel fuel) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.fuelCosumption = fuelCosumption;
        this.maxSpeed = maxSpeed;
        this.fuel = fuel;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public int getFuelCosumption() {
        return fuelCosumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public ClassificationOnFuel getFuel() {
        return fuel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", fuelCosumption=" + fuelCosumption +
                ", maxSpeed=" + maxSpeed +
                ", fuel=" + fuel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return price == car.price &&
                fuelCosumption == car.fuelCosumption &&
                maxSpeed == car.maxSpeed &&
                Objects.equals(brand, car.brand) &&
                Objects.equals(model, car.model) &&
                fuel == car.fuel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, price, fuelCosumption, maxSpeed, fuel);
    }
}
