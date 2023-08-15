import java.util.Arrays;
import java.util.OptionalInt;

public class SmallestIntegerInTheArray {
    public static int findSmallestInt(int[] args) {
        return Arrays.stream(args).min().getAsInt();
    }
}
