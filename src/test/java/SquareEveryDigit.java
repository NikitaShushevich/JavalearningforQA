import java.util.ArrayList;
import java.util.List;

public class SquareEveryDigit {
    public int squareDigits(int n) {
        List<Integer> digitList = new ArrayList<>();
        while (n > 0) {
            int digit = n % 10;
            digitList.add(0, digit);
            n /= 10;
        }
        StringBuilder s = new StringBuilder();
        for (int dig : digitList){
            int sqrDig = dig * dig;
            s.append(sqrDig);
        }
        return Integer.parseInt(String.valueOf(s));
    }
    public void main(String[] args) {
        int number = 526;
        int digitInput = squareDigits(number);
        System.out.println(digitInput);
    }
}
