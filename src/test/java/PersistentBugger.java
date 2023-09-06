public class PersistentBugger {
    public static int persistence(long n) {

        if (n < 10) {
            return 0;
        }
        long resultNum = n;
        int result = 0;

        while (resultNum >= 10) {
            String helper = Long.toString(resultNum);
            int helpRes = 1;
            for (int i = 0; i < helper.length(); i++) {
                int num = Character.getNumericValue(helper.charAt(i));
                helpRes *= num;
            }

            resultNum = helpRes;
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(persistence(39));
    }
}
