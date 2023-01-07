import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorTest {
    @Test
    public void testAddition(){
        Calculator calculator= new Calculator();
        Assertions.assertEquals( 4,calculator.add(2,2));
    }

    @Test
    public void testDivision(){
        Calculator calculator= new Calculator();
        Assertions.assertEquals(0, calculator.divide(5,0));

    }

    @Test
    public void testAddition2(){
        Calculator calculator= new Calculator();
        Assertions.assertEquals(8.0,calculator.add(4,4));
    }

    @ParameterizedTest
    @ValueSource(ints = {13,25,3,41,5,6,75,80})
    public void testAddition3(int arg){
        Calculator calculator= new Calculator();
        Assertions.assertEquals(calculator.add(arg,arg) ,arg*2);
    }

}
