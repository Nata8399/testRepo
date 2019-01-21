package trianleSquare;

public class Triangle {
    public static void main(String[] args) {
        System.out.println(trianleSquare(10,6,9));
    }
    public static double trianleSquare(int a,int b,int c){
        double semiPerimeter = (a + b + c)/2;
        double square = Math.sqrt(semiPerimeter*(semiPerimeter - a)*(semiPerimeter-b)*(semiPerimeter-c));
        return square;
    }
}
