package TaskB.Chapter7;

public class Number implements Task4{

    @Override
    public boolean dividedBy(int a) {
        return a%13==0;
    }
}
