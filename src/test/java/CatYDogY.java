public class CatYDogY {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYears = 15;
        if(humanYears >= 2){
            catYears += 9;
        }
        for (int i = 0; i <= humanYears ; i++) {
            catYears += 4;
        }
        int dogYears = 15;
        if (humanYears >= 2){
            dogYears += 9;
        }
        for (int i = 0; i < humanYears; i++) {
            dogYears += 5;
        }

        return new int[]{humanYears, catYears, dogYears};
    }
}
