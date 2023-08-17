import java.util.Arrays;

public class BreakCamelCase {
    public static String camelCase(String input) {
        String[] resArr = input.split("(?=[A-Z])");

        String result = "";
        for (String elem : resArr){
            result += elem + " ";
        }
            return result.trim();
    }
}
