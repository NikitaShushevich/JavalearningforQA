public class FlowerPetalsOddOrEven {
    public static boolean isLove(final int flower1, final int flower2) {

        boolean flwr1HasEvenPetals = flower1 % 2 == 0;
        boolean flwr2HasEvenPetals = flower2 % 2 == 0;

        return flwr1HasEvenPetals == !flwr2HasEvenPetals;
    }
}