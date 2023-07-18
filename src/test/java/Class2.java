import org.testng.annotations.Test;

public class Class2 {
    @Test
    public void num(){
        Class1 class1 = new Class1();


        System.out.println(class1.adder(class1.num1, class1.num2));


    }
}
