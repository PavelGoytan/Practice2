package TaskB.Chapter5;

/**
 * Создать класс Payment с внутренним классом, с помощью объектов кото-
 * рого можно сформировать покупку из нескольких товаров.
 */
public class Payment {
    public  void buyGoods(){
        String list = "";
        double sum = 0;
        for (int i = 0; i < 3; i++) {
            Goods goods = new Goods("good"+i,0.5+i);
            System.out.println(goods);
            list += goods.getName() +"-" + goods.getPrace()+" byn"+"\n";
            sum += goods.getPrace();
        }
        System.out.println(list);
        System.out.println("Total price: "+sum+" byn");


    }

    class Goods{
        private String name;
        private  double prace;

        public Goods(String name, double prace) {
            this.name = name;
            this.prace = prace;
        }

        public String getName() {
            return name;
        }

        public double getPrace() {
            return prace;
        }

        @Override
        public String toString() {
            return "Goods{" +
                    "name='" + name + '\'' +
                    ", prace=" + prace +
                    '}';
        }
    }
}
