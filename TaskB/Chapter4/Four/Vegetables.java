package TaskB.Chapter4.Four;

import java.time.LocalDate;

public class Vegetables {
    private String name;
    private final double CALORIES = 100;
    private double calorie;
    private double weight;
    private LocalDate dateIn;
    public Vegetables(String name, LocalDate dateIn) {
        this.name = name;
        this.dateIn = dateIn;
    }




    public void takeVegetables(double weightOf){
        this.weight -= Math.min(weight,weightOf) ;
        this.calorie -= Math.min(calorie,CALORIES*weightOf) ;
        System.out.println("it stay in shop veg: w = "+weight+"; c = " + calorie);
    }

    public String getName() {
        return name;
    }



    public double getWeight() {
        return weight;
    }

    public LocalDate getDateIn() {
        return dateIn;
    }
}

