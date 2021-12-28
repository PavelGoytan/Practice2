package TaskB.Chapter4.Therd;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FlowerShopRun {
    public static void main(String[] args) {
        Rose rose1  = new Rose("Rose",30, LocalDate.now(),2.3,"RED");
        Tulips tulips1 = new Tulips("Tulip",20
                ,LocalDate.of(2021,12,27),1.9,"YELLOW");
        Chamomile chamomile = new Chamomile("Chamomile",20
                ,LocalDate.of(2021,12,26),0.8);
        List<Object> bouquet = new ArrayList<>();
        bouquet.add(rose1);
        bouquet.add(tulips1);
        bouquet.add(chamomile);

        System.out.println(rose1.getPrice());

    }
}
