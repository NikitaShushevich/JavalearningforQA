import java.text.DecimalFormat;

public class MpgToKpl {
    public static float mpgToKPM(final float mpg) {
        float kpl = (mpg * 1.609344F) / 4.54609188F;
        DecimalFormat df = new DecimalFormat("#.##");
        return Float.parseFloat(df.format(kpl));
    }

    public static void main(String[] args) {
        System.out.println(mpgToKPM(30));
    }
}
