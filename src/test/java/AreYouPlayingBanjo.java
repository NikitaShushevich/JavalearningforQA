import java.util.Locale;

public class AreYouPlayingBanjo {
    public static String areYouPlayingBanjo(String name) {
        String name1 = name.toLowerCase();
        char charAt0 = name1.charAt(0);
        return charAt0 == 'r' ? name + " plays banjo" : name + " does not play banjo";
    }

    public static void main(String[] args) {


    }

}
