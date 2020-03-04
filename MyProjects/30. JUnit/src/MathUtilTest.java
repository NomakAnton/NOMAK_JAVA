import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class MathUtilTest {
    private final static int NOT_PRIME = 125;
    private final static int IS_PRIME = 113;
    private final static int NOT_PRIME_SQR = 169;

    private MathUtil mathUtil;

    @Before
    public void setUp(){
        System.out.println("In setUp");
        mathUtil = new MathUtil();
    }
    @Test
    public void testIsPrimeOnPrime(){
        boolean expected = true;
        boolean actual = mathUtil.isPrime(IS_PRIME);
        assertEquals(expected,actual);
    }
    @Test
    public void testIsPrimeOnNotPrime(){
        boolean expected = false;
        boolean actual = mathUtil.isPrime(NOT_PRIME);
        assertEquals(expected,actual);
    }
    @Test
    public void testIsPrimeOnNotPrimeSQR(){
        boolean expected = false;
        boolean actual = mathUtil.isPrime(NOT_PRIME_SQR);
        assertEquals(expected,actual);
    }
}
