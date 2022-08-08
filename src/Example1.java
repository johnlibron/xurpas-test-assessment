import java.util.Arrays;
import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
        /**
         * 1. Write a program which takes 3 numbers as input and generates a
         *    3 dimensional array based on those numbers.
         *    Populate each cell in the array with the product of the indexes.
         *
         *    For example, the provided input is:
         *    Input 1: 2
         *    Input 2: 2
         *    Input 3: 2
         *
         *    This means a 3D array must be created with dimensions [2][2][2]
         *    and each cell must be populated by the product of its index value.
         *    For example: a cell at index 0, 0, 1 will have a value of 0.
         *    Another cell at index 1, 1, 1 will have a value of 1.
         *
         *    Output: [ [ [0,0] [0,0] ] [ [0,0] [0,1] ] ]
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input 1: ");
        int x = scanner.nextInt();
        System.out.println("Input 2: ");
        int y = scanner.nextInt();
        System.out.println("Input 3: ");
        int z = scanner.nextInt();

        int[][][] array3D = new int[x][y][z];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    array3D[i][j][k] = i * j * k;
                }
            }
        }

        System.out.println(Arrays.deepToString(array3D));
    }
}