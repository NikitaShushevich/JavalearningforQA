import java.util.Arrays;

public class SqrSum {
    public static int squareSum(int[] n) {
        for (int i = 0; i < n.length; i++) {
            n[i] = n[i] * n[i];
        }
        return Arrays.stream(n).sum();
    }
}
