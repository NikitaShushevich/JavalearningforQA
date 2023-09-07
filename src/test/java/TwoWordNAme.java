import java.util.List;

public class TwoWordNAme {
    public static String abbrevName(String name) {
        String[] divName = name.split(" ");
        char firstLetter = divName[0].charAt(0);
        char secondLetter = divName[1].charAt(0);

        return (firstLetter + "." + secondLetter).toUpperCase();
    }
}
