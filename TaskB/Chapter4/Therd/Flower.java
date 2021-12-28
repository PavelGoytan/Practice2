package TaskB.Chapter4.Therd;

import java.time.LocalDate;

public class Flower {
    private String name;
    private int length;
    private LocalDate dateFlower;
    private double price;
    private int count;

    public Flower(String name, int length, LocalDate dateFlower, double price) {
        this.name = name;
        this.length = length;
        this.dateFlower = dateFlower;
        this.price = price;
    }
    public void takeFlower(int takeOff){
        this.count -= Math.min(count,takeOff);
    }

    public double getPrice() {
        return price;
    }

    public int getLength() {
        return length;
    }

    public LocalDate getDateFlower() {
        return dateFlower;
    }

    public int getCount() {
        return count;
    }
}
