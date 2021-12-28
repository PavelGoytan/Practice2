package TaskB.Chapter4.Therd;

import java.time.LocalDate;

public abstract class Flower {
    private String name;
    private int length;
    private LocalDate dateFlower;
    private double price;

    public Flower(String name, int length, LocalDate dateFlower, double price) {
        this.name = name;
        this.length = length;
        this.dateFlower = dateFlower;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
