public class ReversedSequence {
    public static int[] reverse(int n){
        if (n <= 0) {
            throw new IllegalArgumentException("n must be greater than 0");
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = n - i;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5;

    }
}

