package inharitance;

import java.util.List;

public class InharitanceMain {  // PSVM -----------------------------------------------------------------
    public static void main(String[] args) {

        Engine truckEngine = new Engine(6.0, EngineType.DIESEL, 900);
        Engine busEngine = new Engine(3.5, EngineType.DIESEL, 350);

        Auto bus = new Bus("Mercedes", "Sprinter", busEngine, 30, 75, 12);
        Bus bus2 = new Bus("Mercedes", "Sprinter", busEngine, 30, 75, 12);
        Auto truck = new Truck("Volvo", "V30", truckEngine, 300, 500, 1000);
        Auto car = new ElectricCar("Tesla", "Model S", 100500, 4);

        //Auto auto = new Auto("WV", "Polo", busEngine);

        bus.start();
        bus2.start();
        bus.stop();
        bus2.stop();
        truck.start();
        truck.stop();
        runCar(bus);
        runCar(truck);
        runCar(car);
        // runCar(auto);

    }   // PSVM -----------------------------------------------------------------

    private static void runCar(Auto auto) { // Dynamic Bound
        auto.start();
        auto.stop();
        auto.energize();

    }

}
