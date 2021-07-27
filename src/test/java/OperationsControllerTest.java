import org.testng.Assert;
import org.testng.annotations.Test;

public class OperationsControllerTest {
    @Test(testName =  "Deveria retornar 5 a soma")
    public void sumTest(){

        int result = OperationsController.sum(2,3);

        Assert.assertEquals(5, result);
    }
    @Test(testName =  "Deveria retornar 1 a subtração")
    public void subtractionTest(){

        int result = OperationsController.sub(2,3);

        Assert.assertEquals(-1, result);
    }
    @Test(testName =  "Deveria retornar 6 a multiplicação")
    public void multiplicationTest(){

        int result = OperationsController.mult(2,3);

        Assert.assertEquals(6, result);
    }
    @Test(testName =  "Deveria retornar 3 a divisão")
    public void divisionTest(){

        int result = OperationsController.div(6,2);

        Assert.assertEquals(3, result);
    }
}
