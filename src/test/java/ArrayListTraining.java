import java.util.ArrayList;

public class ArrayListTraining {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.ensureCapacity(10);
        // Add 10 elements to the ArrayList
        stringList.add("Element 1");
        stringList.add("Element 2");
        stringList.add("Element 3");
        stringList.add("Element 4");
        stringList.add("Element 5");
        stringList.add("Element 6");
        stringList.add("Element 7");
        stringList.add("Element 8");
        stringList.add("Element 9");
        stringList.add("Element 10");
        stringList.add("Element 11");

        System.out.println(stringList.size());

        // Print the elements in the ArrayList
        for (String element : stringList) {
            System.out.println(element);
        }
    }
}
