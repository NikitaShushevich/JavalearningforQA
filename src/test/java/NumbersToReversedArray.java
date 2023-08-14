import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumbersToReversedArray {
    public static int[] digitize(long n) {
        List<Integer> digitList = new ArrayList<>();
        while (n > 0) {
            int digit = (int) (n % 10);
            digitList.add(0, digit);
            n /= 10;
        }
        if (digitList.size() < 2) {
            return new int[]{0};
        }
        int length = digitList.size();
        int[] reversedArray = new int[length];

        for (int i = 0; i < length; i++) {
            reversedArray[i] = digitList.get(length - 1 - i);
        }

        return reversedArray;
    }

    public static void main(String[] args) {
        NumbersToReversedArray numbers = new NumbersToReversedArray();
        System.out.println(Arrays.toString(numbers.digitize(1234567)));
    }
}
