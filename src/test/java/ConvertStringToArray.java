import java.util.Arrays;

public class ConvertStringToArray {
    public static String[] stringToArray(String s) {
    String[] sArr = s.split(" ");

    return sArr;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(stringToArray("hello world")));


    }
}
