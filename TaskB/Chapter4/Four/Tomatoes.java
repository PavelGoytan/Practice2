package TaskB.Chapter4.Four;

import java.time.LocalDate;

public class Tomatoes extends Vegetables {
private double weight;
private final double CALORIES = 100;
private double calorie;

    public Tomatoes(String name, LocalDate dateIn,double weight) {
        super(name, dateIn);
        this.weight = weight;
        this.calorie = CALORIES*weight;
        System.out.println("tomatoes arrive; w = " + weight+"; c = "+ calorie);

    }


    @Override
    public void takeVegetables(double weightOf) {
        this.weight -= Math.min(weight,weightOf) ;
        this.calorie -= Math.min(calorie,CALORIES*weightOf) ;
        System.out.println("it stay in shop veg: w = "+weight+"; c = " + calorie);
    }


}
