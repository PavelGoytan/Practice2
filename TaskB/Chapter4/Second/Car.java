package TaskB.Chapter4.Second;

/**
 * ехать, заправляться, менять колесо, вывести на консоль марку ав-
 * томобиля
 */
public class Car {
    private String name;
    private Wheel wheel;
    private Engine engine;

    public Car(Wheel wheel, Engine engine) {
        this.wheel = wheel;
        this.engine = engine;
        if (engine.getPower() == 110) {
            this.name = "Opel";
        } else {
            this.name = "Citroen";
        }
        System.out.println("Car is " + name);
    }

    public void drive() {
        System.out.println(name + " is driving");
    }

    public void changeOil() {
        System.out.println(name + " is changing oil");
    }

    public Wheel changeWheel(Wheel wheelOther) {
        System.out.println(name + " is changing wheel");
        this.wheel = wheelOther;
        return wheel;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public Engine getEngine() {
        return engine;
    }
}
