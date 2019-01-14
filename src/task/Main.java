package task;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 5, 3, 4};
        int[] newArr = new int[6];

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < newArr.length; j++) {
                if (arr[i] > arr[i + 1]) {
                    arr[i] = arr[i + 1];
                    newArr[j] = arr[i];
                }
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
