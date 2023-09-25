import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrefixPostfixDecrementIncrement {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.add("4");

        stringList.add(1, "hello");
        System.out.println(stringList.toString());

    }
}
