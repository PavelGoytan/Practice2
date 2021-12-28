package TaskB.Chapter4.Therd;

import java.time.LocalDate;

public class Tulips extends Flower {
    private String color;
    private int count=10;

    public Tulips(String name, int length, LocalDate dateFlower, double price, String color) {
        super(name, length, dateFlower, price);
        this.color = color;
    }

    @Override
    public void takeFlower(int takeOff) {
        this.count -= Math.min(count,takeOff);
    }

    @Override
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Tulip";
    }
}
