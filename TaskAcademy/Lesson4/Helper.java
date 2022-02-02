package TaskAcademy.Lesson4;

public class Helper {
    static void sortDouble(double[] array, boolean upDirection){
        for (int start = 0; start < array.length-1; start++) {
            int least = start;
            for (int j = start+1; j <array.length ; j++) {
                if((array[j]<array[least])){
                    least=j;
                }
            }
            double tmp = array[start];
            array[start] = array[least];
            array[least] = tmp;
        }

    }
}
