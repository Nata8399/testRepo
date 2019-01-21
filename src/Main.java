package moduleOneDotOne;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 4, 5, 1, 1, 3};

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmb = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmb;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        int[] newArray = new int[4];

        for (int numbers : array){
            for(int i = 0; i < newArray.length;i++) {
                if (array[numbers] == array[numbers + 1]) {
                    array[numbers + 1] = newArray[i];
                }

            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
