import java.util.Arrays;

public class IsThisATriangle {
    public static boolean isTriangle(int a, int b, int c){
        int[] sortedNums = {a, b, c};
        Arrays.sort(sortedNums);
        return sortedNums[0] + sortedNums[1] > sortedNums[2] ;
    }
}
