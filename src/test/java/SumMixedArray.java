import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumMixedArray {


    public static int sum(List<?> mixed) {
        int summ = 0;
        for (Object element : mixed) {
            summ += Integer.parseInt(element.toString());
        }
        return summ;
    }

    public static void main(String[] args) {
        System.out.println(sum(Arrays.asList(9, 3, "7", "3")));
    }
}

