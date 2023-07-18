import org.testng.annotations.Test;

import java.util.Arrays;

public class ArraySort {
    @Test
    public void arrSort(){

        int [] arr = {10, 30, 55, 7, 80, 12};
        Arrays.sort(arr);

        for(int number : arr) {
            System.out.println(number);
        }
    }
}
