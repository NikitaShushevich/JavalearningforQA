import java.util.Arrays;

public class WelcomeToTheCity {
    public String sayHello(String[] name, String city, String state) {
        String arrToStr = "";
        for (String elem : name) {
            arrToStr += elem + " ";
        }

        return "Hello, " + arrToStr.trim() + "! Welcome to " + city + ", " + state + "!";
    }
}
