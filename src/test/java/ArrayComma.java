import java.lang.reflect.Array;

public class ArrayComma {
    public static String printArray(Object[] array) {
        StringBuilder result = new StringBuilder();
        for (Object elem : array){
            result.append(elem + ",");
        }
        result.setLength(result.length()-1);
        return result.toString();
    }
}
