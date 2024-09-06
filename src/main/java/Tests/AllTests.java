package Tests;
import Logic.logic;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class AllTests {

    @Test
    public void testQuaternaryToDecimal(){
        String testVar = "33";
        Integer expectedVar = 15;

        logic calc = new logic();
        Integer result = calc.quaternaryToDecimal(testVar);
        assertEquals(expectedVar, result);
    }

    @Test
    public void testDecimalToQuaternary(){
        Integer testVar = 5;
        String expectedVar = "11";

        logic calc = new logic();
        String result = calc.decimalToQuaternary(testVar);
        assertEquals(expectedVar, result);
    }

    @Test
    public void testAdd(){
        String testFirstNum = "21";
        String testSecondNum = "3";
        String expectedVar = "30";

        logic calc = new logic();
        String result = calc.add(testFirstNum, testSecondNum);
        assertEquals(expectedVar, result);
    }

    @Test
    public void testSubtract(){
        String testFirstNum = "13";
        String testSecondNum = "11";
        String expectedVar = "2";

        logic calc = new logic();
        String result = calc.subtract(testFirstNum, testSecondNum);
        assertEquals(expectedVar, result);
    }

    @Test
    public void testMultiply(){
        String testFirstNum = "3";
        String testSecondNum = "3";
        String expectedVar = "21";

        logic calc = new logic();
        String result = calc.multiply(testFirstNum, testSecondNum);
        assertEquals(expectedVar, result);
    }

    @Test
    public void testDivide(){
        String testFirstNum = "33";
        String testSecondNum = "3";
        String expectedVar = "11";

        logic calc = new logic();
        String result = calc.divide(testFirstNum, testSecondNum);
        assertEquals(expectedVar, result);
    }

    @Test
    public void testSquareRoot(){
        String testNum = "21";
        String expectedVar = "3";

        logic calc = new logic();
        String result = calc.squareRoot(testNum);
        Assertions.assertEquals(expectedVar, result);
    }

    @Test
    public void testSquare(){
        String testNum = "2";
        String expectedVar = "10";
        
        logic calc = new logic();
        String result = calc.square(testNum);
        Assertions.assertEquals(expectedVar, result);
    }
}
