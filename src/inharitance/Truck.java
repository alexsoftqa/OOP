package inharitance;

public class Truck extends FuelAuto {

    private int cargoWeight;

    public Truck(String producer, String model, Engine engine, int availablePetrol, int tankVolume, int cargoWeight) {
        super(producer, model, engine, availablePetrol, tankVolume);
        this.cargoWeight = cargoWeight;
        System.out.println("Constructing Truck");
    }

    public void load() {
        System.out.println("Cargo Loaded");
    }

    public void unload() {
        System.out.println("Cargo Unloaded");
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    @Override
    public void start() {
        isRunning = true;
        setCurrentSpeed(10);
        System.out.println("Truck is starting");
    }

    @Override
    public void stop() {
        isRunning = false;
        setCurrentSpeed(0);
        System.out.println("Truck has stopped");
    }

    @Override
    public void energize() {
        fuelUp(getTankVolume() - getAvailablePetrol());
    }
}
