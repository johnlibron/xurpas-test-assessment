import java.util.Scanner;

public class JavaAnswer2 {

    public static void main(String[] args) {
        /**
         * Generate N Fibonacci number series, where N is the input of the user.
         * Sample fibonacci number series : 1, 1, 2, 3, 5, 8, 13, 21, 34 ... n
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input N? ");
        int N = scanner.nextInt();

        int firstNumber = 1;
        int secondNumber = 1;
        System.out.println("Fibonacci number series: ");

        for (int i = 0; i <= N; i++) {
            System.out.print(firstNumber + ", ");
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}
