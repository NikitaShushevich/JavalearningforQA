public class AreaOrPerimeter {
    public static int areaOrPerimeter(int l, int w) {
        int sqrArea = l * w;
        int recPerim = (l + w) * 2;
        if (l == w) {
            return sqrArea;
        } else {
            return recPerim;
        }
    }
}