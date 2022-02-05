package TaskB.Chapter9;

public class Runner {
    public static void main(String[] args) {
        TaskB6 parking = new TaskB6(10);

        for (int i = 0; i < 11; i++) {
            parking.arriveCar();
        }
        parking.leaveCar();
        parking.leaveCar();
        for (int i = 0; i < parking.getParking().size(); i++) {
            System.out.println(parking.getParking().get(i));
        }
    }
}
