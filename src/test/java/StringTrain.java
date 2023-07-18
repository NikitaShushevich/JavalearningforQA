import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Random;

public class StringTrain {
    @Test
    public void stringTr() {
        String introduction = "Hello my name is Nikita";
        System.out.println(introduction.length());

        String [] arr ={"car1", "car2", "car3"};
        System.out.println(Arrays.toString(arr));
    }


}
