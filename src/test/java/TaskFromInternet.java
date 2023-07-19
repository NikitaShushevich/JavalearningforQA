import java.util.Scanner;

public class TaskFromInternet {
//    public static String even_or_odd(int number) {
//        return number % 2 == 0 ? "Even" : "Odd";
//    }


    //    public static void main(String[] args) {
//        boolean value = true;
//        String valueToStr = String.valueOf(value);
//        System.out.println(valueToStr);
//
//    }
    public static void main(String[] args) {
        System.out.println(getGrade(95, 84, 98));
    }

    public static char getGrade(int s1, int s2, int s3) {
        int average = (s1 + s2 + s3) / 3;
        if (90 <= average && average <= 100) {
            return 'A';
        } else if (80 <= average && average <= 90) {
            return 'B';
        } else if (70 <= average && average <= 80) {
            return 'C';
        } else if (60 <= average && average <= 70) {
            return 'D';
        } else if (0 <= average && average <= 60) {
            return 'F';
        }

        return 0;

    }
}