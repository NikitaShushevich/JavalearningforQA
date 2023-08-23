import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NotVerySecrue {
    public static boolean alphanumeric(String s) {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9]+$");
        Matcher matcher = pattern.matcher(s);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(alphanumeric("hello"));
    }
}
