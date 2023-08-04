
public class ANeedleInTheHaystack {
    public static String findNeedle(Object[] haystack) {
        String position = "";
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == "needle") {
                position = "found the needle at position" + i;
            }
        }
        return position;
    }
}




