import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstUnitTest {
    @Test

    public void testSum(){
        Assert.assertTrue(mult(5,5) == 10);
        Assert.assertTrue(mult(10,5) == 15);
        Assert.assertTrue(mult(1,1) == 2);
        Assert.assertTrue(mult(3,2) == 5);
    }

    @Test
    public void testSubstr(){
        Assert.assertTrue(substr(5,3) == 2);
        Assert.assertTrue(substr(6,3) == 3);
        Assert.assertTrue(substr(10,8) == 2);
        Assert.assertTrue(substr(0,0) == 0);

    }

    public int mult(int a, int b){
        return a + b;
    }

    public int substr(int a, int b){
        return a - b;


    }
}
