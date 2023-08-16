import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListFiltering {
    public static List<Object> filterList(final List<Object> list) {
        List<Object> filteredList = new ArrayList<>();
        Iterator<Object> iterator = list.iterator();

        while (iterator.hasNext()) {
            Object item = iterator.next();
            if (!(item instanceof String)) {
                filteredList.add(item);
            }
        }

        return filteredList;

    }
}
