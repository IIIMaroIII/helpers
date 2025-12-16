import java.util.Random;
import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        init();
    }

    static void init() {
        Matrix test = new Matrix();
        Validator validator = new Validator(new Scanner(System.in));

        System.out.println("Please insert the desirable quantity of columns: ");
        int columns = validator.isInteger().getResult();

        System.out.println("Please insert the desirable quantity of rows: ");
        int rows = validator.isInteger().getResult();


        int[][] matrix = test.generateRandomMatrix(columns, rows);
        test.printMatrix(matrix);
        test.multiplyColumns(matrix);
    }

    public int[][] generateRandomMatrix(int columns, int rows) {
        Random random = new Random();
        int[][] integerArr = new int[rows][columns];

        for (int col = 0; col < integerArr.length; col++) {
            for (int row = 0; row < integerArr[col].length; row++) {
                int rndInt = random.nextInt(1, 20);
                integerArr[col][row] = rndInt;
            }
        }
        return integerArr;
    }

    public void printMatrix(int[][] arr) {
        for (int[] row : arr) {
            for (int value : row) {
                System.out.printf("%-5d", value);
            }
            System.out.println();
        }
    }

    public void multiplyColumns(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            int columnsMultiplication = 1;
            for (int col = 0; col < matrix[row].length; col++) {
//                System.out.printf("The row is %d, the col is %d: \n", row, col);
                columnsMultiplication *= matrix[col][row];

            }
            System.out.printf("Row # %d, and result of multiplication is: %d\n", row, columnsMultiplication);
            columnsMultiplication = 1;
        }
    }

}
