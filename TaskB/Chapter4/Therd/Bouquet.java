package TaskB.Chapter4.Therd;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bouquet {
    private  List<Flower> bouquet;
    public Bouquet() {
        this.bouquet = new ArrayList<>();
    }

    public void priceBouquet() {
        double sum = 0;
        for (Flower flower : bouquet) {
            sum+=flower.getPrice();
        }
        System.out.println(sum);
    }
    public  void sortFlowers() {
        bouquet.sort(Comparator.comparing(Flower::getDateFlower));
        System.out.println(bouquet);
    }
    public  void shorterFlower(Bouquet bouquet) {
        for (Flower flower : bouquet.getBouquet()) {
            if(flower.getLength()<29){
                System.out.print(flower + " ");
            }
        }
        System.out.println();
    }
    public void getFlowers(Flower flower) {
        this.bouquet.add(flower);
        int takeOff = 1;
        flower.takeFlower(takeOff);
        System.out.println("В магазине осталось " + flower.getCount() + " цветов");
    }

    public List<Flower> getBouquet() {
        return bouquet;
    }
}
