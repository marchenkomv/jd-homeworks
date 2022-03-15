package synchronization.task1;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private List<Car> cars = new ArrayList<>(10);
    private int soldCars = 0;
    private final long CAR_DELIVERY_TIME = 3000;
    private Seller seller = new Seller(this);


    public List<Car> getCars() {
        return cars;
    }

    public int getSoldCars() {
        return soldCars;
    }

    public void addSoldCar() {
        soldCars++;
    }

    public void sellCar() {
        seller.sellCar();
    }

    public void addCar() {
        while (soldCars < 10 && cars.size() < 10) {
            try {
                Thread.sleep(CAR_DELIVERY_TIME);
                seller.acceptCar();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
