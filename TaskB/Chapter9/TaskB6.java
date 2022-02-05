package TaskB.Chapter9;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

/**
 * Реализовать класс, моделирующий работу N-местной автостоянки. Машина
 * подъезжает к определенному месту и едет вправо, пока не встретится сво-
 * бодное место. Класс должен поддерживать методы, обслуживающие приезд
 * и отъезд машины.
 */
public class TaskB6 {
    private int size;
    private int count;
    private int index = 0;
    private ArrayList<Integer> parking;

    public TaskB6(int size) {
        this.size = size;
        this.count = size;
        this.parking = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            parking.add(0);
        }
        System.out.println("Parking for " + size + " places");
    }

    public void arriveCar() {

        if (count == 0) {
            System.out.println("There are no more empty places!");
        } else {
            int size = getSize();
            boolean b = false;
            int k;
            while (!b) {
                Random random = new Random();
                k = random.nextInt(size);
                index = k;
                b = parking.get(index) == 0;
            }
            parking.set(index,1);
            this.count -= 1;
            System.out.println("One car arrives. There are " + count + " empty places");
        }

    }

    public void leaveCar() {
        if (count == size) {
            System.out.println("Parking is empty at all!");
        } else {
            int size = getSize();
            boolean b = false;
            int k;
            while (!b) {
                Random random = new Random();
                k = random.nextInt(size);
                index = k;
                b = parking.get(index) == 1;
            }
            parking.set(index,0);
            this.count += 1;
            System.out.println("One car leave. There are " + count + " empty places");
        }

    }

    @Override
    public String toString() {
        return "TaskB6{" +
                "parking=" + parking +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskB6 taskB6 = (TaskB6) o;
        return size == taskB6.size && Objects.equals(parking, taskB6.parking);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, parking);
    }

    public int getSize() {
        return size;
    }

    public ArrayList<Integer> getParking() {
        return parking;
    }

}
