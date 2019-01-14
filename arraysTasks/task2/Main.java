package task;

public class Main {
    public static void main(String[] args) {
        float[] wholeNumbers = {-1, 34, 58, -392, 438, 7, -92};
        for (int i = 0; i < wholeNumbers.length; i++){
            if (i > 0){
                System.out.println("Положительное число");
                break;
            }
            else if(i < 0) {
                System.out.println("Отрицательное число");
                break;
            }
        }
    }
}
