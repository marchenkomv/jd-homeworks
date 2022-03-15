package synchronization;

public class Main {
    public static void main(String[] args) {
        Dealership dealership = new Dealership();
        new Thread(null, dealership::sellCar, "Покупатель1").start();
        new Thread(null, dealership::sellCar, "Покупатель2").start();
        new Thread(null, dealership::sellCar, "Покупатель3").start();
        new Thread(null, dealership::addCar, "Toyota").start();
    }
}
