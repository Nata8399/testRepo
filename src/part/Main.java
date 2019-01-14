package part;
import java.util.*;
public class Main
{
    public static void main(String [] args)
    {
        int size = 1; // размер матрицы
        int [][] matrix = createMatrix(size, size);
        showMatrix(matrix);
        if(isMagic(matrix))
            System.out.println("Magic square!");
        else
            System.out.println("Not Magic");
    }
    private static int [][] createMatrix(int rows, int columns)
    {
        int [][] matrix = new int [rows][columns];
        for(int i = 0; i < rows; i++)
            for(int j = 0; j < columns; j++)
                matrix [i][j] = new Random().nextInt(10);
        return matrix;
    }
    private static void showMatrix(int [][] matrix)
    {
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix [i].length; j++)
                System.out.print(matrix [i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }
    private static int getSummInRow(int row, int [][] matrix)
    {
        int summ = 0;
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix [i].length; j++)
            {
                if(i == row)
                    summ += matrix [i][j];
            }
        }
        return summ;
    }
    private static int getSummInColumn(int column, int [][] matrix)
    {
        int summ = 0;
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix [i].length; j++)
                if(j == column)
                    summ += matrix [i][j];
        }
        return summ;
    }
    private static int getSummInLeftDiag(int [][] matrix)
    {
        int summ = 0;
        for(int i = 0; i < matrix.length; i++)
            summ += matrix [i][i];
        return summ;
    }
    private static int getSummInRightDiag(int [][] matrix)
    {
        int summ = 0;
        for(int i = 0, j = matrix [i].length - 1;
            i < matrix.length && j >= 0; i++, j--)
            summ += matrix [i][j];
        return summ;
    }
    private static boolean isMagic(int [][] matrix)
    {
        boolean b = true;
        int summ = getSummInRow(0, matrix);
        // т.к. матрица квадратная, упростил...
        for(int i = 0; i < matrix.length; i++)
        {
            if(getSummInRow(i, matrix) != summ || getSummInColumn(i, matrix) != summ ||
                    getSummInLeftDiag(matrix) != summ || getSummInRightDiag(matrix) != summ)
                b = false;
        }
        return b;
    }
}

