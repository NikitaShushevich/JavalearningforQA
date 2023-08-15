import java.math.BigDecimal;

public class SumOfTheFirstNthTermOfSeries {
    public static String seriesSum(int n) {
        if (n == 0) {
            return String.format("%.2f", 0.00);
        }
        double one = 1.00;
        double oneFour = 4.00;
        for (int i = 2; i <= n; i++) {
            one += 1.00 / oneFour;
            oneFour += 3;
        }
        return String.format("%.2f", one);

    }

    public static void main(String[] args) {
        float num = 1.2345F;
        System.out.println(String.format("%.2f", num));
    }
}
