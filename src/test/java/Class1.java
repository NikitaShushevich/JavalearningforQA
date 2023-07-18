import org.testng.annotations.Test;

public class Class1 {
    int fnum = 10;
    int num1 = 10;
    int num2 = 10;

    @Test
    public void runner() {
        int resulta = adder(num1, num2);
        int results = substractor(num1, num2);
        int resultm = multipler(num1, num2);
        int resultd = devider(num1, num2);

        System.out.println(resulta);

        System.out.println(results);

        System.out.println(resultm);

        System.out.println(resultd);

    }

    public int adder(int num1, int num2){
        return num1 + num2;
    }

    public int substractor(int num1, int num2){
        return num1 - num2;
    }

    public int multipler(int num1, int num2){
        return num1 * num2;
    }

    public int devider(int num1, int num2){
        return num1 / num2;
    }

}
