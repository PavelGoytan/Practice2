package TaskB.Chapter4.Second;

public class RunSecond {
    public static void main(String[] args) {
        Engine engine = new Engine("one",110,1.8);
        Wheel wheel = new Wheel("winter");
        Car car = new Car(wheel,engine);
        System.out.println(car.getWheel().getName());
        Wheel wheel1 = new Wheel("summer");
        car.changeWheel(wheel1);
        System.out.println(car.getWheel().getName());
        car.drive();
        car.changeOil();
    }
}
