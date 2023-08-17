public class BuildTower {
    public static String[] towerBuilder(int nFloors) {
        String[] tower = new String[nFloors];

        int maxWidth = 2 * nFloors - 1;
        for (int i = 0; i < nFloors; i++) {
            int numStars = 2 * i + 1;
            int numSpaces = (maxWidth - numStars) / 2;

            StringBuilder floor = new StringBuilder();


            for (int j = 0; j < numSpaces; j++) {
                floor.append(" ");
            }


            for (int j = 0; j < numStars; j++) {
                floor.append("*");
            }


            for (int j = 0; j < numSpaces; j++) {
                floor.append(" ");
            }

            tower[i] = floor.toString();
        }

        return tower;
    }

    public static void main(String[] args) {
        towerBuilder(5);
        }
    }

