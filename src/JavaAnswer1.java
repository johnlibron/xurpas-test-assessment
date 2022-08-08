import java.util.*;
import java.util.stream.Collectors;

public class JavaAnswer1 {

    public static void main(String[] args) {
        /**
         * Please provide solutions for the following problems:
         * N =
         * 1. Generate N random numbers. Where N is the input of the user. Output the numbers generated.
         * 2. Sort the generated numbers in ascending order. Output the sorted numbers.
         * 3. Sort the generated numbers in descending order. Output the sorted numbers.
         * 4. Given the N random numbers generated from (1) output the ____ highest number
         * 5. Given the N random numbers generated from (1) output the ____ lowest number
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many generated numbers you want to print? ");
        int N = scanner.nextInt();

        Random random = new Random();
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            randomNumbers.add(random.nextInt());
        }

        System.out.println("Generated numbers: " + randomNumbers);

        List<Integer> sortedNumbers = randomNumbers.stream().sorted().collect(Collectors.toList());
        List<Integer> reverseOrderNumbers = randomNumbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println("Ascending order: " + sortedNumbers);
        System.out.println("Descending order: " + reverseOrderNumbers);
        System.out.println("Highest number: " + sortedNumbers.get(N - 1));
        System.out.println("Lowest number: " + sortedNumbers.get(0));
    }
}
