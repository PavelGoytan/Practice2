package TaskB.Chapter4.Therd;

import java.time.LocalDate;

public class Chamomile extends Flower{

    public Chamomile(String name, int length, LocalDate dateFlower, double price) {
        super(name, length, dateFlower, price);
    }

    @Override
    public String toString() {
        return "Chamomile";
    }
}
