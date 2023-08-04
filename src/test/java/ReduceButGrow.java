public class ReduceButGrow {
    public static int grow(int[] x) {
        int mult = 1;
        for (int element : x) {
            mult *= element;
        }

        return mult;

    }

    public static void main(String[] args) {
        ReduceButGrow.grow(new int[]{1, 2, 3});
    }
}
