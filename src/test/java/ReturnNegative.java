public class ReturnNegative {
    public static int makeNegative(final int x) {

        return x == 0 ? 0 : x>= 0 ? -x : Math.abs(x);

    }

    public static void main(String[] args) {
        System.out.println(makeNegative(1));
    }
}
