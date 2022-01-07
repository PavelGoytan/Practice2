package TaskB.Chapter6;

import java.util.Scanner;

/**
 * Разработать проект управления процессами на основе создания и реализа-
 * ции интерфейсов для следующих предметных областей:
 * 1. Полиграфические издания. Возможности: оформить договор; открыть\
 * редактировать\верстать издание; отправить на печать; отказаться от изда-
 * ния; оплатить издание; возобновить\закрыть издание. Добавить специали-
 * зированные методы для Книги, Журнала, Учебного пособия.
 */
public class Edition implements Printable {
    private int count;
    private  StringBuilder stringBuilder;

    public Edition() {
        this.stringBuilder = new StringBuilder();
    }

    @Override
    public void drawUpContract() {
        count+=1;
        String contract = "Contract number: "+count;
        System.out.println(contract);
    }

    @Override
    public void typeset() {
        Scanner scanner = new Scanner(System.in);
        boolean v = false;
        while(!v) {
            String n = scanner.next();
            this.stringBuilder.append(" ").append(n);
            System.out.println(stringBuilder);
            if(n.equals("END")){
                v=true;
            }
        }
    }

    @Override
    public void toPrint() {
        System.out.println(this.stringBuilder);

    }

    @Override
    public void refuseToPublish() {

    }

    @Override
    public void payFor() {

    }

    @Override
    public void resumeCloseEdition() {

    }
}
