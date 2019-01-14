package task;

public class Main {
    private static int[] getArray(final int... nums) {
        int count = 0;
        for (int num : nums)
            if (num == 0)
                count++;
        int arrNums[] = new int[count];
        count = -1;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 0)
                arrNums[++count] = i;
        return arrNums;
    }

    public static void main(String[] args) {
        int arr[] = getArray(1, 0, 0, 1, 0, 1, 1, 0, 1, 0);
        for (int anArr : arr)
            System.out.println(anArr + " ");
    }
}
