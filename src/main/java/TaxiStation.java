import cars.*;
import java.util.*;

public class TaxiStation {
    private List<? extends Car> cars;

    public int getTaxiStationPrice(){
        int taxiStationPrice = 0;
        for (Car car: cars){
            taxiStationPrice += car.getPrice();
        }
        return taxiStationPrice;
    }

    public TaxiStation sortByFuelConsumption(){
        Collections.sort(cars, new Comparator<Car>() {
            public int compare(Car o1, Car o2) {
                return o1.getFuelCosumption() - o2.getFuelCosumption();
            }
        });
        return this;
    }

    public Car getCarWithSpeedRange(int minSpeed, int maxSpeed){
        for (Car car: cars) {
            if (car.getMaxSpeed() > minSpeed && car.getMaxSpeed() < maxSpeed) {
                return car;
            }
        }
        return null;
    }

    public List<? extends Car> getCars() {
        return cars;
    }

    @Override
    public String toString() {
        return "TaxiStation{" +
                "cars=" + cars.toString() +
                '}';
    }

    public TaxiStation(List<? extends Car> cars) {
        this.cars = cars;
    }
}
