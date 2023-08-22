public class Dollars {
    public static double moneyValue(String input) {
        boolean isNegative = false;

        input = input.trim();

        if (input.startsWith("$")) {
            input = input.substring(1);
        }
        input = input.replace(" ", "").replace(",", "");

        if (input.startsWith("-")) {
            isNegative = true;
            input = input.contains("$") ? input.substring(2) : input.substring(1);
        }
        try {
            double number = Double.parseDouble(input);
            return isNegative ? -number : number;
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }

    public static void main(String[] args) {
        System.out.println(moneyValue("$-100"));
    }
}
