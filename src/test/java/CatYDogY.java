import java.util.Arrays;

public class CatYDogY {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYears = 15;
        int dogYears = 15;

        if(humanYears >= 2 ){
            catYears += 9;
            dogYears += 9;
        }
        for (int i = 3; i <= humanYears ; i++) {
            catYears += 4;
            dogYears += 5;
        }
        return new int[]{humanYears, catYears, dogYears};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(10)));
    }
}
