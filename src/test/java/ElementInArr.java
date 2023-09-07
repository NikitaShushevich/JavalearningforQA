public class ElementInArr {
    public static boolean check(Object[] a, Object x) {
        boolean elementIsPresent = false;

        for (Object o : a) {
            if (o == x) {
                elementIsPresent = true;
                break;
            }
        }
        return elementIsPresent;
    }
}
