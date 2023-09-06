public class MoneyMoney {
    public static int calculateYears(double principal, double interest, double tax, double desired) {
        if (desired <= principal) {
            return 0;
        }

        int years = 0;
        while (principal < desired) {
            double accruedInterest = principal * interest;
            double taxedInterest = accruedInterest * (1 - tax);
            principal += taxedInterest;
            years++;
        }

        return years;
    }
}
