package TaskB.Chapter4.Therd;

import java.time.LocalDate;


public class FlowerShopRun {
    public static void main(String[] args) {
        Rose rose1  = new Rose("Rose",30, LocalDate.now(),2.3,"RED");
        Tulips tulips1 = new Tulips("Tulip",20
                ,LocalDate.of(2021,11,27),1.9,"YELLOW");
        Chamomile chamomile = new Chamomile("Chamomile",20
                ,LocalDate.of(2021,12,26),0.8);
        Bouquet bouquet = new Bouquet();
        bouquet.getFlowers(rose1);
        bouquet.getFlowers(tulips1);
        bouquet.getFlowers(chamomile);
        bouquet.shorterFlower(bouquet);
        bouquet.sortFlowers();
        bouquet.priceBouquet();


    }




}
