public class TheFeastOfManyBeasts {
    public static boolean feast(String beast, String dish) {
        char firstBeast = beast.charAt(0);
        char lastBeast = beast.charAt(beast.length() - 1);
        char firstDish = dish.charAt(0);
        char lastDish = dish.charAt(dish.length() - 1);

        return firstBeast == firstDish && lastBeast == lastDish;

    }
}
