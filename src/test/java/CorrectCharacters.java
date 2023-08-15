import com.github.dockerjava.api.command.UpdateSwarmCmd;

public class CorrectCharacters {
    public static String correct(String string) {
        return string.replaceAll(String.valueOf(5), "S")
                .replaceAll(String.valueOf(0), "O")
                .replaceAll(String.valueOf(1), "I");
    }

    public static void main(String[] args) {
        System.out.println(correct("111000555"));
    }
}
