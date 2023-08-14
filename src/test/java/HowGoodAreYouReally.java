import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HowGoodAreYouReally {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int[] newArray = new int[classPoints.length + 1];

        for (int i = 0; i < classPoints.length; i++) {
            newArray[i] = classPoints[i];
        }

        newArray[newArray.length - 1] = yourPoints;

        int averagePoint = Arrays.stream(newArray).sum() / newArray.length;

        return yourPoints >= averagePoint;
    }

    public static boolean asdasdasd(int[] classPoints, int yourPoints) {
        return yourPoints >= Arrays.stream(classPoints)
                .boxed()
                .toList()
                .stream()
                .reduce(Integer::sum).get() / classPoints.length;
    }

    public static void main(String[] args) {
        int[] classPoints = {79, 82, 90, 95, 100, 78};
        int yourPoints = 95;
        System.out.println(betterThanAverage(classPoints, yourPoints));
    }
}
