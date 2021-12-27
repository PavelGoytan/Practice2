package TaskB.Chapter3;

import TaskB.Chapter3.Service.RandomSimbol;

import java.util.Random;

/**
 * Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки,
 * Номер банковского счета.
 * Создать массив объектов. Вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится
 * в заданном интервале.
 */
public class Customer {
    private final int id;
    private final String firstName;
    private final String secondName;
    private final String therdName;
    private final String adress;
    private final long crediteCard;

    public Customer(int id, String firstName, String secondName, String therdName, String adress, long crediteCard) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.therdName = therdName;
        this.adress = adress;
        this.crediteCard = crediteCard;
    }

    public static Customer[] customers(int c) {
        Random random = new Random();
        int s = random.nextInt(30);
        long l = random.nextLong(1000000000);
        Customer[] arrayCustomer = new Customer[c];
        for (int i = 0; i < arrayCustomer.length; i++) {
            arrayCustomer[i] = new Customer(i, RandomSimbol.firstChar() + "oitan",
                    RandomSimbol.firstChar() + "avel"
                    , RandomSimbol.firstChar() + "ladimirovich", RandomSimbol.firstChar() + "ovsky st " + s
                    , l);
            s = random.nextInt(30);
            l = random.nextLong(1000000000);
        }
        return arrayCustomer;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getTherdName() {
        return therdName;
    }

    public String getAdress() {
        return adress;
    }

    public long getCrediteCard() {
        return crediteCard;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", therdName='" + therdName + '\'' +
                ", adress='" + adress + '\'' +
                ", crediteCard=" + crediteCard +
                '}';
    }
}
