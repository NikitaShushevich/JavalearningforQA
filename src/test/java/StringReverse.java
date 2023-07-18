import org.testng.annotations.Test;

public class StringReverse {

    @Test
    public void stringReverse() {

        String string = "Hello World";

        for (int i = string.length() - 1; i >= 0; i--) {
            System.out.print(string.charAt(i));
        }
    }
    @Test
    public void stringReverse2(){
        StringBuilder stringBuilder = new StringBuilder("Goodbye world");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }

//    public void stringReverse3(){
//
//    }
}
