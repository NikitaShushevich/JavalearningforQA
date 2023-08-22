public class SentenceSmach {
    public static String smash(String... words) {
        String result = "";

        for(String elem : words){
            result += elem + " ";
        }
        return result.trim();
    }
}
