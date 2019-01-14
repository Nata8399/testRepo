package task;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 4, 9, 12, 10, 57};
        int k = 2;
        int sum = 0;

        for (int i = 0; i < array.length;i++) {
            if(array[i] % k == 0) {
                sum = sum + array[i];
            }
            else;
            continue;
        }
        System.out.println(sum);
    }
}
