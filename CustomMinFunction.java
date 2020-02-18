import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction {
    private static double getMin (int[] numbers) {
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int[] numbers = new int[input.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        int minFunc = (int) getMin(numbers);

        System.out.println(minFunc);
    }
}
