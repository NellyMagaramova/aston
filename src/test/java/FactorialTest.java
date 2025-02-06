import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.test.Factorial;

public class FactorialTest {

    private Factorial factorial = new Factorial(); ;

    @Test
    public void test1(){
        int result = factorial.getFactorial(5);
        Assertions.assertEquals(result, 120);
    }

    @Test
    public void test2(){
        int result = factorial.getFactorial(5);
        Assertions.assertNotEquals (result, 121);
    }
}
