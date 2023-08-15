

public class NonConcecutiveNumber {
    static Integer find(final int[] array) {
        if (array.length < 2) {
            return null;
        }
        int j = array[0];
        int concec = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == j) {
                j++;
                sum++;
            } else {
                concec = array[i];
                break;
            }
            if (sum == array.length) {
                return null;
            }

        }
        return concec;
    }
}
