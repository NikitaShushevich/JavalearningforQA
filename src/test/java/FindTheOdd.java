import java.util.HashMap;
import java.util.Map;

public class FindTheOdd {
    public static int findIt(int[] a) {
        Map<Integer, Integer> count = new HashMap<>();
        int result = 0;
        for (int elem : a) {
            count.put(elem, count.getOrDefault(elem, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                result = entry.getKey();
            }
        }
        return result;
    }

        public static void main (String[]args){
            System.out.println(findIt(new int[]{1, 1, 4, 5, 5}));
        }
    }

