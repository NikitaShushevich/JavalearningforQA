import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LarioAndMuigiPipeProblem {
    public static int[] pipeFix(int[] numbers) {
        int min = numbers[0]; // Find the minimum value
        int max = numbers[numbers.length - 1]; // Find the maximum value
        int[] result = new int[max - min + 1]; // Create a new array with the correct size

        for (int i = min, j = 0; i <= max; i++, j++) {
            result[j] = i; // Fill the result array with consecutive values
        }

        return result;
    }
    }