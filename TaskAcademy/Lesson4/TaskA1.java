package TaskAcademy.Lesson4;

/**
 * напишите в нем метод
 * static void printMulTable() для вывода на консоль таблицы умножения в следующем виде (с
 * учетом пробелов):
 */
public class TaskA1 {
    public static void main(String[] args) {
        printMulTable();
        String line = "12.3 11.4 15.6 16.7 17.4 78.26";
        double[] array = InOut.getArray(line);
        printArray(array,5);
        Helper.sortDouble(array,true);
        printArray(array,4);

    }

    private static void printArray(double[] array,int cols) {
        int col=0;
        for (int i = 0; i< array.length; i++) {
            System.out.printf("%3s%d%3s%-3.4f%3s","V[ ",i+1," ]=", array[i],"");
            col++;
            if(col%cols==0||i== array.length-1){
                System.out.println();
            }
        }
    }

    static void  printMulTable(){
        for (int i = 2; i <=9; i++) {
            for (int j = 2; j <=9; j++) {
                System.out.printf("%1d%1s%1d%1s%2d%2s",i,"*",j,"=",i*j,"");
            }
            System.out.println();
        }
    }
}
