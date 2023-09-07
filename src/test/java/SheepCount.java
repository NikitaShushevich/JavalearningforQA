public class SheepCount {
    public static String countingSheep(int num) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= num; i++) {
            result.append(i).append(" sheep...");
        }

        return result.toString();
    }
}
