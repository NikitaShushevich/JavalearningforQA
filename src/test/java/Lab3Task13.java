import java.util.ArrayList;
import java.util.Arrays;

public class Lab3Task13 {
    public static void main(String[] args) {
        int [] firstArr = {10, 20, 5, 6, 50};
        int [] secondArr = {1, 2, 4, 9, 99};


//        int [] finalArr = new int[firstArr.length + secondArr.length];
//        System.arraycopy(firstArr, 0, finalArr, 0, firstArr.length);
//        System.arraycopy(secondArr, 0,finalArr, firstArr.length, secondArr.length);

        ArrayList<Integer> result = new ArrayList<>();
        for(int i : firstArr){
            result.add(i);
        }
        for(int i : secondArr){
            result.add(i);
        }


        System.out.println(result);
    }
}
