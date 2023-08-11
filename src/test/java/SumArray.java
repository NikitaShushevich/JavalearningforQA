import java.util.Arrays;

public class SumArray {
    public static double sum(double[] numbers) {
//        if (numbers.length == 0) {
//            return 0;
//        } else {
//            double total = 0;
//            for (double num : numbers) {
//                total += num;
//            }
//            return total;
//        }
        return Arrays.stream(numbers).sum();
    }

    public static void main(String[] args) {
        double[] numbers = { 2, 3, 4, 6, 10.1 };
        double result = sum(numbers);
        System.out.println(result);
    }
}
