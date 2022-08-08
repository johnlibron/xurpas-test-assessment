import java.util.Scanner;

public class JavaAnswer3 {

    public static void main(String[] args) {
        /**
         * Generate a diamond shaped output with [(N x 2) - 1] lines. Where N is the input of the user.
         * Sample: Input = 7, 13 lines.
         *
         *                    1
         *                   222
         *                  33333
         *                 4444444
         *                555555555
         *               66666666666
         *              7777777777777
         *               66666666666
         *                555555555
         *                 4444444
         *                  33333
         *                   222
         *                    1
         *
         * Input = 3, lines = 5
         *
         *                   1
         *                  222
         *                 33333
         *                  222
         *                   1
         *
         * Input = 5, lines = 9
         *
         *                   1
         *                  222
         *                 33333
         *                4444444
         *               555555555
         *                4444444
         *                 33333
         *                  222
         *                   1
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input N? ");
        int N = scanner.nextInt();
        int i, j, space = N - 1;
        System.out.println("Input = " + N + ", lines = " + (N + space));
        System.out.println();
        for (j = 1; j <= N; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            for (i = 1; i <= 2 * j - 1; i++) {
                System.out.print(j);
            }
            System.out.println();
            space--;
        }
        space = 1;
        for (j = 1; j <= N - 1; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            for (i = 1; i <= 2 * (N - j) - 1; i++) {
                System.out.print(N - space);
            }
            System.out.println();
            space++;
        }
    }
}
