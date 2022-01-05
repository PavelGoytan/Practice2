package TaskB.Chapter4.Four;

import java.util.ArrayList;
import java.util.List;

public class Salad {
    private List<Vegetables> vegetablesList;
    public Salad() {
        System.out.println("New SALAD");
        this.vegetablesList = new ArrayList<>();
    }
    public void addVegetables(Vegetables vegetables){
        System.out.println("Add Veg");
        double weightOf = 0.1;
        this.vegetablesList.add(vegetables);
        vegetables.takeVegetables(weightOf);
    }


    @Override
    public String toString() {
        String saladName = "";
        for (Vegetables vegetables : vegetablesList) {
            saladName+= vegetables.getName();
        }
        return "Salad with "+saladName;
    }
}
