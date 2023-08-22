public class TrueOfFalse {
    public static int testTrueFalse(int n) {
        int count = 0;

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n >= 2 && n < 4) {
            return n - 1;
        }
        if (n >= 4 && n < 7) {
            return Math.round(n / 3f);
        } else {
            return n % 3;

        }
    }

    public static void main(String[] args) {
        System.out.println(testTrueFalse(7));
    }
}
