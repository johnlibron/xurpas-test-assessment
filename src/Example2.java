import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {
        /**
         * 2. Given a string containing substrings separated by newlines (paragraphs) and
         *    periods/question marks/exclamation marks (sentences) and a max word count (integer),
         *    write a program that only includes full sentences whose total word count fall
         *    under the provided max word count value.
         *    Inclusion of sentences should traverse the string from the first sentence onward.
         *
         *    Example:
         *    String input: "How much is that doggie in the window? I do hope that doggie's for sale."
         *    Max word count: 9
         *    Output: "How much is that doggie in the window?"
         *
         *    Example:
         *    String input: "How much is that doggie in the window? I do hope that doggie's for sale."
         *    Max word count: 100
         *    Output: "How much is that doggie in the window? I do hope that doggie's for sale."
         *
         *    Example:
         *    String input: "How much is that doggie in the window? I do hope that doggie's for sale."
         *    Max word count: 1
         *    Output: ""
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("String input: ");
        String stringInput = scanner.nextLine();
        System.out.println("Max word count: ");
        int maxWordCount = scanner.nextInt();

        StringBuilder output = new StringBuilder();
        int currentCount = 0;
        int lastIndexOfEachSentence = 0;
        String[] sentences = stringInput.split("[\\n.?!]");

        for (int i = 0; i < sentences.length; i++) {
            String[] wordsInTheSentence = sentences[i].trim().split(" ");
            currentCount += wordsInTheSentence.length;
            if (currentCount > maxWordCount) {
                break;
            }
            lastIndexOfEachSentence += sentences[i].length();
            String delimiterInTheSentence = stringInput.substring(lastIndexOfEachSentence, ++lastIndexOfEachSentence);
            output.append(sentences[i]).append(delimiterInTheSentence);
        }
        System.out.println("Output: " + output);
    }
}
