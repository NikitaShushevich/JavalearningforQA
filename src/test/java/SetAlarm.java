public class SetAlarm {
    public static boolean setAlarm(boolean employed, boolean vacation) {
    return (employed || !vacation) && employed ^ vacation;
    }

    public static void main(String[] args) {
        System.out.println(setAlarm(false, true));
    }
}
