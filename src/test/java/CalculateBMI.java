public class CalculateBMI {
    public static String bmi(double weight, double height) {
        double bmi = (int) (weight / (height * height));
        return bmi <= 18.5 ? "Underweight" : bmi <= 25 ? "Normal" : bmi <= 30 ? "Overweight" : "Obese";
    }

    public static void main(String[] args) {
        System.out.println(bmi(101, 1.8));
    }
}
