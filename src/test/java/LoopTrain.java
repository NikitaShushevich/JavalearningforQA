import org.testng.annotations.Test;

public class LoopTrain {
//    @Test
//    public void array(){
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//        }



    @Test
    public void stringArray(){
        String name = "Nikita";

        for (int iterator = 0; iterator < name.length(); iterator++) {
            System.out.println(name.charAt(iterator));
        }
    }
}
