package inharitance;

import java.util.ArrayList;
import java.util.List;

public class Engine {

    private double volume;
    private EngineType engineType;
    private int power;
    private List<Piston> pistons = new ArrayList<>();

    public Engine() {
    }

    public Engine(double volume, EngineType engineType, int power) {
        this.volume = volume;
        this.engineType = engineType;
        this.power = power;
        for (int i = 0; i < 6; i++)
            this.pistons.add(new Piston(0.3, i));
    }

    public List<Piston> getPistons() {
        return pistons;
    }

    public double getVolume() {
        return volume;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", engineType=" + engineType +
                ", power=" + power +
                ", pistons=" + pistons +
                '}';
    }
}
