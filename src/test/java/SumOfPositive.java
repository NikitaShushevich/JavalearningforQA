import java.util.ArrayList;
import java.util.Arrays;

public class SumOfPositive {
    public static int sum(int[] arr) {
//
//        int sum=0;
//
//        for (int elem : arr){
//            if (elem >= 0){
//                sum+=elem;
//            }
//        }
//        return sum;
        return Arrays.stream(arr).filter(x -> x >= 0).sum();
    }
}
