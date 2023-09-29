import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DetectPangram {
    public static boolean check(String sentence){
        String lower = sentence.toLowerCase();
        Set<Character> alphabetSet = new HashSet<>(Arrays.asList(
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        ));

        for (char elem : lower.toCharArray()){
            alphabetSet.remove(elem);
        }
        return alphabetSet.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(check("abcdefghijklmnopqrstuvwxy"));
    }
}
