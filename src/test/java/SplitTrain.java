import org.testng.annotations.Test;


public class SplitTrain {
    @Test

    public void splitString(){

        String sentence = "Hello world here are split functionality test";

        String [] splitted = sentence.split(" ");

        for (String word : splitted)
            System.out.println(word);

    }
    @Test
    public void emailSplt(){

        String email = "nikita.shu@gmail.com";
        String [] emailSplitted = email.split("@");
        System.out.println("YOUR USERNAME IS:" + emailSplitted[0]);

    }
}
