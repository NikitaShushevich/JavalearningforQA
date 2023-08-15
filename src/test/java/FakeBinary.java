import java.util.Arrays;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        String[] arr = numberString.split("");
        int[] numArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            numArr[i] = Integer.parseInt(arr[i]);
        }

        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] >= 5) {
                numArr[i] = 1;
            } else {
                numArr[i] = 0;
            }
        }
        String result = "";
        for (int elem : numArr){
            result += elem;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fakeBin("44556622"));
    }
}
