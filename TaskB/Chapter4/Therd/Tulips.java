package TaskB.Chapter4.Therd;

import java.time.LocalDate;

public class Tulips extends Flower {
    private String color;

    public Tulips(String name, int length, LocalDate dateFlower, double price, String color) {
        super(name, length, dateFlower, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Tulip";
    }
}
