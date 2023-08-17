import com.github.dockerjava.api.command.UpdateSwarmCmd;

import java.util.Arrays;

public class HighestAndLowest {
    public static String highAndLow(String numbers) {
        String[] numStrings = numbers.split(" ");
        int max = Integer.parseInt(numStrings[0]);
        int min = Integer.parseInt(numStrings[0]);

        for(String el : numStrings){
            if(min > Integer.parseInt(el)) {
                min=Integer.parseInt(el);
            }
            if(max < Integer.parseInt(el)) {
                max=Integer.parseInt(el);
            }
        }

        return max + " " + min;
    }

    public static void main(String[] args) {
        System.out.println(highAndLow("1, 4, 6, 2"));
    }

}

