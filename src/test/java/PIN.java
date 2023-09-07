public class PIN {
    public static boolean validatePin(String pin) {
    if (pin.length() == 4){
        return true;
    } else if (pin.length() == 6){
        return true;
    } else {
        return false;
    }

    }

    public static void main(String[] args) {
        System.out.printf(String.valueOf(validatePin("1234")));
    }
}
