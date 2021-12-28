package TaskB.Chapter4.Second;

import java.util.Objects;

public class Engine {
    private String name;
    private int power;
    private double volum;

    public Engine(String name, int power, double volum) {
        this.name = name;
        this.power = power;
        this.volum = volum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return power == engine.power && Double.compare(engine.volum, volum) == 0 && Objects.equals(name, engine.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, power, volum);
    }

    public int getPower() {
        return power;
    }

    public double getVolum() {
        return volum;
    }
}
