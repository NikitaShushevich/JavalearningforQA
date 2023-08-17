public class NameOnBillboard {
    public static int billboard(String name, int price) {
        int nameLength = Integer.parseInt(String.valueOf(name.length()));
        int count = 0;
        for (int i = 0; i < nameLength; i++) {
            count += price;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(billboard("1234567890", 30));
    }
}
